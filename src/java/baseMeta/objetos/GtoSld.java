package baseMeta.objetos;
// Generated 1/04/2010 01:02:42 AM by Hibernate Tools 3.2.1.GA


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * GtoSld generated by hbm2java
 */
public class GtoSld  implements java.io.Serializable {


     private BigDecimal gtoSldId;
     private Cal cal;
     private String gtoSldDes;
     private Double gtoSldLimInf;
     private Double gtoSldLimSup;
     private BigDecimal gtoSldOrdPre;
     private Double gtoSldPto;
     private Double gtoSldWoe;
     private String gtoSldDesLar;
     private Set<CliGol> cliGols = new HashSet<CliGol>(0);

    public GtoSld() {
    }

	
    public GtoSld(BigDecimal gtoSldId) {
        this.gtoSldId = gtoSldId;
    }
    public GtoSld(BigDecimal gtoSldId, Cal cal, String gtoSldDes, Double gtoSldLimInf, Double gtoSldLimSup, BigDecimal gtoSldOrdPre, Double gtoSldPto, Double gtoSldWoe, String gtoSldDesLar, Set<CliGol> cliGols) {
       this.gtoSldId = gtoSldId;
       this.cal = cal;
       this.gtoSldDes = gtoSldDes;
       this.gtoSldLimInf = gtoSldLimInf;
       this.gtoSldLimSup = gtoSldLimSup;
       this.gtoSldOrdPre = gtoSldOrdPre;
       this.gtoSldPto = gtoSldPto;
       this.gtoSldWoe = gtoSldWoe;
       this.gtoSldDesLar = gtoSldDesLar;
       this.cliGols = cliGols;
    }
   
    public BigDecimal getGtoSldId() {
        return this.gtoSldId;
    }
    
    public void setGtoSldId(BigDecimal gtoSldId) {
        this.gtoSldId = gtoSldId;
    }
    public Cal getCal() {
        return this.cal;
    }
    
    public void setCal(Cal cal) {
        this.cal = cal;
    }
    public String getGtoSldDes() {
        return this.gtoSldDes;
    }
    
    public void setGtoSldDes(String gtoSldDes) {
        this.gtoSldDes = gtoSldDes;
    }
    public Double getGtoSldLimInf() {
        return this.gtoSldLimInf;
    }
    
    public void setGtoSldLimInf(Double gtoSldLimInf) {
        this.gtoSldLimInf = gtoSldLimInf;
    }
    public Double getGtoSldLimSup() {
        return this.gtoSldLimSup;
    }
    
    public void setGtoSldLimSup(Double gtoSldLimSup) {
        this.gtoSldLimSup = gtoSldLimSup;
    }
    public BigDecimal getGtoSldOrdPre() {
        return this.gtoSldOrdPre;
    }
    
    public void setGtoSldOrdPre(BigDecimal gtoSldOrdPre) {
        this.gtoSldOrdPre = gtoSldOrdPre;
    }
    public Double getGtoSldPto() {
        return this.gtoSldPto;
    }
    
    public void setGtoSldPto(Double gtoSldPto) {
        this.gtoSldPto = gtoSldPto;
    }
    public Double getGtoSldWoe() {
        return this.gtoSldWoe;
    }
    
    public void setGtoSldWoe(Double gtoSldWoe) {
        this.gtoSldWoe = gtoSldWoe;
    }
    public String getGtoSldDesLar() {
        return this.gtoSldDesLar;
    }
    
    public void setGtoSldDesLar(String gtoSldDesLar) {
        this.gtoSldDesLar = gtoSldDesLar;
    }
    public Set<CliGol> getCliGols() {
        return this.cliGols;
    }
    
    public void setCliGols(Set<CliGol> cliGols) {
        this.cliGols = cliGols;
    }




}


