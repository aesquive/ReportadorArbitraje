package baseMeta.objetos;
// Generated 1/04/2010 01:02:42 AM by Hibernate Tools 3.2.1.GA


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * BhrEfi generated by hbm2java
 */
public class BhrEfi  implements java.io.Serializable {


     private BigDecimal bhrEfiId;
     private BigDecimal calId;
     private String bhrEfiDes;
     private Double bhrEfiLimInf;
     private Double bhrEfiLimSup;
     private BigDecimal bhrEfiOrdPre;
     private Double bhrEfiPto;
     private Double bhrEfiWoe;
     private String bhrEfiDesLar;
     private Set<CliBhr> cliBhrs = new HashSet<CliBhr>(0);

    public BhrEfi() {
    }

	
    public BhrEfi(BigDecimal bhrEfiId) {
        this.bhrEfiId = bhrEfiId;
    }
    public BhrEfi(BigDecimal bhrEfiId, BigDecimal calId, String bhrEfiDes, Double bhrEfiLimInf, Double bhrEfiLimSup, BigDecimal bhrEfiOrdPre, Double bhrEfiPto, Double bhrEfiWoe, String bhrEfiDesLar, Set<CliBhr> cliBhrs) {
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
   
    public BigDecimal getBhrEfiId() {
        return this.bhrEfiId;
    }
    
    public void setBhrEfiId(BigDecimal bhrEfiId) {
        this.bhrEfiId = bhrEfiId;
    }
    public BigDecimal getCalId() {
        return this.calId;
    }
    
    public void setCalId(BigDecimal calId) {
        this.calId = calId;
    }
    public String getBhrEfiDes() {
        return this.bhrEfiDes;
    }
    
    public void setBhrEfiDes(String bhrEfiDes) {
        this.bhrEfiDes = bhrEfiDes;
    }
    public Double getBhrEfiLimInf() {
        return this.bhrEfiLimInf;
    }
    
    public void setBhrEfiLimInf(Double bhrEfiLimInf) {
        this.bhrEfiLimInf = bhrEfiLimInf;
    }
    public Double getBhrEfiLimSup() {
        return this.bhrEfiLimSup;
    }
    
    public void setBhrEfiLimSup(Double bhrEfiLimSup) {
        this.bhrEfiLimSup = bhrEfiLimSup;
    }
    public BigDecimal getBhrEfiOrdPre() {
        return this.bhrEfiOrdPre;
    }
    
    public void setBhrEfiOrdPre(BigDecimal bhrEfiOrdPre) {
        this.bhrEfiOrdPre = bhrEfiOrdPre;
    }
    public Double getBhrEfiPto() {
        return this.bhrEfiPto;
    }
    
    public void setBhrEfiPto(Double bhrEfiPto) {
        this.bhrEfiPto = bhrEfiPto;
    }
    public Double getBhrEfiWoe() {
        return this.bhrEfiWoe;
    }
    
    public void setBhrEfiWoe(Double bhrEfiWoe) {
        this.bhrEfiWoe = bhrEfiWoe;
    }
    public String getBhrEfiDesLar() {
        return this.bhrEfiDesLar;
    }
    
    public void setBhrEfiDesLar(String bhrEfiDesLar) {
        this.bhrEfiDesLar = bhrEfiDesLar;
    }
    public Set<CliBhr> getCliBhrs() {
        return this.cliBhrs;
    }
    
    public void setCliBhrs(Set<CliBhr> cliBhrs) {
        this.cliBhrs = cliBhrs;
    }




}

