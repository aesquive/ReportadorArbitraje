package baseMeta.objetos;
// Generated 1/04/2010 01:02:42 AM by Hibernate Tools 3.2.1.GA


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Gpo generated by hbm2java
 */
public class Gpo  implements java.io.Serializable {


     private BigDecimal gpoId;
     private String gpoNomCos;
     private String gpoTipCos;
     private String gpoStaCos;
     private Set<CliMta> cliMtas = new HashSet<CliMta>(0);

    public Gpo() {
    }

	
    public Gpo(BigDecimal gpoId) {
        this.gpoId = gpoId;
    }
    public Gpo(BigDecimal gpoId, String gpoNomCos, String gpoTipCos, String gpoStaCos, Set<CliMta> cliMtas) {
       this.gpoId = gpoId;
       this.gpoNomCos = gpoNomCos;
       this.gpoTipCos = gpoTipCos;
       this.gpoStaCos = gpoStaCos;
       this.cliMtas = cliMtas;
    }
   
    public BigDecimal getGpoId() {
        return this.gpoId;
    }
    
    public void setGpoId(BigDecimal gpoId) {
        this.gpoId = gpoId;
    }
    public String getGpoNomCos() {
        return this.gpoNomCos;
    }
    
    public void setGpoNomCos(String gpoNomCos) {
        this.gpoNomCos = gpoNomCos;
    }
    public String getGpoTipCos() {
        return this.gpoTipCos;
    }
    
    public void setGpoTipCos(String gpoTipCos) {
        this.gpoTipCos = gpoTipCos;
    }
    public String getGpoStaCos() {
        return this.gpoStaCos;
    }
    
    public void setGpoStaCos(String gpoStaCos) {
        this.gpoStaCos = gpoStaCos;
    }
    public Set<CliMta> getCliMtas() {
        return this.cliMtas;
    }
    
    public void setCliMtas(Set<CliMta> cliMtas) {
        this.cliMtas = cliMtas;
    }




}


