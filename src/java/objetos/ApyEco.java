package objetos;
// Generated 13-may-2011 8:17:31 by Hibernate Tools 3.2.1.GA



/**
 * ApyEco generated by hbm2java
 */
public class ApyEco  implements java.io.Serializable {


     private int apyEcoId;
     private Cal cal;
     private String apyEcoDes;
     private Float apyEcoLimInf;
     private Float apyEcoLimSup;
     private Integer apyEcoOrdPre;
     private Float apyEcoPto;
     private Float apyEcoWoe;
     private String apyEcoDesLar;

    public ApyEco() {
    }

	
    public ApyEco(int apyEcoId) {
        this.apyEcoId = apyEcoId;
    }
    public ApyEco(int apyEcoId, Cal cal, String apyEcoDes, Float apyEcoLimInf, Float apyEcoLimSup, Integer apyEcoOrdPre, Float apyEcoPto, Float apyEcoWoe, String apyEcoDesLar) {
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
   
    public int getApyEcoId() {
        return this.apyEcoId;
    }
    
    public void setApyEcoId(int apyEcoId) {
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
    public Float getApyEcoLimInf() {
        return this.apyEcoLimInf;
    }
    
    public void setApyEcoLimInf(Float apyEcoLimInf) {
        this.apyEcoLimInf = apyEcoLimInf;
    }
    public Float getApyEcoLimSup() {
        return this.apyEcoLimSup;
    }
    
    public void setApyEcoLimSup(Float apyEcoLimSup) {
        this.apyEcoLimSup = apyEcoLimSup;
    }
    public Integer getApyEcoOrdPre() {
        return this.apyEcoOrdPre;
    }
    
    public void setApyEcoOrdPre(Integer apyEcoOrdPre) {
        this.apyEcoOrdPre = apyEcoOrdPre;
    }
    public Float getApyEcoPto() {
        return this.apyEcoPto;
    }
    
    public void setApyEcoPto(Float apyEcoPto) {
        this.apyEcoPto = apyEcoPto;
    }
    public Float getApyEcoWoe() {
        return this.apyEcoWoe;
    }
    
    public void setApyEcoWoe(Float apyEcoWoe) {
        this.apyEcoWoe = apyEcoWoe;
    }
    public String getApyEcoDesLar() {
        return this.apyEcoDesLar;
    }
    
    public void setApyEcoDesLar(String apyEcoDesLar) {
        this.apyEcoDesLar = apyEcoDesLar;
    }




}

