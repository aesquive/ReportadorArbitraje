package baseMeta.objetos;
// Generated 1/04/2010 01:02:42 AM by Hibernate Tools 3.2.1.GA


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * SrvInd generated by hbm2java
 */
public class SrvInd  implements java.io.Serializable {


     private BigDecimal srvIndId;
     private BigDecimal calId;
     private String srvIndDes;
     private Double srvIndLimInf;
     private Double srvIndLimSup;
     private BigDecimal srvIndOrdPre;
     private Double srvIndPto;
     private Double srvIndWoe;
     private String srvIndDesLar;
     private Set<CliGol> cliGols = new HashSet<CliGol>(0);

    public SrvInd() {
    }

	
    public SrvInd(BigDecimal srvIndId) {
        this.srvIndId = srvIndId;
    }
    public SrvInd(BigDecimal srvIndId, BigDecimal calId, String srvIndDes, Double srvIndLimInf, Double srvIndLimSup, BigDecimal srvIndOrdPre, Double srvIndPto, Double srvIndWoe, String srvIndDesLar, Set<CliGol> cliGols) {
       this.srvIndId = srvIndId;
       this.calId = calId;
       this.srvIndDes = srvIndDes;
       this.srvIndLimInf = srvIndLimInf;
       this.srvIndLimSup = srvIndLimSup;
       this.srvIndOrdPre = srvIndOrdPre;
       this.srvIndPto = srvIndPto;
       this.srvIndWoe = srvIndWoe;
       this.srvIndDesLar = srvIndDesLar;
       this.cliGols = cliGols;
    }
   
    public BigDecimal getSrvIndId() {
        return this.srvIndId;
    }
    
    public void setSrvIndId(BigDecimal srvIndId) {
        this.srvIndId = srvIndId;
    }
    public BigDecimal getCalId() {
        return this.calId;
    }
    
    public void setCalId(BigDecimal calId) {
        this.calId = calId;
    }
    public String getSrvIndDes() {
        return this.srvIndDes;
    }
    
    public void setSrvIndDes(String srvIndDes) {
        this.srvIndDes = srvIndDes;
    }
    public Double getSrvIndLimInf() {
        return this.srvIndLimInf;
    }
    
    public void setSrvIndLimInf(Double srvIndLimInf) {
        this.srvIndLimInf = srvIndLimInf;
    }
    public Double getSrvIndLimSup() {
        return this.srvIndLimSup;
    }
    
    public void setSrvIndLimSup(Double srvIndLimSup) {
        this.srvIndLimSup = srvIndLimSup;
    }
    public BigDecimal getSrvIndOrdPre() {
        return this.srvIndOrdPre;
    }
    
    public void setSrvIndOrdPre(BigDecimal srvIndOrdPre) {
        this.srvIndOrdPre = srvIndOrdPre;
    }
    public Double getSrvIndPto() {
        return this.srvIndPto;
    }
    
    public void setSrvIndPto(Double srvIndPto) {
        this.srvIndPto = srvIndPto;
    }
    public Double getSrvIndWoe() {
        return this.srvIndWoe;
    }
    
    public void setSrvIndWoe(Double srvIndWoe) {
        this.srvIndWoe = srvIndWoe;
    }
    public String getSrvIndDesLar() {
        return this.srvIndDesLar;
    }
    
    public void setSrvIndDesLar(String srvIndDesLar) {
        this.srvIndDesLar = srvIndDesLar;
    }
    public Set<CliGol> getCliGols() {
        return this.cliGols;
    }
    
    public void setCliGols(Set<CliGol> cliGols) {
        this.cliGols = cliGols;
    }




}


