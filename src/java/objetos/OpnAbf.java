package objetos;
// Generated 13-may-2011 8:17:31 by Hibernate Tools 3.2.1.GA



/**
 * OpnAbf generated by hbm2java
 */
public class OpnAbf  implements java.io.Serializable {


     private int opnAbfId;
     private Cal cal;
     private String opnAbfDes;
     private Float opnAbfLimInf;
     private Float opnAbfLimSup;
     private Integer opnAbfOrdPre;
     private Float opnAbfPto;
     private Float opnAbfWoe;
     private String opnAbfDesLar;

    public OpnAbf() {
    }

	
    public OpnAbf(int opnAbfId) {
        this.opnAbfId = opnAbfId;
    }
    public OpnAbf(int opnAbfId, Cal cal, String opnAbfDes, Float opnAbfLimInf, Float opnAbfLimSup, Integer opnAbfOrdPre, Float opnAbfPto, Float opnAbfWoe, String opnAbfDesLar) {
       this.opnAbfId = opnAbfId;
       this.cal = cal;
       this.opnAbfDes = opnAbfDes;
       this.opnAbfLimInf = opnAbfLimInf;
       this.opnAbfLimSup = opnAbfLimSup;
       this.opnAbfOrdPre = opnAbfOrdPre;
       this.opnAbfPto = opnAbfPto;
       this.opnAbfWoe = opnAbfWoe;
       this.opnAbfDesLar = opnAbfDesLar;
    }
   
    public int getOpnAbfId() {
        return this.opnAbfId;
    }
    
    public void setOpnAbfId(int opnAbfId) {
        this.opnAbfId = opnAbfId;
    }
    public Cal getCal() {
        return this.cal;
    }
    
    public void setCal(Cal cal) {
        this.cal = cal;
    }
    public String getOpnAbfDes() {
        return this.opnAbfDes;
    }
    
    public void setOpnAbfDes(String opnAbfDes) {
        this.opnAbfDes = opnAbfDes;
    }
    public Float getOpnAbfLimInf() {
        return this.opnAbfLimInf;
    }
    
    public void setOpnAbfLimInf(Float opnAbfLimInf) {
        this.opnAbfLimInf = opnAbfLimInf;
    }
    public Float getOpnAbfLimSup() {
        return this.opnAbfLimSup;
    }
    
    public void setOpnAbfLimSup(Float opnAbfLimSup) {
        this.opnAbfLimSup = opnAbfLimSup;
    }
    public Integer getOpnAbfOrdPre() {
        return this.opnAbfOrdPre;
    }
    
    public void setOpnAbfOrdPre(Integer opnAbfOrdPre) {
        this.opnAbfOrdPre = opnAbfOrdPre;
    }
    public Float getOpnAbfPto() {
        return this.opnAbfPto;
    }
    
    public void setOpnAbfPto(Float opnAbfPto) {
        this.opnAbfPto = opnAbfPto;
    }
    public Float getOpnAbfWoe() {
        return this.opnAbfWoe;
    }
    
    public void setOpnAbfWoe(Float opnAbfWoe) {
        this.opnAbfWoe = opnAbfWoe;
    }
    public String getOpnAbfDesLar() {
        return this.opnAbfDesLar;
    }
    
    public void setOpnAbfDesLar(String opnAbfDesLar) {
        this.opnAbfDesLar = opnAbfDesLar;
    }




}


