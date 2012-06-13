package baseMeta.objetos;
// Generated 1/04/2010 01:02:42 AM by Hibernate Tools 3.2.1.GA


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * CliBhr generated by hbm2java
 */
public class CliBhr  implements java.io.Serializable {


     private BigDecimal cliBhrId;
     private BhrIngViv bhrIngViv;
     private BhrMenIng bhrMenIng;
     private Ocp ocp;
     private Eda eda;
     private BhrAct bhrAct;
     private Edo edo;
     private BhrEfi bhrEfi;
     private BhrCtaPurRie bhrCtaPurRie;
     private BhrPagPtlCnt bhrPagPtlCnt;
     private BigDecimal ciId;
     private BigDecimal ftrPprId;
     private BigDecimal intPiId;
     private Set<PagCliBhr> pagCliBhrs = new HashSet<PagCliBhr>(0);

    public CliBhr() {
    }

	
    public CliBhr(BigDecimal cliBhrId) {
        this.cliBhrId = cliBhrId;
    }
    public CliBhr(BigDecimal cliBhrId, BhrIngViv bhrIngViv, BhrMenIng bhrMenIng, Ocp ocp, Eda eda, BhrAct bhrAct, Edo edo, BhrEfi bhrEfi, BhrCtaPurRie bhrCtaPurRie, BhrPagPtlCnt bhrPagPtlCnt, BigDecimal ciId, BigDecimal ftrPprId, BigDecimal intPiId, Set<PagCliBhr> pagCliBhrs) {
       this.cliBhrId = cliBhrId;
       this.bhrIngViv = bhrIngViv;
       this.bhrMenIng = bhrMenIng;
       this.ocp = ocp;
       this.eda = eda;
       this.bhrAct = bhrAct;
       this.edo = edo;
       this.bhrEfi = bhrEfi;
       this.bhrCtaPurRie = bhrCtaPurRie;
       this.bhrPagPtlCnt = bhrPagPtlCnt;
       this.ciId = ciId;
       this.ftrPprId = ftrPprId;
       this.intPiId = intPiId;
       this.pagCliBhrs = pagCliBhrs;
    }
   
    public BigDecimal getCliBhrId() {
        return this.cliBhrId;
    }
    
    public void setCliBhrId(BigDecimal cliBhrId) {
        this.cliBhrId = cliBhrId;
    }
    public BhrIngViv getBhrIngViv() {
        return this.bhrIngViv;
    }
    
    public void setBhrIngViv(BhrIngViv bhrIngViv) {
        this.bhrIngViv = bhrIngViv;
    }
    public BhrMenIng getBhrMenIng() {
        return this.bhrMenIng;
    }
    
    public void setBhrMenIng(BhrMenIng bhrMenIng) {
        this.bhrMenIng = bhrMenIng;
    }
    public Ocp getOcp() {
        return this.ocp;
    }
    
    public void setOcp(Ocp ocp) {
        this.ocp = ocp;
    }
    public Eda getEda() {
        return this.eda;
    }
    
    public void setEda(Eda eda) {
        this.eda = eda;
    }
    public BhrAct getBhrAct() {
        return this.bhrAct;
    }
    
    public void setBhrAct(BhrAct bhrAct) {
        this.bhrAct = bhrAct;
    }
    public Edo getEdo() {
        return this.edo;
    }
    
    public void setEdo(Edo edo) {
        this.edo = edo;
    }
    public BhrEfi getBhrEfi() {
        return this.bhrEfi;
    }
    
    public void setBhrEfi(BhrEfi bhrEfi) {
        this.bhrEfi = bhrEfi;
    }
    public BhrCtaPurRie getBhrCtaPurRie() {
        return this.bhrCtaPurRie;
    }
    
    public void setBhrCtaPurRie(BhrCtaPurRie bhrCtaPurRie) {
        this.bhrCtaPurRie = bhrCtaPurRie;
    }
    public BhrPagPtlCnt getBhrPagPtlCnt() {
        return this.bhrPagPtlCnt;
    }
    
    public void setBhrPagPtlCnt(BhrPagPtlCnt bhrPagPtlCnt) {
        this.bhrPagPtlCnt = bhrPagPtlCnt;
    }
    public BigDecimal getCiId() {
        return this.ciId;
    }
    
    public void setCiId(BigDecimal ciId) {
        this.ciId = ciId;
    }
    public BigDecimal getFtrPprId() {
        return this.ftrPprId;
    }
    
    public void setFtrPprId(BigDecimal ftrPprId) {
        this.ftrPprId = ftrPprId;
    }
    public BigDecimal getIntPiId() {
        return this.intPiId;
    }
    
    public void setIntPiId(BigDecimal intPiId) {
        this.intPiId = intPiId;
    }
    public Set<PagCliBhr> getPagCliBhrs() {
        return this.pagCliBhrs;
    }
    
    public void setPagCliBhrs(Set<PagCliBhr> pagCliBhrs) {
        this.pagCliBhrs = pagCliBhrs;
    }




}


