package baseMeta.objetos;
// Generated 1/04/2010 01:02:42 AM by Hibernate Tools 3.2.1.GA


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * GtoAlm generated by hbm2java
 */
public class GtoAlm  implements java.io.Serializable {


     private BigDecimal gtoAlmId;
     private Cal cal;
     private String gtoAlmDes;
     private Double gtoAlmLimInf;
     private Double gtoAlmLimSup;
     private BigDecimal gtoAlmOrdPre;
     private Double gtoAlmPto;
     private Double gtoAlmWoe;
     private String gtoAlmDesLar;
     private Set<CliGol> cliGolsForGtoAlmId = new HashSet<CliGol>(0);
     private Set<CliGol> cliGolsForGtoAlmHId = new HashSet<CliGol>(0);

    public GtoAlm() {
    }

	
    public GtoAlm(BigDecimal gtoAlmId) {
        this.gtoAlmId = gtoAlmId;
    }
    public GtoAlm(BigDecimal gtoAlmId, Cal cal, String gtoAlmDes, Double gtoAlmLimInf, Double gtoAlmLimSup, BigDecimal gtoAlmOrdPre, Double gtoAlmPto, Double gtoAlmWoe, String gtoAlmDesLar, Set<CliGol> cliGolsForGtoAlmId, Set<CliGol> cliGolsForGtoAlmHId) {
       this.gtoAlmId = gtoAlmId;
       this.cal = cal;
       this.gtoAlmDes = gtoAlmDes;
       this.gtoAlmLimInf = gtoAlmLimInf;
       this.gtoAlmLimSup = gtoAlmLimSup;
       this.gtoAlmOrdPre = gtoAlmOrdPre;
       this.gtoAlmPto = gtoAlmPto;
       this.gtoAlmWoe = gtoAlmWoe;
       this.gtoAlmDesLar = gtoAlmDesLar;
       this.cliGolsForGtoAlmId = cliGolsForGtoAlmId;
       this.cliGolsForGtoAlmHId = cliGolsForGtoAlmHId;
    }
   
    public BigDecimal getGtoAlmId() {
        return this.gtoAlmId;
    }
    
    public void setGtoAlmId(BigDecimal gtoAlmId) {
        this.gtoAlmId = gtoAlmId;
    }
    public Cal getCal() {
        return this.cal;
    }
    
    public void setCal(Cal cal) {
        this.cal = cal;
    }
    public String getGtoAlmDes() {
        return this.gtoAlmDes;
    }
    
    public void setGtoAlmDes(String gtoAlmDes) {
        this.gtoAlmDes = gtoAlmDes;
    }
    public Double getGtoAlmLimInf() {
        return this.gtoAlmLimInf;
    }
    
    public void setGtoAlmLimInf(Double gtoAlmLimInf) {
        this.gtoAlmLimInf = gtoAlmLimInf;
    }
    public Double getGtoAlmLimSup() {
        return this.gtoAlmLimSup;
    }
    
    public void setGtoAlmLimSup(Double gtoAlmLimSup) {
        this.gtoAlmLimSup = gtoAlmLimSup;
    }
    public BigDecimal getGtoAlmOrdPre() {
        return this.gtoAlmOrdPre;
    }
    
    public void setGtoAlmOrdPre(BigDecimal gtoAlmOrdPre) {
        this.gtoAlmOrdPre = gtoAlmOrdPre;
    }
    public Double getGtoAlmPto() {
        return this.gtoAlmPto;
    }
    
    public void setGtoAlmPto(Double gtoAlmPto) {
        this.gtoAlmPto = gtoAlmPto;
    }
    public Double getGtoAlmWoe() {
        return this.gtoAlmWoe;
    }
    
    public void setGtoAlmWoe(Double gtoAlmWoe) {
        this.gtoAlmWoe = gtoAlmWoe;
    }
    public String getGtoAlmDesLar() {
        return this.gtoAlmDesLar;
    }
    
    public void setGtoAlmDesLar(String gtoAlmDesLar) {
        this.gtoAlmDesLar = gtoAlmDesLar;
    }
    public Set<CliGol> getCliGolsForGtoAlmId() {
        return this.cliGolsForGtoAlmId;
    }
    
    public void setCliGolsForGtoAlmId(Set<CliGol> cliGolsForGtoAlmId) {
        this.cliGolsForGtoAlmId = cliGolsForGtoAlmId;
    }
    public Set<CliGol> getCliGolsForGtoAlmHId() {
        return this.cliGolsForGtoAlmHId;
    }
    
    public void setCliGolsForGtoAlmHId(Set<CliGol> cliGolsForGtoAlmHId) {
        this.cliGolsForGtoAlmHId = cliGolsForGtoAlmHId;
    }




}


