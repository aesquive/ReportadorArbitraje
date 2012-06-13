package objetos;
// Generated 13-may-2011 8:17:31 by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * BurAct generated by hbm2java
 */
public class BurAct  implements java.io.Serializable {


     private int burActId;
     private Cal cal;
     private String burActDes;
     private Float burActLimInf;
     private Float burActLimSup;
     private Integer burActOrdPre;
     private Float burActPto;
     private Float burActWoe;
     private String burActDesLar;
     private Set cliMtas = new HashSet(0);

    public BurAct() {
    }

	
    public BurAct(int burActId) {
        this.burActId = burActId;
    }
    public BurAct(int burActId, Cal cal, String burActDes, Float burActLimInf, Float burActLimSup, Integer burActOrdPre, Float burActPto, Float burActWoe, String burActDesLar, Set cliMtas) {
       this.burActId = burActId;
       this.cal = cal;
       this.burActDes = burActDes;
       this.burActLimInf = burActLimInf;
       this.burActLimSup = burActLimSup;
       this.burActOrdPre = burActOrdPre;
       this.burActPto = burActPto;
       this.burActWoe = burActWoe;
       this.burActDesLar = burActDesLar;
       this.cliMtas = cliMtas;
    }
   
    public int getBurActId() {
        return this.burActId;
    }
    
    public void setBurActId(int burActId) {
        this.burActId = burActId;
    }
    public Cal getCal() {
        return this.cal;
    }
    
    public void setCal(Cal cal) {
        this.cal = cal;
    }
    public String getBurActDes() {
        return this.burActDes;
    }
    
    public void setBurActDes(String burActDes) {
        this.burActDes = burActDes;
    }
    public Float getBurActLimInf() {
        return this.burActLimInf;
    }
    
    public void setBurActLimInf(Float burActLimInf) {
        this.burActLimInf = burActLimInf;
    }
    public Float getBurActLimSup() {
        return this.burActLimSup;
    }
    
    public void setBurActLimSup(Float burActLimSup) {
        this.burActLimSup = burActLimSup;
    }
    public Integer getBurActOrdPre() {
        return this.burActOrdPre;
    }
    
    public void setBurActOrdPre(Integer burActOrdPre) {
        this.burActOrdPre = burActOrdPre;
    }
    public Float getBurActPto() {
        return this.burActPto;
    }
    
    public void setBurActPto(Float burActPto) {
        this.burActPto = burActPto;
    }
    public Float getBurActWoe() {
        return this.burActWoe;
    }
    
    public void setBurActWoe(Float burActWoe) {
        this.burActWoe = burActWoe;
    }
    public String getBurActDesLar() {
        return this.burActDesLar;
    }
    
    public void setBurActDesLar(String burActDesLar) {
        this.burActDesLar = burActDesLar;
    }
    public Set getCliMtas() {
        return this.cliMtas;
    }
    
    public void setCliMtas(Set cliMtas) {
        this.cliMtas = cliMtas;
    }




}


