package baseMeta.objetos;
// Generated 1/04/2010 01:02:42 AM by Hibernate Tools 3.2.1.GA


import java.math.BigDecimal;

/**
 * RngResAnt generated by hbm2java
 */
public class RngResAnt  implements java.io.Serializable {


     private BigDecimal rngResAntId;
     private BigDecimal calId;
     private String rngResAntDes;
     private Double rngResAntLimInf;
     private Double rngResAntLimSup;
     private BigDecimal rngResAntOrdPre;
     private Double rngResAntPto;
     private Double rngResAntWoe;
     private String rngResAntDesLar;

    public RngResAnt() {
    }

	
    public RngResAnt(BigDecimal rngResAntId) {
        this.rngResAntId = rngResAntId;
    }
    public RngResAnt(BigDecimal rngResAntId, BigDecimal calId, String rngResAntDes, Double rngResAntLimInf, Double rngResAntLimSup, BigDecimal rngResAntOrdPre, Double rngResAntPto, Double rngResAntWoe, String rngResAntDesLar) {
       this.rngResAntId = rngResAntId;
       this.calId = calId;
       this.rngResAntDes = rngResAntDes;
       this.rngResAntLimInf = rngResAntLimInf;
       this.rngResAntLimSup = rngResAntLimSup;
       this.rngResAntOrdPre = rngResAntOrdPre;
       this.rngResAntPto = rngResAntPto;
       this.rngResAntWoe = rngResAntWoe;
       this.rngResAntDesLar = rngResAntDesLar;
    }
   
    public BigDecimal getRngResAntId() {
        return this.rngResAntId;
    }
    
    public void setRngResAntId(BigDecimal rngResAntId) {
        this.rngResAntId = rngResAntId;
    }
    public BigDecimal getCalId() {
        return this.calId;
    }
    
    public void setCalId(BigDecimal calId) {
        this.calId = calId;
    }
    public String getRngResAntDes() {
        return this.rngResAntDes;
    }
    
    public void setRngResAntDes(String rngResAntDes) {
        this.rngResAntDes = rngResAntDes;
    }
    public Double getRngResAntLimInf() {
        return this.rngResAntLimInf;
    }
    
    public void setRngResAntLimInf(Double rngResAntLimInf) {
        this.rngResAntLimInf = rngResAntLimInf;
    }
    public Double getRngResAntLimSup() {
        return this.rngResAntLimSup;
    }
    
    public void setRngResAntLimSup(Double rngResAntLimSup) {
        this.rngResAntLimSup = rngResAntLimSup;
    }
    public BigDecimal getRngResAntOrdPre() {
        return this.rngResAntOrdPre;
    }
    
    public void setRngResAntOrdPre(BigDecimal rngResAntOrdPre) {
        this.rngResAntOrdPre = rngResAntOrdPre;
    }
    public Double getRngResAntPto() {
        return this.rngResAntPto;
    }
    
    public void setRngResAntPto(Double rngResAntPto) {
        this.rngResAntPto = rngResAntPto;
    }
    public Double getRngResAntWoe() {
        return this.rngResAntWoe;
    }
    
    public void setRngResAntWoe(Double rngResAntWoe) {
        this.rngResAntWoe = rngResAntWoe;
    }
    public String getRngResAntDesLar() {
        return this.rngResAntDesLar;
    }
    
    public void setRngResAntDesLar(String rngResAntDesLar) {
        this.rngResAntDesLar = rngResAntDesLar;
    }




}


