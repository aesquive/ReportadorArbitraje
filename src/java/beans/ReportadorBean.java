/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import arbitreador.IArbitraje;
import base.Dao;
import baseMeta.base.DaoMeta;
import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import objetos.*;
import org.hibernate.criterion.Restrictions;
import util.VectorXY;

/**
 *
 * @author alberto
 */
public class ReportadorBean {

    private List<VectorXY> ligas;
    private final int dias = 12;
    private String ruta = "/var/www/";

    public ReportadorBean() {
        calcularArbitrajes();
    }

    private void calcularArbitrajes() {
        Class[] arr = new Class[]{ArbGolAu.class, ArbGolInf.class, ArbMta.class};
        String[] nombre = new String[]{"GolSHF", "GolInfonavit", "Meta"};

        this.setLigas(new LinkedList<VectorXY>());

        for (int t = 0; t < arr.length; t++) {
            VectorXY vec = new VectorXY(nombre[t], generarArchivoArchivo(arr[t], nombre[t].trim()));
            getLigas().add(vec);
        }

    }

    private String generarArchivoArchivo(Class clase, String nombreArchivo) {
        Dao dao = new Dao();
        Map<IArbitraje, List<IArbitraje>> mapeo = new HashMap<IArbitraje, List<IArbitraje>>();
        List<IArbitraje> lista = dao.getTabla(clase);
        int[] seleccionado = new int[lista.size()];
        for (int t = 0; t < lista.size(); t++) {
            System.out.println("///////////////////");
            System.out.println(seleccionado[t]);
            List<IArbitraje> temporal = new LinkedList<IArbitraje>();
            IArbitraje actual = lista.get(t);
            if (seleccionado[t] == 0) {
                for (int j = t + 1; j < lista.size(); j++) {
                    seleccionado[t] = 1;
                    IArbitraje recorrido = lista.get(j);
                    if (actual.getCve().equals(recorrido.getCve()) && diferenciaDias(actual, recorrido) < dias) {
                        temporal.add(recorrido);
                        seleccionado[j] = 1;
                    }
                }

            }
            mapeo.put(actual, temporal);
        }
        return formarArchivo(dao, mapeo, nombreArchivo);
    }

    private String formarArchivo(Dao dao, Map<IArbitraje, List<IArbitraje>> mapeo, String nombreArchivo) {
        Set<IArbitraje> keySet = mapeo.keySet();
        List<String> lineas = new LinkedList<String>();
        for (IArbitraje ia : keySet) {
            StringBuilder builder = new StringBuilder();
            String cadena = getInfo(dao, nombreArchivo, ia, true);
            if (cadena != null && mapeo.get(ia) != null && !mapeo.get(ia).isEmpty()) {

                builder.append(cadena + ",");
                List<IArbitraje> atr = mapeo.get(ia);
                for (IArbitraje elem : atr) {
                    builder.append(getInfo(dao, nombreArchivo, elem, false) + ",");
                }
            }
            if (!builder.toString().equals("")) {

                lineas.add(builder.toString());
                System.out.println("agregue" + builder.toString());
            }

        }
        System.out.println("antes de escribir el archivo "+nombreArchivo);
        return escribirArchivo(nombreArchivo, lineas);
    }

    private int diferenciaDias(IArbitraje actual, IArbitraje recorrido) {
        Date d1;
        Date d2;
        if (actual.getId() < recorrido.getId()) {
            d1 = actual.getFec();
            d2 = recorrido.getFec();

        } else {
            d1 = recorrido.getFec();
            d2 = actual.getFec();
        }
        return (int) ((d2.getTime() - d1.getTime()) / (1000 * 60 * 60 * 24));
    }

    public static void main(String[] args) {
        ReportadorBean rep = new ReportadorBean();
    }

    private String getInfo(Dao dao, String nombreArchivo, IArbitraje ia, boolean b) {
        if (nombreArchivo.contains("Infonavit")) {
            Usu usu = (Usu) dao.get(Usu.class, Restrictions.eq("usuId", ia.getUsuId()));
            Cli cli = (Cli) dao.get(Cli.class, Restrictions.eq("cliId", ia.getCliId()));
            if (usu != null && cli != null) {
                if (b) {
                    return cli.getCliId() + "," + cli.getCliApePat() + " " + cli.getCliApeMat() + " " + cli.getCliNom() + "," + usu.getUsuClave();

                }
                return cli.getCliId() + "," + usu.getUsuClave();

            }

            return null;
        } else {
            return buscarBaseMeta(ia, b);
        }

    }

    private String escribirArchivo(String nombreArchivo, List<String> lineas) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(ruta + nombreArchivo + ".csv"));
            writer.write("Id Cliente , Nombre , Usuario(Alta) , Repeticiones (Id Cliente , Usuario(Alta) )");
            writer.newLine();
            for (String s : lineas) {
                System.out.println("escribo " + s + " en " + nombreArchivo);
                writer.write(s);
                writer.newLine();
            }
            writer.close();
        } catch (IOException ex) {
            Logger.getLogger(ReportadorBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        return nombreArchivo + ".csv";
    }

    /**
     * @return the ligas
     */
    public List<VectorXY> getLigas() {
        return ligas;
    }

    /**
     * @param ligas the ligas to set
     */
    public void setLigas(List<VectorXY> ligas) {
        this.ligas = ligas;
    }

    private String buscarBaseMeta(IArbitraje ia, boolean b) {
        DaoMeta dao = new DaoMeta();
        baseMeta.objetos.Usu usu =  dao.getUsu(ia.getUsuId());
        baseMeta.objetos.Cli cli =  dao.getCli(ia.getCliId());
        System.out.println("busco ia "+ia.getCliId()+" usu="+ia.getUsuId());
        System.out.println("el usu "+usu);
        System.out.println("el cli "+cli);
        if (usu != null && cli != null) {
            if (b) {
                return cli.getCliId() + "," + cli.getCliApePat() + " " + cli.getCliApeMat() + " " + cli.getCliNom() + "," + usu.getUsuClave();

            }
            return cli.getCliId() + "," + usu.getUsuClave();

        }
        return null;
    }
}
