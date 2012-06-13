package baseMeta.objetos;
// Generated 1/04/2010 01:02:42 AM by Hibernate Tools 3.2.1.GA


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * BhrCtaPurRie generated by hbm2java
 */
public class BhrCtaPurRie  implements java.io.Serializable {


     private BigDecimal bhrCtaPurRieId;
     private BigDecimal calId;
     private String bhrCtaPurRieDes;
     private Double bhrCtaPurRieLimInf;
     private Double bhrCtaPurRieLimSup;
     private BigDecimal bhrCtaPurRieOrdPre;
     private Double bhrCtaPurRiePto;
     private Double bhrCtaPurRieWoe;
     private String bhrCtaPurRieDesLar;
     private Set<CliBhr> cliBhrs = new HashSet<CliBhr>(0);

    public BhrCtaPurRie() {
    }

	
    public BhrCtaPurRie(BigDecimal bhrCtaPurRieId) {
        this.bhrCtaPurRieId = bhrCtaPurRieId;
    }
    public BhrCtaPurRie(BigDecimal bhrCtaPurRieId, BigDecimal calId, String bhrCtaPurRieDes, Double bhrCtaPurRieLimInf, Double bhrCtaPurRieLimSup, BigDecimal bhrCtaPurRieOrdPre, Double bhrCtaPurRiePto, Double bhrCtaPurRieWoe, String bhrCtaPurRieDesLar, Set<CliBhr> cliBhrs) {
       this.bhrCtaPurRieId = bhrCtaPurRieId;
       this.calId = calId;
       this.bhrCtaPurRieDes = bhrCtaPurRieDes;
       this.bhrCtaPurRieLimInf = bhrCtaPurRieLimInf;
       this.bhrCtaPurRieLimSup = bhrCtaPurRieLimSup;
       this.bhrCtaPurRieOrdPre = bhrCtaPurRieOrdPre;
       this.bhrCtaPurRiePto = bhrCtaPurRiePto;
       this.bhrCtaPurRieWoe = bhrCtaPurRieWoe;
       this.bhrCtaPurRieDesLar = bhrCtaPurRieDesLar;
       this.cliBhrs = cliBhrs;
    }
   
    public BigDecimal getBhrCtaPurRieId() {
        return this.bhrCtaPurRieId;
    }
    
    public void setBhrCtaPurRieId(BigDecimal bhrCtaPurRieId) {
        this.bhrCtaPurRieId = bhrCtaPurRieId;
    }
    public BigDecimal getCalId() {
        return this.calId;
    }
    
    public void setCalId(BigDecimal calId) {
        this.calId = calId;
    }
    public String getBhrCtaPurRieDes() {
        return this.bhrCtaPurRieDes;
    }
    
    public void setBhrCtaPurRieDes(String bhrCtaPurRieDes) {
        this.bhrCtaPurRieDes = bhrCtaPurRieDes;
    }
    public Double getBhrCtaPurRieLimInf() {
        return this.bhrCtaPurRieLimInf;
    }
    
    public void setBhrCtaPurRieLimInf(Double bhrCtaPurRieLimInf) {
        this.bhrCtaPurRieLimInf = bhrCtaPurRieLimInf;
    }
    public Double getBhrCtaPurRieLimSup() {
        return this.bhrCtaPurRieLimSup;
    }
    
    public void setBhrCtaPurRieLimSup(Double bhrCtaPurRieLimSup) {
        this.bhrCtaPurRieLimSup = bhrCtaPurRieLimSup;
    }
    public BigDecimal getBhrCtaPurRieOrdPre() {
        return this.bhrCtaPurRieOrdPre;
    }
    
    public void setBhrCtaPurRieOrdPre(BigDecimal bhrCtaPurRieOrdPre) {
        this.bhrCtaPurRieOrdPre = bhrCtaPurRieOrdPre;
    }
    public Double getBhrCtaPurRiePto() {
        return this.bhrCtaPurRiePto;
    }
    
    public void setBhrCtaPurRiePto(Double bhrCtaPurRiePto) {
        this.bhrCtaPurRiePto = bhrCtaPurRiePto;
    }
    public Double getBhrCtaPurRieWoe() {
        return this.bhrCtaPurRieWoe;
    }
    
    public void setBhrCtaPurRieWoe(Double bhrCtaPurRieWoe) {
        this.bhrCtaPurRieWoe = bhrCtaPurRieWoe;
    }
    public String getBhrCtaPurRieDesLar() {
        return this.bhrCtaPurRieDesLar;
    }
    
    public void setBhrCtaPurRieDesLar(String bhrCtaPurRieDesLar) {
        this.bhrCtaPurRieDesLar = bhrCtaPurRieDesLar;
    }
    public Set<CliBhr> getCliBhrs() {
        return this.cliBhrs;
    }
    
    public void setCliBhrs(Set<CliBhr> cliBhrs) {
        this.cliBhrs = cliBhrs;
    }




}


