package baseMeta.objetos;
// Generated 1/04/2010 01:02:42 AM by Hibernate Tools 3.2.1.GA


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Pbm generated by hbm2java
 */
public class Pbm  implements java.io.Serializable {


     private BigDecimal pbmId;
     private BigDecimal calId;
     private String pbmDes;
     private Double pbmLimInf;
     private Double pbmLimSup;
     private BigDecimal pbmOrdPre;
     private Double pbmPto;
     private Double pbmWoe;
     private String pbmDesLar;
     private Set<CliGol> cliGols = new HashSet<CliGol>(0);

    public Pbm() {
    }

	
    public Pbm(BigDecimal pbmId) {
        this.pbmId = pbmId;
    }
    public Pbm(BigDecimal pbmId, BigDecimal calId, String pbmDes, Double pbmLimInf, Double pbmLimSup, BigDecimal pbmOrdPre, Double pbmPto, Double pbmWoe, String pbmDesLar, Set<CliGol> cliGols) {
       this.pbmId = pbmId;
       this.calId = calId;
       this.pbmDes = pbmDes;
       this.pbmLimInf = pbmLimInf;
       this.pbmLimSup = pbmLimSup;
       this.pbmOrdPre = pbmOrdPre;
       this.pbmPto = pbmPto;
       this.pbmWoe = pbmWoe;
       this.pbmDesLar = pbmDesLar;
       this.cliGols = cliGols;
    }
   
    public BigDecimal getPbmId() {
        return this.pbmId;
    }
    
    public void setPbmId(BigDecimal pbmId) {
        this.pbmId = pbmId;
    }
    public BigDecimal getCalId() {
        return this.calId;
    }
    
    public void setCalId(BigDecimal calId) {
        this.calId = calId;
    }
    public String getPbmDes() {
        return this.pbmDes;
    }
    
    public void setPbmDes(String pbmDes) {
        this.pbmDes = pbmDes;
    }
    public Double getPbmLimInf() {
        return this.pbmLimInf;
    }
    
    public void setPbmLimInf(Double pbmLimInf) {
        this.pbmLimInf = pbmLimInf;
    }
    public Double getPbmLimSup() {
        return this.pbmLimSup;
    }
    
    public void setPbmLimSup(Double pbmLimSup) {
        this.pbmLimSup = pbmLimSup;
    }
    public BigDecimal getPbmOrdPre() {
        return this.pbmOrdPre;
    }
    
    public void setPbmOrdPre(BigDecimal pbmOrdPre) {
        this.pbmOrdPre = pbmOrdPre;
    }
    public Double getPbmPto() {
        return this.pbmPto;
    }
    
    public void setPbmPto(Double pbmPto) {
        this.pbmPto = pbmPto;
    }
    public Double getPbmWoe() {
        return this.pbmWoe;
    }
    
    public void setPbmWoe(Double pbmWoe) {
        this.pbmWoe = pbmWoe;
    }
    public String getPbmDesLar() {
        return this.pbmDesLar;
    }
    
    public void setPbmDesLar(String pbmDesLar) {
        this.pbmDesLar = pbmDesLar;
    }
    public Set<CliGol> getCliGols() {
        return this.cliGols;
    }
    
    public void setCliGols(Set<CliGol> cliGols) {
        this.cliGols = cliGols;
    }




}

