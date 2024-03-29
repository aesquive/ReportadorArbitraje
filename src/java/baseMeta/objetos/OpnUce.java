package baseMeta.objetos;
// Generated 1/04/2010 01:02:42 AM by Hibernate Tools 3.2.1.GA


import java.math.BigDecimal;

/**
 * OpnUce generated by hbm2java
 */
public class OpnUce  implements java.io.Serializable {


     private BigDecimal opnUceId;
     private BigDecimal calId;
     private String opnUceDes;
     private Double opnUceLimInf;
     private Double opnUceLimSup;
     private BigDecimal opnUceOrdPre;
     private Double opnUcePto;
     private Double opnUceWoe;
     private String opnUceDesLar;

    public OpnUce() {
    }

	
    public OpnUce(BigDecimal opnUceId) {
        this.opnUceId = opnUceId;
    }
    public OpnUce(BigDecimal opnUceId, BigDecimal calId, String opnUceDes, Double opnUceLimInf, Double opnUceLimSup, BigDecimal opnUceOrdPre, Double opnUcePto, Double opnUceWoe, String opnUceDesLar) {
       this.opnUceId = opnUceId;
       this.calId = calId;
       this.opnUceDes = opnUceDes;
       this.opnUceLimInf = opnUceLimInf;
       this.opnUceLimSup = opnUceLimSup;
       this.opnUceOrdPre = opnUceOrdPre;
       this.opnUcePto = opnUcePto;
       this.opnUceWoe = opnUceWoe;
       this.opnUceDesLar = opnUceDesLar;
    }
   
    public BigDecimal getOpnUceId() {
        return this.opnUceId;
    }
    
    public void setOpnUceId(BigDecimal opnUceId) {
        this.opnUceId = opnUceId;
    }
    public BigDecimal getCalId() {
        return this.calId;
    }
    
    public void setCalId(BigDecimal calId) {
        this.calId = calId;
    }
    public String getOpnUceDes() {
        return this.opnUceDes;
    }
    
    public void setOpnUceDes(String opnUceDes) {
        this.opnUceDes = opnUceDes;
    }
    public Double getOpnUceLimInf() {
        return this.opnUceLimInf;
    }
    
    public void setOpnUceLimInf(Double opnUceLimInf) {
        this.opnUceLimInf = opnUceLimInf;
    }
    public Double getOpnUceLimSup() {
        return this.opnUceLimSup;
    }
    
    public void setOpnUceLimSup(Double opnUceLimSup) {
        this.opnUceLimSup = opnUceLimSup;
    }
    public BigDecimal getOpnUceOrdPre() {
        return this.opnUceOrdPre;
    }
    
    public void setOpnUceOrdPre(BigDecimal opnUceOrdPre) {
        this.opnUceOrdPre = opnUceOrdPre;
    }
    public Double getOpnUcePto() {
        return this.opnUcePto;
    }
    
    public void setOpnUcePto(Double opnUcePto) {
        this.opnUcePto = opnUcePto;
    }
    public Double getOpnUceWoe() {
        return this.opnUceWoe;
    }
    
    public void setOpnUceWoe(Double opnUceWoe) {
        this.opnUceWoe = opnUceWoe;
    }
    public String getOpnUceDesLar() {
        return this.opnUceDesLar;
    }
    
    public void setOpnUceDesLar(String opnUceDesLar) {
        this.opnUceDesLar = opnUceDesLar;
    }




}


