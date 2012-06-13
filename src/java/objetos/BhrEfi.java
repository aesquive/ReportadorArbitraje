package objetos;
// Generated 13-may-2011 8:17:31 by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * BhrEfi generated by hbm2java
 */
public class BhrEfi  implements java.io.Serializable {


     private int bhrEfiId;
     private Integer calId;
     private String bhrEfiDes;
     private Float bhrEfiLimInf;
     private Float bhrEfiLimSup;
     private Integer bhrEfiOrdPre;
     private Float bhrEfiPto;
     private Float bhrEfiWoe;
     private String bhrEfiDesLar;
     private Set cliBhrs = new HashSet(0);

    public BhrEfi() {
    }

	
    public BhrEfi(int bhrEfiId) {
        this.bhrEfiId = bhrEfiId;
    }
    public BhrEfi(int bhrEfiId, Integer calId, String bhrEfiDes, Float bhrEfiLimInf, Float bhrEfiLimSup, Integer bhrEfiOrdPre, Float bhrEfiPto, Float bhrEfiWoe, String bhrEfiDesLar, Set cliBhrs) {
       this.bhrEfiId = bhrEfiId;
       this.calId = calId;
       this.bhrEfiDes = bhrEfiDes;
       this.bhrEfiLimInf = bhrEfiLimInf;
       this.bhrEfiLimSup = bhrEfiLimSup;
       this.bhrEfiOrdPre = bhrEfiOrdPre;
       this.bhrEfiPto = bhrEfiPto;
       this.bhrEfiWoe = bhrEfiWoe;
       this.bhrEfiDesLar = bhrEfiDesLar;
       this.cliBhrs = cliBhrs;
    }
   
    public int getBhrEfiId() {
        return this.bhrEfiId;
    }
    
    public void setBhrEfiId(int bhrEfiId) {
        this.bhrEfiId = bhrEfiId;
    }
    public Integer getCalId() {
        return this.calId;
    }
    
    public void setCalId(Integer calId) {
        this.calId = calId;
    }
    public String getBhrEfiDes() {
        return this.bhrEfiDes;
    }
    
    public void setBhrEfiDes(String bhrEfiDes) {
        this.bhrEfiDes = bhrEfiDes;
    }
    public Float getBhrEfiLimInf() {
        return this.bhrEfiLimInf;
    }
    
    public void setBhrEfiLimInf(Float bhrEfiLimInf) {
        this.bhrEfiLimInf = bhrEfiLimInf;
    }
    public Float getBhrEfiLimSup() {
        return this.bhrEfiLimSup;
    }
    
    public void setBhrEfiLimSup(Float bhrEfiLimSup) {
        this.bhrEfiLimSup = bhrEfiLimSup;
    }
    public Integer getBhrEfiOrdPre() {
        return this.bhrEfiOrdPre;
    }
    
    public void setBhrEfiOrdPre(Integer bhrEfiOrdPre) {
        this.bhrEfiOrdPre = bhrEfiOrdPre;
    }
    public Float getBhrEfiPto() {
        return this.bhrEfiPto;
    }
    
    public void setBhrEfiPto(Float bhrEfiPto) {
        this.bhrEfiPto = bhrEfiPto;
    }
    public Float getBhrEfiWoe() {
        return this.bhrEfiWoe;
    }
    
    public void setBhrEfiWoe(Float bhrEfiWoe) {
        this.bhrEfiWoe = bhrEfiWoe;
    }
    public String getBhrEfiDesLar() {
        return this.bhrEfiDesLar;
    }
    
    public void setBhrEfiDesLar(String bhrEfiDesLar) {
        this.bhrEfiDesLar = bhrEfiDesLar;
    }
    public Set getCliBhrs() {
        return this.cliBhrs;
    }
    
    public void setCliBhrs(Set cliBhrs) {
        this.cliBhrs = cliBhrs;
    }




}


