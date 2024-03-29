package baseMeta.objetos;
// Generated 1/04/2010 01:02:42 AM by Hibernate Tools 3.2.1.GA


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Rel generated by hbm2java
 */
public class Rel  implements java.io.Serializable {


     private BigDecimal relId;
     private BigDecimal calId;
     private String relDes;
     private Double relLimInf;
     private Double relLimSup;
     private BigDecimal relOrdPre;
     private Double relPto;
     private Double relWoe;
     private String relDesLar;
     private Set<CliGol> cliGols = new HashSet<CliGol>(0);
     private Set<CliMta> cliMtas = new HashSet<CliMta>(0);

    public Rel() {
    }

	
    public Rel(BigDecimal relId) {
        this.relId = relId;
    }
    public Rel(BigDecimal relId, BigDecimal calId, String relDes, Double relLimInf, Double relLimSup, BigDecimal relOrdPre, Double relPto, Double relWoe, String relDesLar, Set<CliGol> cliGols, Set<CliMta> cliMtas) {
       this.relId = relId;
       this.calId = calId;
       this.relDes = relDes;
       this.relLimInf = relLimInf;
       this.relLimSup = relLimSup;
       this.relOrdPre = relOrdPre;
       this.relPto = relPto;
       this.relWoe = relWoe;
       this.relDesLar = relDesLar;
       this.cliGols = cliGols;
       this.cliMtas = cliMtas;
    }
   
    public BigDecimal getRelId() {
        return this.relId;
    }
    
    public void setRelId(BigDecimal relId) {
        this.relId = relId;
    }
    public BigDecimal getCalId() {
        return this.calId;
    }
    
    public void setCalId(BigDecimal calId) {
        this.calId = calId;
    }
    public String getRelDes() {
        return this.relDes;
    }
    
    public void setRelDes(String relDes) {
        this.relDes = relDes;
    }
    public Double getRelLimInf() {
        return this.relLimInf;
    }
    
    public void setRelLimInf(Double relLimInf) {
        this.relLimInf = relLimInf;
    }
    public Double getRelLimSup() {
        return this.relLimSup;
    }
    
    public void setRelLimSup(Double relLimSup) {
        this.relLimSup = relLimSup;
    }
    public BigDecimal getRelOrdPre() {
        return this.relOrdPre;
    }
    
    public void setRelOrdPre(BigDecimal relOrdPre) {
        this.relOrdPre = relOrdPre;
    }
    public Double getRelPto() {
        return this.relPto;
    }
    
    public void setRelPto(Double relPto) {
        this.relPto = relPto;
    }
    public Double getRelWoe() {
        return this.relWoe;
    }
    
    public void setRelWoe(Double relWoe) {
        this.relWoe = relWoe;
    }
    public String getRelDesLar() {
        return this.relDesLar;
    }
    
    public void setRelDesLar(String relDesLar) {
        this.relDesLar = relDesLar;
    }
    public Set<CliGol> getCliGols() {
        return this.cliGols;
    }
    
    public void setCliGols(Set<CliGol> cliGols) {
        this.cliGols = cliGols;
    }
    public Set<CliMta> getCliMtas() {
        return this.cliMtas;
    }
    
    public void setCliMtas(Set<CliMta> cliMtas) {
        this.cliMtas = cliMtas;
    }




}


