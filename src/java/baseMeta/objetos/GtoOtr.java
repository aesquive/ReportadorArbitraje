package baseMeta.objetos;
// Generated 1/04/2010 01:02:42 AM by Hibernate Tools 3.2.1.GA


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * GtoOtr generated by hbm2java
 */
public class GtoOtr  implements java.io.Serializable {


     private BigDecimal gtoOtrId;
     private Cal cal;
     private String gtoOtrDes;
     private Double gtoOtrLimInf;
     private Double gtoOtrLimSup;
     private BigDecimal gtoOtrOrdPre;
     private Double gtoOtrPto;
     private Double gtoOtrWoe;
     private String gtoOtrDesLar;
     private Set<CliGol> cliGolsForGtoOtrHId = new HashSet<CliGol>(0);
     private Set<CliGol> cliGolsForGtoOtrId = new HashSet<CliGol>(0);

    public GtoOtr() {
    }

	
    public GtoOtr(BigDecimal gtoOtrId) {
        this.gtoOtrId = gtoOtrId;
    }
    public GtoOtr(BigDecimal gtoOtrId, Cal cal, String gtoOtrDes, Double gtoOtrLimInf, Double gtoOtrLimSup, BigDecimal gtoOtrOrdPre, Double gtoOtrPto, Double gtoOtrWoe, String gtoOtrDesLar, Set<CliGol> cliGolsForGtoOtrHId, Set<CliGol> cliGolsForGtoOtrId) {
       this.gtoOtrId = gtoOtrId;
       this.cal = cal;
       this.gtoOtrDes = gtoOtrDes;
       this.gtoOtrLimInf = gtoOtrLimInf;
       this.gtoOtrLimSup = gtoOtrLimSup;
       this.gtoOtrOrdPre = gtoOtrOrdPre;
       this.gtoOtrPto = gtoOtrPto;
       this.gtoOtrWoe = gtoOtrWoe;
       this.gtoOtrDesLar = gtoOtrDesLar;
       this.cliGolsForGtoOtrHId = cliGolsForGtoOtrHId;
       this.cliGolsForGtoOtrId = cliGolsForGtoOtrId;
    }
   
    public BigDecimal getGtoOtrId() {
        return this.gtoOtrId;
    }
    
    public void setGtoOtrId(BigDecimal gtoOtrId) {
        this.gtoOtrId = gtoOtrId;
    }
    public Cal getCal() {
        return this.cal;
    }
    
    public void setCal(Cal cal) {
        this.cal = cal;
    }
    public String getGtoOtrDes() {
        return this.gtoOtrDes;
    }
    
    public void setGtoOtrDes(String gtoOtrDes) {
        this.gtoOtrDes = gtoOtrDes;
    }
    public Double getGtoOtrLimInf() {
        return this.gtoOtrLimInf;
    }
    
    public void setGtoOtrLimInf(Double gtoOtrLimInf) {
        this.gtoOtrLimInf = gtoOtrLimInf;
    }
    public Double getGtoOtrLimSup() {
        return this.gtoOtrLimSup;
    }
    
    public void setGtoOtrLimSup(Double gtoOtrLimSup) {
        this.gtoOtrLimSup = gtoOtrLimSup;
    }
    public BigDecimal getGtoOtrOrdPre() {
        return this.gtoOtrOrdPre;
    }
    
    public void setGtoOtrOrdPre(BigDecimal gtoOtrOrdPre) {
        this.gtoOtrOrdPre = gtoOtrOrdPre;
    }
    public Double getGtoOtrPto() {
        return this.gtoOtrPto;
    }
    
    public void setGtoOtrPto(Double gtoOtrPto) {
        this.gtoOtrPto = gtoOtrPto;
    }
    public Double getGtoOtrWoe() {
        return this.gtoOtrWoe;
    }
    
    public void setGtoOtrWoe(Double gtoOtrWoe) {
        this.gtoOtrWoe = gtoOtrWoe;
    }
    public String getGtoOtrDesLar() {
        return this.gtoOtrDesLar;
    }
    
    public void setGtoOtrDesLar(String gtoOtrDesLar) {
        this.gtoOtrDesLar = gtoOtrDesLar;
    }
    public Set<CliGol> getCliGolsForGtoOtrHId() {
        return this.cliGolsForGtoOtrHId;
    }
    
    public void setCliGolsForGtoOtrHId(Set<CliGol> cliGolsForGtoOtrHId) {
        this.cliGolsForGtoOtrHId = cliGolsForGtoOtrHId;
    }
    public Set<CliGol> getCliGolsForGtoOtrId() {
        return this.cliGolsForGtoOtrId;
    }
    
    public void setCliGolsForGtoOtrId(Set<CliGol> cliGolsForGtoOtrId) {
        this.cliGolsForGtoOtrId = cliGolsForGtoOtrId;
    }




}


