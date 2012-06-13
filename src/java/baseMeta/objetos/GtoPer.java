package baseMeta.objetos;
// Generated 1/04/2010 01:02:42 AM by Hibernate Tools 3.2.1.GA


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * GtoPer generated by hbm2java
 */
public class GtoPer  implements java.io.Serializable {


     private BigDecimal gtoPerId;
     private Cal cal;
     private String gtoPerDes;
     private Double gtoPerLimInf;
     private Double gtoPerLimSup;
     private BigDecimal gtoPerOrdPre;
     private Double gtoPerPto;
     private Double gtoPerWoe;
     private String gtoPerDesLar;
     private Set<CliGol> cliGols = new HashSet<CliGol>(0);

    public GtoPer() {
    }

	
    public GtoPer(BigDecimal gtoPerId) {
        this.gtoPerId = gtoPerId;
    }
    public GtoPer(BigDecimal gtoPerId, Cal cal, String gtoPerDes, Double gtoPerLimInf, Double gtoPerLimSup, BigDecimal gtoPerOrdPre, Double gtoPerPto, Double gtoPerWoe, String gtoPerDesLar, Set<CliGol> cliGols) {
       this.gtoPerId = gtoPerId;
       this.cal = cal;
       this.gtoPerDes = gtoPerDes;
       this.gtoPerLimInf = gtoPerLimInf;
       this.gtoPerLimSup = gtoPerLimSup;
       this.gtoPerOrdPre = gtoPerOrdPre;
       this.gtoPerPto = gtoPerPto;
       this.gtoPerWoe = gtoPerWoe;
       this.gtoPerDesLar = gtoPerDesLar;
       this.cliGols = cliGols;
    }
   
    public BigDecimal getGtoPerId() {
        return this.gtoPerId;
    }
    
    public void setGtoPerId(BigDecimal gtoPerId) {
        this.gtoPerId = gtoPerId;
    }
    public Cal getCal() {
        return this.cal;
    }
    
    public void setCal(Cal cal) {
        this.cal = cal;
    }
    public String getGtoPerDes() {
        return this.gtoPerDes;
    }
    
    public void setGtoPerDes(String gtoPerDes) {
        this.gtoPerDes = gtoPerDes;
    }
    public Double getGtoPerLimInf() {
        return this.gtoPerLimInf;
    }
    
    public void setGtoPerLimInf(Double gtoPerLimInf) {
        this.gtoPerLimInf = gtoPerLimInf;
    }
    public Double getGtoPerLimSup() {
        return this.gtoPerLimSup;
    }
    
    public void setGtoPerLimSup(Double gtoPerLimSup) {
        this.gtoPerLimSup = gtoPerLimSup;
    }
    public BigDecimal getGtoPerOrdPre() {
        return this.gtoPerOrdPre;
    }
    
    public void setGtoPerOrdPre(BigDecimal gtoPerOrdPre) {
        this.gtoPerOrdPre = gtoPerOrdPre;
    }
    public Double getGtoPerPto() {
        return this.gtoPerPto;
    }
    
    public void setGtoPerPto(Double gtoPerPto) {
        this.gtoPerPto = gtoPerPto;
    }
    public Double getGtoPerWoe() {
        return this.gtoPerWoe;
    }
    
    public void setGtoPerWoe(Double gtoPerWoe) {
        this.gtoPerWoe = gtoPerWoe;
    }
    public String getGtoPerDesLar() {
        return this.gtoPerDesLar;
    }
    
    public void setGtoPerDesLar(String gtoPerDesLar) {
        this.gtoPerDesLar = gtoPerDesLar;
    }
    public Set<CliGol> getCliGols() {
        return this.cliGols;
    }
    
    public void setCliGols(Set<CliGol> cliGols) {
        this.cliGols = cliGols;
    }




}


