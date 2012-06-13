/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package baseMeta.base;

import baseMeta.objetos.Cli;
import baseMeta.objetos.Usu;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author alberto
 */
public class DaoMeta {
    
    private Session sesion;
    
    public DaoMeta(){
        sesion= sesion==null ? HibernateUtilMeta.getSessionFactory().openSession() :sesion;
    }
    
    public List getTabla(Class clase){
        return sesion.createCriteria(clase).list();
    }

    public Object get(Class clase, Criterion criterio) {
        List list = sesion.createCriteria(clase).add(criterio).list();
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }
    
    public static void main(String[] args) {
    }

    public Usu getUsu(Integer usuId) {
        List<Usu> tabla = getTabla(Usu.class);
        for(Usu u:tabla){
            if(u.getUsuId().intValue()==usuId){
                return u;
            }
        }
        return null;
    }

    public Cli getCli(Integer cliId) {
        List<Cli> tabla = getTabla(Cli.class);
        for(Cli u:tabla){
            if(u.getCliId()==cliId){
                return u;
            }
        }
        return null;
    }
    
}
