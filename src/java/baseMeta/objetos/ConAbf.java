package baseMeta.objetos;
// Generated 1/04/2010 01:02:42 AM by Hibernate Tools 3.2.1.GA


import java.math.BigDecimal;

/**
 * ConAbf generated by hbm2java
 */
public class ConAbf  implements java.io.Serializable {


     private BigDecimal conAbfId;
     private Cal cal;
     private String conAbfDes;
     private Double conAbfLimInf;
     private Double conAbfLimSup;
     private BigDecimal conAbfOrdPre;
     private Double conAbfPto;
     private Double conAbfWoe;
     private String conAbfDesLar;

    public ConAbf() {
    }

	
    public ConAbf(BigDecimal conAbfId) {
        this.conAbfId = conAbfId;
    }
    public ConAbf(BigDecimal conAbfId, Cal cal, String conAbfDes, Double conAbfLimInf, Double conAbfLimSup, BigDecimal conAbfOrdPre, Double conAbfPto, Double conAbfWoe, String conAbfDesLar) {
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
   
    public BigDecimal getConAbfId() {
        return this.conAbfId;
    }
    
    public void setConAbfId(BigDecimal conAbfId) {
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
    public Double getConAbfLimInf() {
        return this.conAbfLimInf;
    }
    
    public void setConAbfLimInf(Double conAbfLimInf) {
        this.conAbfLimInf = conAbfLimInf;
    }
    public Double getConAbfLimSup() {
        return this.conAbfLimSup;
    }
    
    public void setConAbfLimSup(Double conAbfLimSup) {
        this.conAbfLimSup = conAbfLimSup;
    }
    public BigDecimal getConAbfOrdPre() {
        return this.conAbfOrdPre;
    }
    
    public void setConAbfOrdPre(BigDecimal conAbfOrdPre) {
        this.conAbfOrdPre = conAbfOrdPre;
    }
    public Double getConAbfPto() {
        return this.conAbfPto;
    }
    
    public void setConAbfPto(Double conAbfPto) {
        this.conAbfPto = conAbfPto;
    }
    public Double getConAbfWoe() {
        return this.conAbfWoe;
    }
    
    public void setConAbfWoe(Double conAbfWoe) {
        this.conAbfWoe = conAbfWoe;
    }
    public String getConAbfDesLar() {
        return this.conAbfDesLar;
    }
    
    public void setConAbfDesLar(String conAbfDesLar) {
        this.conAbfDesLar = conAbfDesLar;
    }




}


