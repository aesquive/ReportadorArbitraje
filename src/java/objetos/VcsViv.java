package objetos;
// Generated 13-may-2011 8:17:31 by Hibernate Tools 3.2.1.GA



/**
 * VcsViv generated by hbm2java
 */
public class VcsViv  implements java.io.Serializable {


     private int vcsVivId;
     private Integer calId;
     private String vcsVivDes;
     private Float vcsVivLimInf;
     private Float vcsVivLimSup;
     private Integer vcsVivOrdPre;
     private Float vcsVivPto;
     private Float vcsVivWoe;
     private String vcsVivDesLar;

    public VcsViv() {
    }

	
    public VcsViv(int vcsVivId) {
        this.vcsVivId = vcsVivId;
    }
    public VcsViv(int vcsVivId, Integer calId, String vcsVivDes, Float vcsVivLimInf, Float vcsVivLimSup, Integer vcsVivOrdPre, Float vcsVivPto, Float vcsVivWoe, String vcsVivDesLar) {
       this.vcsVivId = vcsVivId;
       this.calId = calId;
       this.vcsVivDes = vcsVivDes;
       this.vcsVivLimInf = vcsVivLimInf;
       this.vcsVivLimSup = vcsVivLimSup;
       this.vcsVivOrdPre = vcsVivOrdPre;
       this.vcsVivPto = vcsVivPto;
       this.vcsVivWoe = vcsVivWoe;
       this.vcsVivDesLar = vcsVivDesLar;
    }
   
    public int getVcsVivId() {
        return this.vcsVivId;
    }
    
    public void setVcsVivId(int vcsVivId) {
        this.vcsVivId = vcsVivId;
    }
    public Integer getCalId() {
        return this.calId;
    }
    
    public void setCalId(Integer calId) {
        this.calId = calId;
    }
    public String getVcsVivDes() {
        return this.vcsVivDes;
    }
    
    public void setVcsVivDes(String vcsVivDes) {
        this.vcsVivDes = vcsVivDes;
    }
    public Float getVcsVivLimInf() {
        return this.vcsVivLimInf;
    }
    
    public void setVcsVivLimInf(Float vcsVivLimInf) {
        this.vcsVivLimInf = vcsVivLimInf;
    }
    public Float getVcsVivLimSup() {
        return this.vcsVivLimSup;
    }
    
    public void setVcsVivLimSup(Float vcsVivLimSup) {
        this.vcsVivLimSup = vcsVivLimSup;
    }
    public Integer getVcsVivOrdPre() {
        return this.vcsVivOrdPre;
    }
    
    public void setVcsVivOrdPre(Integer vcsVivOrdPre) {
        this.vcsVivOrdPre = vcsVivOrdPre;
    }
    public Float getVcsVivPto() {
        return this.vcsVivPto;
    }
    
    public void setVcsVivPto(Float vcsVivPto) {
        this.vcsVivPto = vcsVivPto;
    }
    public Float getVcsVivWoe() {
        return this.vcsVivWoe;
    }
    
    public void setVcsVivWoe(Float vcsVivWoe) {
        this.vcsVivWoe = vcsVivWoe;
    }
    public String getVcsVivDesLar() {
        return this.vcsVivDesLar;
    }
    
    public void setVcsVivDesLar(String vcsVivDesLar) {
        this.vcsVivDesLar = vcsVivDesLar;
    }




}


