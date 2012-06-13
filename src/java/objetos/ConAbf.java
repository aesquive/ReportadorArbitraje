package objetos;
// Generated 13-may-2011 8:17:31 by Hibernate Tools 3.2.1.GA



/**
 * ConAbf generated by hbm2java
 */
public class ConAbf  implements java.io.Serializable {


     private int conAbfId;
     private Cal cal;
     private String conAbfDes;
     private Float conAbfLimInf;
     private Float conAbfLimSup;
     private Integer conAbfOrdPre;
     private Float conAbfPto;
     private Float conAbfWoe;
     private String conAbfDesLar;

    public ConAbf() {
    }

	
    public ConAbf(int conAbfId) {
        this.conAbfId = conAbfId;
    }
    public ConAbf(int conAbfId, Cal cal, String conAbfDes, Float conAbfLimInf, Float conAbfLimSup, Integer conAbfOrdPre, Float conAbfPto, Float conAbfWoe, String conAbfDesLar) {
       this.conAbfId = conAbfId;
       this.cal = cal;
       this.conAbfDes = conAbfDes;
       this.conAbfLimInf = conAbfLimInf;
       this.conAbfLimSup = conAbfLimSup;
       this.conAbfOrdPre = conAbfOrdPre;
       this.conAbfPto = conAbfPto;
       this.conAbfWoe = conAbfWoe;
       this.conAbfDesLar = conAbfDesLar;
    }
   
    public int getConAbfId() {
        return this.conAbfId;
    }
    
    public void setConAbfId(int conAbfId) {
        this.conAbfId = conAbfId;
    }
    public Cal getCal() {
        return this.cal;
    }
    
    public void setCal(Cal cal) {
        this.cal = cal;
    }
    public String getConAbfDes() {
        return this.conAbfDes;
    }
    
    public void setConAbfDes(String conAbfDes) {
        this.conAbfDes = conAbfDes;
    }
    public Float getConAbfLimInf() {
        return this.conAbfLimInf;
    }
    
    public void setConAbfLimInf(Float conAbfLimInf) {
        this.conAbfLimInf = conAbfLimInf;
    }
    public Float getConAbfLimSup() {
        return this.conAbfLimSup;
    }
    
    public void setConAbfLimSup(Float conAbfLimSup) {
        this.conAbfLimSup = conAbfLimSup;
    }
    public Integer getConAbfOrdPre() {
        return this.conAbfOrdPre;
    }
    
    public void setConAbfOrdPre(Integer conAbfOrdPre) {
        this.conAbfOrdPre = conAbfOrdPre;
    }
    public Float getConAbfPto() {
        return this.conAbfPto;
    }
    
    public void setConAbfPto(Float conAbfPto) {
        this.conAbfPto = conAbfPto;
    }
    public Float getConAbfWoe() {
        return this.conAbfWoe;
    }
    
    public void setConAbfWoe(Float conAbfWoe) {
        this.conAbfWoe = conAbfWoe;
    }
    public String getConAbfDesLar() {
        return this.conAbfDesLar;
    }
    
    public void setConAbfDesLar(String conAbfDesLar) {
        this.conAbfDesLar = conAbfDesLar;
    }




}


