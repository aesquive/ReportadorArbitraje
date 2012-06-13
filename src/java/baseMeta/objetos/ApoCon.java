package baseMeta.objetos;
// Generated 1/04/2010 01:02:42 AM by Hibernate Tools 3.2.1.GA


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * ApoCon generated by hbm2java
 */
public class ApoCon  implements java.io.Serializable {


     private BigDecimal apoConId;
     private Cal cal;
     private String apoConDes;
     private Double apoConLimInf;
     private Double apoConLimSup;
     private BigDecimal apoConOrdPre;
     private Double apoConPto;
     private Double apoConWoe;
     private String apoConDesLar;
     private Set<CliGol> cliGols = new HashSet<CliGol>(0);

    public ApoCon() {
    }

	
    public ApoCon(BigDecimal apoConId) {
        this.apoConId = apoConId;
    }
    public ApoCon(BigDecimal apoConId, Cal cal, String apoConDes, Double apoConLimInf, Double apoConLimSup, BigDecimal apoConOrdPre, Double apoConPto, Double apoConWoe, String apoConDesLar, Set<CliGol> cliGols) {
       this.apoConId = apoConId;
       this.cal = cal;
       this.apoConDes = apoConDes;
       this.apoConLimInf = apoConLimInf;
       this.apoConLimSup = apoConLimSup;
       this.apoConOrdPre = apoConOrdPre;
       this.apoConPto = apoConPto;
       this.apoConWoe = apoConWoe;
       this.apoConDesLar = apoConDesLar;
       this.cliGols = cliGols;
    }
   
    public BigDecimal getApoConId() {
        return this.apoConId;
    }
    
    public void setApoConId(BigDecimal apoConId) {
        this.apoConId = apoConId;
    }
    public Cal getCal() {
        return this.cal;
    }
    
    public void setCal(Cal cal) {
        this.cal = cal;
    }
    public String getApoConDes() {
        return this.apoConDes;
    }
    
    public void setApoConDes(String apoConDes) {
        this.apoConDes = apoConDes;
    }
    public Double getApoConLimInf() {
        return this.apoConLimInf;
    }
    
    public void setApoConLimInf(Double apoConLimInf) {
        this.apoConLimInf = apoConLimInf;
    }
    public Double getApoConLimSup() {
        return this.apoConLimSup;
    }
    
    public void setApoConLimSup(Double apoConLimSup) {
        this.apoConLimSup = apoConLimSup;
    }
    public BigDecimal getApoConOrdPre() {
        return this.apoConOrdPre;
    }
    
    public void setApoConOrdPre(BigDecimal apoConOrdPre) {
        this.apoConOrdPre = apoConOrdPre;
    }
    public Double getApoConPto() {
        return this.apoConPto;
    }
    
    public void setApoConPto(Double apoConPto) {
        this.apoConPto = apoConPto;
    }
    public Double getApoConWoe() {
        return this.apoConWoe;
    }
    
    public void setApoConWoe(Double apoConWoe) {
        this.apoConWoe = apoConWoe;
    }
    public String getApoConDesLar() {
        return this.apoConDesLar;
    }
    
    public void setApoConDesLar(String apoConDesLar) {
        this.apoConDesLar = apoConDesLar;
    }
    public Set<CliGol> getCliGols() {
        return this.cliGols;
    }
    
    public void setCliGols(Set<CliGol> cliGols) {
        this.cliGols = cliGols;
    }




}

