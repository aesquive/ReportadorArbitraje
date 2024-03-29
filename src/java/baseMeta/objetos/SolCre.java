package baseMeta.objetos;
// Generated 1/04/2010 01:02:42 AM by Hibernate Tools 3.2.1.GA


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * SolCre generated by hbm2java
 */
public class SolCre  implements java.io.Serializable {


     private BigDecimal solCreId;
     private BigDecimal calId;
     private String solCreDes;
     private Double solCreLimInf;
     private Double solCreLimSup;
     private BigDecimal solCreOrdPre;
     private Double solCrePto;
     private Double solCreWoe;
     private String solCreDesLar;
     private Set<CliGol> cliGols = new HashSet<CliGol>(0);

    public SolCre() {
    }

	
    public SolCre(BigDecimal solCreId) {
        this.solCreId = solCreId;
    }
    public SolCre(BigDecimal solCreId, BigDecimal calId, String solCreDes, Double solCreLimInf, Double solCreLimSup, BigDecimal solCreOrdPre, Double solCrePto, Double solCreWoe, String solCreDesLar, Set<CliGol> cliGols) {
       this.solCreId = solCreId;
       this.calId = calId;
       this.solCreDes = solCreDes;
       this.solCreLimInf = solCreLimInf;
       this.solCreLimSup = solCreLimSup;
       this.solCreOrdPre = solCreOrdPre;
       this.solCrePto = solCrePto;
       this.solCreWoe = solCreWoe;
       this.solCreDesLar = solCreDesLar;
       this.cliGols = cliGols;
    }
   
    public BigDecimal getSolCreId() {
        return this.solCreId;
    }
    
    public void setSolCreId(BigDecimal solCreId) {
        this.solCreId = solCreId;
    }
    public BigDecimal getCalId() {
        return this.calId;
    }
    
    public void setCalId(BigDecimal calId) {
        this.calId = calId;
    }
    public String getSolCreDes() {
        return this.solCreDes;
    }
    
    public void setSolCreDes(String solCreDes) {
        this.solCreDes = solCreDes;
    }
    public Double getSolCreLimInf() {
        return this.solCreLimInf;
    }
    
    public void setSolCreLimInf(Double solCreLimInf) {
        this.solCreLimInf = solCreLimInf;
    }
    public Double getSolCreLimSup() {
        return this.solCreLimSup;
    }
    
    public void setSolCreLimSup(Double solCreLimSup) {
        this.solCreLimSup = solCreLimSup;
    }
    public BigDecimal getSolCreOrdPre() {
        return this.solCreOrdPre;
    }
    
    public void setSolCreOrdPre(BigDecimal solCreOrdPre) {
        this.solCreOrdPre = solCreOrdPre;
    }
    public Double getSolCrePto() {
        return this.solCrePto;
    }
    
    public void setSolCrePto(Double solCrePto) {
        this.solCrePto = solCrePto;
    }
    public Double getSolCreWoe() {
        return this.solCreWoe;
    }
    
    public void setSolCreWoe(Double solCreWoe) {
        this.solCreWoe = solCreWoe;
    }
    public String getSolCreDesLar() {
        return this.solCreDesLar;
    }
    
    public void setSolCreDesLar(String solCreDesLar) {
        this.solCreDesLar = solCreDesLar;
    }
    public Set<CliGol> getCliGols() {
        return this.cliGols;
    }
    
    public void setCliGols(Set<CliGol> cliGols) {
        this.cliGols = cliGols;
    }




}


