package baseMeta.objetos;
// Generated 1/04/2010 01:02:42 AM by Hibernate Tools 3.2.1.GA


import java.math.BigDecimal;

/**
 * ApyEco generated by hbm2java
 */
public class ApyEco  implements java.io.Serializable {


     private BigDecimal apyEcoId;
     private Cal cal;
     private String apyEcoDes;
     private Double apyEcoLimInf;
     private Double apyEcoLimSup;
     private BigDecimal apyEcoOrdPre;
     private Double apyEcoPto;
     private Double apyEcoWoe;
     private String apyEcoDesLar;

    public ApyEco() {
    }

	
    public ApyEco(BigDecimal apyEcoId) {
        this.apyEcoId = apyEcoId;
    }
    public ApyEco(BigDecimal apyEcoId, Cal cal, String apyEcoDes, Double apyEcoLimInf, Double apyEcoLimSup, BigDecimal apyEcoOrdPre, Double apyEcoPto, Double apyEcoWoe, String apyEcoDesLar) {
       this.apyEcoId = apyEcoId;
       this.cal = cal;
       this.apyEcoDes = apyEcoDes;
       this.apyEcoLimInf = apyEcoLimInf;
       this.apyEcoLimSup = apyEcoLimSup;
       this.apyEcoOrdPre = apyEcoOrdPre;
       this.apyEcoPto = apyEcoPto;
       this.apyEcoWoe = apyEcoWoe;
       this.apyEcoDesLar = apyEcoDesLar;
    }
   
    public BigDecimal getApyEcoId() {
        return this.apyEcoId;
    }
    
    public void setApyEcoId(BigDecimal apyEcoId) {
        this.apyEcoId = apyEcoId;
    }
    public Cal getCal() {
        return this.cal;
    }
    
    public void setCal(Cal cal) {
        this.cal = cal;
    }
    public String getApyEcoDes() {
        return this.apyEcoDes;
    }
    
    public void setApyEcoDes(String apyEcoDes) {
        this.apyEcoDes = apyEcoDes;
    }
    public Double getApyEcoLimInf() {
        return this.apyEcoLimInf;
    }
    
    public void setApyEcoLimInf(Double apyEcoLimInf) {
        this.apyEcoLimInf = apyEcoLimInf;
    }
    public Double getApyEcoLimSup() {
        return this.apyEcoLimSup;
    }
    
    public void setApyEcoLimSup(Double apyEcoLimSup) {
        this.apyEcoLimSup = apyEcoLimSup;
    }
    public BigDecimal getApyEcoOrdPre() {
        return this.apyEcoOrdPre;
    }
    
    public void setApyEcoOrdPre(BigDecimal apyEcoOrdPre) {
        this.apyEcoOrdPre = apyEcoOrdPre;
    }
    public Double getApyEcoPto() {
        return this.apyEcoPto;
    }
    
    public void setApyEcoPto(Double apyEcoPto) {
        this.apyEcoPto = apyEcoPto;
    }
    public Double getApyEcoWoe() {
        return this.apyEcoWoe;
    }
    
    public void setApyEcoWoe(Double apyEcoWoe) {
        this.apyEcoWoe = apyEcoWoe;
    }
    public String getApyEcoDesLar() {
        return this.apyEcoDesLar;
    }
    
    public void setApyEcoDesLar(String apyEcoDesLar) {
        this.apyEcoDesLar = apyEcoDesLar;
    }




}


