package baseMeta.objetos;
// Generated 1/04/2010 01:02:42 AM by Hibernate Tools 3.2.1.GA


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * NivEstMam generated by hbm2java
 */
public class NivEstMam  implements java.io.Serializable {


     private BigDecimal nivEstMamId;
     private Cal cal;
     private String nivEstMamDes;
     private Double nivEstMamLimInf;
     private Double nivEstMamLimSup;
     private BigDecimal nivEstMamOrdPre;
     private Double nivEstMamPto;
     private Double nivEstMamWoe;
     private String nivEstMamDesLar;
     private Set<CliGol> cliGols = new HashSet<CliGol>(0);

    public NivEstMam() {
    }

	
    public NivEstMam(BigDecimal nivEstMamId) {
        this.nivEstMamId = nivEstMamId;
    }
    public NivEstMam(BigDecimal nivEstMamId, Cal cal, String nivEstMamDes, Double nivEstMamLimInf, Double nivEstMamLimSup, BigDecimal nivEstMamOrdPre, Double nivEstMamPto, Double nivEstMamWoe, String nivEstMamDesLar, Set<CliGol> cliGols) {
       this.nivEstMamId = nivEstMamId;
       this.cal = cal;
       this.nivEstMamDes = nivEstMamDes;
       this.nivEstMamLimInf = nivEstMamLimInf;
       this.nivEstMamLimSup = nivEstMamLimSup;
       this.nivEstMamOrdPre = nivEstMamOrdPre;
       this.nivEstMamPto = nivEstMamPto;
       this.nivEstMamWoe = nivEstMamWoe;
       this.nivEstMamDesLar = nivEstMamDesLar;
       this.cliGols = cliGols;
    }
   
    public BigDecimal getNivEstMamId() {
        return this.nivEstMamId;
    }
    
    public void setNivEstMamId(BigDecimal nivEstMamId) {
        this.nivEstMamId = nivEstMamId;
    }
    public Cal getCal() {
        return this.cal;
    }
    
    public void setCal(Cal cal) {
        this.cal = cal;
    }
    public String getNivEstMamDes() {
        return this.nivEstMamDes;
    }
    
    public void setNivEstMamDes(String nivEstMamDes) {
        this.nivEstMamDes = nivEstMamDes;
    }
    public Double getNivEstMamLimInf() {
        return this.nivEstMamLimInf;
    }
    
    public void setNivEstMamLimInf(Double nivEstMamLimInf) {
        this.nivEstMamLimInf = nivEstMamLimInf;
    }
    public Double getNivEstMamLimSup() {
        return this.nivEstMamLimSup;
    }
    
    public void setNivEstMamLimSup(Double nivEstMamLimSup) {
        this.nivEstMamLimSup = nivEstMamLimSup;
    }
    public BigDecimal getNivEstMamOrdPre() {
        return this.nivEstMamOrdPre;
    }
    
    public void setNivEstMamOrdPre(BigDecimal nivEstMamOrdPre) {
        this.nivEstMamOrdPre = nivEstMamOrdPre;
    }
    public Double getNivEstMamPto() {
        return this.nivEstMamPto;
    }
    
    public void setNivEstMamPto(Double nivEstMamPto) {
        this.nivEstMamPto = nivEstMamPto;
    }
    public Double getNivEstMamWoe() {
        return this.nivEstMamWoe;
    }
    
    public void setNivEstMamWoe(Double nivEstMamWoe) {
        this.nivEstMamWoe = nivEstMamWoe;
    }
    public String getNivEstMamDesLar() {
        return this.nivEstMamDesLar;
    }
    
    public void setNivEstMamDesLar(String nivEstMamDesLar) {
        this.nivEstMamDesLar = nivEstMamDesLar;
    }
    public Set<CliGol> getCliGols() {
        return this.cliGols;
    }
    
    public void setCliGols(Set<CliGol> cliGols) {
        this.cliGols = cliGols;
    }




}


