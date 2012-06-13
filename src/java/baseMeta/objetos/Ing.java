package baseMeta.objetos;
// Generated 1/04/2010 01:02:42 AM by Hibernate Tools 3.2.1.GA


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Ing generated by hbm2java
 */
public class Ing  implements java.io.Serializable {


     private BigDecimal ingId;
     private Cal cal;
     private String ingDes;
     private Double ingLimInf;
     private Double ingLimSup;
     private BigDecimal ingOrdPre;
     private Double ingPto;
     private Double ingWoe;
     private String ingDesLar;
     private Set<CliMta> cliMtas = new HashSet<CliMta>(0);

    public Ing() {
    }

	
    public Ing(BigDecimal ingId) {
        this.ingId = ingId;
    }
    public Ing(BigDecimal ingId, Cal cal, String ingDes, Double ingLimInf, Double ingLimSup, BigDecimal ingOrdPre, Double ingPto, Double ingWoe, String ingDesLar, Set<CliMta> cliMtas) {
       this.ingId = ingId;
       this.cal = cal;
       this.ingDes = ingDes;
       this.ingLimInf = ingLimInf;
       this.ingLimSup = ingLimSup;
       this.ingOrdPre = ingOrdPre;
       this.ingPto = ingPto;
       this.ingWoe = ingWoe;
       this.ingDesLar = ingDesLar;
       this.cliMtas = cliMtas;
    }
   
    public BigDecimal getIngId() {
        return this.ingId;
    }
    
    public void setIngId(BigDecimal ingId) {
        this.ingId = ingId;
    }
    public Cal getCal() {
        return this.cal;
    }
    
    public void setCal(Cal cal) {
        this.cal = cal;
    }
    public String getIngDes() {
        return this.ingDes;
    }
    
    public void setIngDes(String ingDes) {
        this.ingDes = ingDes;
    }
    public Double getIngLimInf() {
        return this.ingLimInf;
    }
    
    public void setIngLimInf(Double ingLimInf) {
        this.ingLimInf = ingLimInf;
    }
    public Double getIngLimSup() {
        return this.ingLimSup;
    }
    
    public void setIngLimSup(Double ingLimSup) {
        this.ingLimSup = ingLimSup;
    }
    public BigDecimal getIngOrdPre() {
        return this.ingOrdPre;
    }
    
    public void setIngOrdPre(BigDecimal ingOrdPre) {
        this.ingOrdPre = ingOrdPre;
    }
    public Double getIngPto() {
        return this.ingPto;
    }
    
    public void setIngPto(Double ingPto) {
        this.ingPto = ingPto;
    }
    public Double getIngWoe() {
        return this.ingWoe;
    }
    
    public void setIngWoe(Double ingWoe) {
        this.ingWoe = ingWoe;
    }
    public String getIngDesLar() {
        return this.ingDesLar;
    }
    
    public void setIngDesLar(String ingDesLar) {
        this.ingDesLar = ingDesLar;
    }
    public Set<CliMta> getCliMtas() {
        return this.cliMtas;
    }
    
    public void setCliMtas(Set<CliMta> cliMtas) {
        this.cliMtas = cliMtas;
    }




}


