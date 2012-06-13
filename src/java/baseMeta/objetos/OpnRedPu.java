package baseMeta.objetos;
// Generated 1/04/2010 01:02:42 AM by Hibernate Tools 3.2.1.GA


import java.math.BigDecimal;

/**
 * OpnRedPu generated by hbm2java
 */
public class OpnRedPu  implements java.io.Serializable {


     private BigDecimal opnRedPuId;
     private BigDecimal calId;
     private String opnRedPuDes;
     private Double opnRedPuLimInf;
     private Double opnRedPuLimSup;
     private BigDecimal opnRedPuOrdPre;
     private Double opnRedPuPto;
     private Double opnRedPuWoe;
     private String opnRedPuDesLar;

    public OpnRedPu() {
    }

	
    public OpnRedPu(BigDecimal opnRedPuId) {
        this.opnRedPuId = opnRedPuId;
    }
    public OpnRedPu(BigDecimal opnRedPuId, BigDecimal calId, String opnRedPuDes, Double opnRedPuLimInf, Double opnRedPuLimSup, BigDecimal opnRedPuOrdPre, Double opnRedPuPto, Double opnRedPuWoe, String opnRedPuDesLar) {
       this.opnRedPuId = opnRedPuId;
       this.calId = calId;
       this.opnRedPuDes = opnRedPuDes;
       this.opnRedPuLimInf = opnRedPuLimInf;
       this.opnRedPuLimSup = opnRedPuLimSup;
       this.opnRedPuOrdPre = opnRedPuOrdPre;
       this.opnRedPuPto = opnRedPuPto;
       this.opnRedPuWoe = opnRedPuWoe;
       this.opnRedPuDesLar = opnRedPuDesLar;
    }
   
    public BigDecimal getOpnRedPuId() {
        return this.opnRedPuId;
    }
    
    public void setOpnRedPuId(BigDecimal opnRedPuId) {
        this.opnRedPuId = opnRedPuId;
    }
    public BigDecimal getCalId() {
        return this.calId;
    }
    
    public void setCalId(BigDecimal calId) {
        this.calId = calId;
    }
    public String getOpnRedPuDes() {
        return this.opnRedPuDes;
    }
    
    public void setOpnRedPuDes(String opnRedPuDes) {
        this.opnRedPuDes = opnRedPuDes;
    }
    public Double getOpnRedPuLimInf() {
        return this.opnRedPuLimInf;
    }
    
    public void setOpnRedPuLimInf(Double opnRedPuLimInf) {
        this.opnRedPuLimInf = opnRedPuLimInf;
    }
    public Double getOpnRedPuLimSup() {
        return this.opnRedPuLimSup;
    }
    
    public void setOpnRedPuLimSup(Double opnRedPuLimSup) {
        this.opnRedPuLimSup = opnRedPuLimSup;
    }
    public BigDecimal getOpnRedPuOrdPre() {
        return this.opnRedPuOrdPre;
    }
    
    public void setOpnRedPuOrdPre(BigDecimal opnRedPuOrdPre) {
        this.opnRedPuOrdPre = opnRedPuOrdPre;
    }
    public Double getOpnRedPuPto() {
        return this.opnRedPuPto;
    }
    
    public void setOpnRedPuPto(Double opnRedPuPto) {
        this.opnRedPuPto = opnRedPuPto;
    }
    public Double getOpnRedPuWoe() {
        return this.opnRedPuWoe;
    }
    
    public void setOpnRedPuWoe(Double opnRedPuWoe) {
        this.opnRedPuWoe = opnRedPuWoe;
    }
    public String getOpnRedPuDesLar() {
        return this.opnRedPuDesLar;
    }
    
    public void setOpnRedPuDesLar(String opnRedPuDesLar) {
        this.opnRedPuDesLar = opnRedPuDesLar;
    }




}


