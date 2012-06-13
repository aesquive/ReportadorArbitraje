package baseMeta.objetos;
// Generated 1/04/2010 01:02:42 AM by Hibernate Tools 3.2.1.GA


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * ApoOtr generated by hbm2java
 */
public class ApoOtr  implements java.io.Serializable {


     private BigDecimal apoOtrId;
     private Cal cal;
     private String apoOtrDes;
     private Double apoOtrLimInf;
     private Double apoOtrLimSup;
     private BigDecimal apoOtrOrdPre;
     private Double apoOtrPto;
     private Double apoOtrWoe;
     private String apoOtrDesLar;
     private Set<CliGol> cliGols = new HashSet<CliGol>(0);

    public ApoOtr() {
    }

	
    public ApoOtr(BigDecimal apoOtrId) {
        this.apoOtrId = apoOtrId;
    }
    public ApoOtr(BigDecimal apoOtrId, Cal cal, String apoOtrDes, Double apoOtrLimInf, Double apoOtrLimSup, BigDecimal apoOtrOrdPre, Double apoOtrPto, Double apoOtrWoe, String apoOtrDesLar, Set<CliGol> cliGols) {
       this.apoOtrId = apoOtrId;
       this.cal = cal;
       this.apoOtrDes = apoOtrDes;
       this.apoOtrLimInf = apoOtrLimInf;
       this.apoOtrLimSup = apoOtrLimSup;
       this.apoOtrOrdPre = apoOtrOrdPre;
       this.apoOtrPto = apoOtrPto;
       this.apoOtrWoe = apoOtrWoe;
       this.apoOtrDesLar = apoOtrDesLar;
       this.cliGols = cliGols;
    }
   
    public BigDecimal getApoOtrId() {
        return this.apoOtrId;
    }
    
    public void setApoOtrId(BigDecimal apoOtrId) {
        this.apoOtrId = apoOtrId;
    }
    public Cal getCal() {
        return this.cal;
    }
    
    public void setCal(Cal cal) {
        this.cal = cal;
    }
    public String getApoOtrDes() {
        return this.apoOtrDes;
    }
    
    public void setApoOtrDes(String apoOtrDes) {
        this.apoOtrDes = apoOtrDes;
    }
    public Double getApoOtrLimInf() {
        return this.apoOtrLimInf;
    }
    
    public void setApoOtrLimInf(Double apoOtrLimInf) {
        this.apoOtrLimInf = apoOtrLimInf;
    }
    public Double getApoOtrLimSup() {
        return this.apoOtrLimSup;
    }
    
    public void setApoOtrLimSup(Double apoOtrLimSup) {
        this.apoOtrLimSup = apoOtrLimSup;
    }
    public BigDecimal getApoOtrOrdPre() {
        return this.apoOtrOrdPre;
    }
    
    public void setApoOtrOrdPre(BigDecimal apoOtrOrdPre) {
        this.apoOtrOrdPre = apoOtrOrdPre;
    }
    public Double getApoOtrPto() {
        return this.apoOtrPto;
    }
    
    public void setApoOtrPto(Double apoOtrPto) {
        this.apoOtrPto = apoOtrPto;
    }
    public Double getApoOtrWoe() {
        return this.apoOtrWoe;
    }
    
    public void setApoOtrWoe(Double apoOtrWoe) {
        this.apoOtrWoe = apoOtrWoe;
    }
    public String getApoOtrDesLar() {
        return this.apoOtrDesLar;
    }
    
    public void setApoOtrDesLar(String apoOtrDesLar) {
        this.apoOtrDesLar = apoOtrDesLar;
    }
    public Set<CliGol> getCliGols() {
        return this.cliGols;
    }
    
    public void setCliGols(Set<CliGol> cliGols) {
        this.cliGols = cliGols;
    }




}


