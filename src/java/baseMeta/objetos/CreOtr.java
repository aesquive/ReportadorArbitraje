package baseMeta.objetos;
// Generated 1/04/2010 01:02:42 AM by Hibernate Tools 3.2.1.GA


import java.math.BigDecimal;

/**
 * CreOtr generated by hbm2java
 */
public class CreOtr  implements java.io.Serializable {


     private BigDecimal creOtrId;
     private Cal cal;
     private String creOtrDes;
     private Double creOtrLimInf;
     private Double creOtrLimSup;
     private BigDecimal creOtrOrdPre;
     private Double creOtrPto;
     private Double creOtrWoe;
     private String creOtrDesLar;

    public CreOtr() {
    }

	
    public CreOtr(BigDecimal creOtrId) {
        this.creOtrId = creOtrId;
    }
    public CreOtr(BigDecimal creOtrId, Cal cal, String creOtrDes, Double creOtrLimInf, Double creOtrLimSup, BigDecimal creOtrOrdPre, Double creOtrPto, Double creOtrWoe, String creOtrDesLar) {
       this.creOtrId = creOtrId;
       this.cal = cal;
       this.creOtrDes = creOtrDes;
       this.creOtrLimInf = creOtrLimInf;
       this.creOtrLimSup = creOtrLimSup;
       this.creOtrOrdPre = creOtrOrdPre;
       this.creOtrPto = creOtrPto;
       this.creOtrWoe = creOtrWoe;
       this.creOtrDesLar = creOtrDesLar;
    }
   
    public BigDecimal getCreOtrId() {
        return this.creOtrId;
    }
    
    public void setCreOtrId(BigDecimal creOtrId) {
        this.creOtrId = creOtrId;
    }
    public Cal getCal() {
        return this.cal;
    }
    
    public void setCal(Cal cal) {
        this.cal = cal;
    }
    public String getCreOtrDes() {
        return this.creOtrDes;
    }
    
    public void setCreOtrDes(String creOtrDes) {
        this.creOtrDes = creOtrDes;
    }
    public Double getCreOtrLimInf() {
        return this.creOtrLimInf;
    }
    
    public void setCreOtrLimInf(Double creOtrLimInf) {
        this.creOtrLimInf = creOtrLimInf;
    }
    public Double getCreOtrLimSup() {
        return this.creOtrLimSup;
    }
    
    public void setCreOtrLimSup(Double creOtrLimSup) {
        this.creOtrLimSup = creOtrLimSup;
    }
    public BigDecimal getCreOtrOrdPre() {
        return this.creOtrOrdPre;
    }
    
    public void setCreOtrOrdPre(BigDecimal creOtrOrdPre) {
        this.creOtrOrdPre = creOtrOrdPre;
    }
    public Double getCreOtrPto() {
        return this.creOtrPto;
    }
    
    public void setCreOtrPto(Double creOtrPto) {
        this.creOtrPto = creOtrPto;
    }
    public Double getCreOtrWoe() {
        return this.creOtrWoe;
    }
    
    public void setCreOtrWoe(Double creOtrWoe) {
        this.creOtrWoe = creOtrWoe;
    }
    public String getCreOtrDesLar() {
        return this.creOtrDesLar;
    }
    
    public void setCreOtrDesLar(String creOtrDesLar) {
        this.creOtrDesLar = creOtrDesLar;
    }




}

