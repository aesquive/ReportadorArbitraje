package baseMeta.objetos;
// Generated 1/04/2010 01:02:42 AM by Hibernate Tools 3.2.1.GA


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * CueAbr generated by hbm2java
 */
public class CueAbr  implements java.io.Serializable {


     private BigDecimal cueAbrId;
     private Cal cal;
     private String cueAbrDes;
     private Double cueAbrLimInf;
     private Double cueAbrLimSup;
     private BigDecimal cueAbrOrdPre;
     private Double cueAbrPto;
     private Double cueAbrWoe;
     private String cueAbrDesLar;
     private Set<CliGol> cliGols = new HashSet<CliGol>(0);

    public CueAbr() {
    }

	
    public CueAbr(BigDecimal cueAbrId) {
        this.cueAbrId = cueAbrId;
    }
    public CueAbr(BigDecimal cueAbrId, Cal cal, String cueAbrDes, Double cueAbrLimInf, Double cueAbrLimSup, BigDecimal cueAbrOrdPre, Double cueAbrPto, Double cueAbrWoe, String cueAbrDesLar, Set<CliGol> cliGols) {
       this.cueAbrId = cueAbrId;
       this.cal = cal;
       this.cueAbrDes = cueAbrDes;
       this.cueAbrLimInf = cueAbrLimInf;
       this.cueAbrLimSup = cueAbrLimSup;
       this.cueAbrOrdPre = cueAbrOrdPre;
       this.cueAbrPto = cueAbrPto;
       this.cueAbrWoe = cueAbrWoe;
       this.cueAbrDesLar = cueAbrDesLar;
       this.cliGols = cliGols;
    }
   
    public BigDecimal getCueAbrId() {
        return this.cueAbrId;
    }
    
    public void setCueAbrId(BigDecimal cueAbrId) {
        this.cueAbrId = cueAbrId;
    }
    public Cal getCal() {
        return this.cal;
    }
    
    public void setCal(Cal cal) {
        this.cal = cal;
    }
    public String getCueAbrDes() {
        return this.cueAbrDes;
    }
    
    public void setCueAbrDes(String cueAbrDes) {
        this.cueAbrDes = cueAbrDes;
    }
    public Double getCueAbrLimInf() {
        return this.cueAbrLimInf;
    }
    
    public void setCueAbrLimInf(Double cueAbrLimInf) {
        this.cueAbrLimInf = cueAbrLimInf;
    }
    public Double getCueAbrLimSup() {
        return this.cueAbrLimSup;
    }
    
    public void setCueAbrLimSup(Double cueAbrLimSup) {
        this.cueAbrLimSup = cueAbrLimSup;
    }
    public BigDecimal getCueAbrOrdPre() {
        return this.cueAbrOrdPre;
    }
    
    public void setCueAbrOrdPre(BigDecimal cueAbrOrdPre) {
        this.cueAbrOrdPre = cueAbrOrdPre;
    }
    public Double getCueAbrPto() {
        return this.cueAbrPto;
    }
    
    public void setCueAbrPto(Double cueAbrPto) {
        this.cueAbrPto = cueAbrPto;
    }
    public Double getCueAbrWoe() {
        return this.cueAbrWoe;
    }
    
    public void setCueAbrWoe(Double cueAbrWoe) {
        this.cueAbrWoe = cueAbrWoe;
    }
    public String getCueAbrDesLar() {
        return this.cueAbrDesLar;
    }
    
    public void setCueAbrDesLar(String cueAbrDesLar) {
        this.cueAbrDesLar = cueAbrDesLar;
    }
    public Set<CliGol> getCliGols() {
        return this.cliGols;
    }
    
    public void setCliGols(Set<CliGol> cliGols) {
        this.cliGols = cliGols;
    }




}


