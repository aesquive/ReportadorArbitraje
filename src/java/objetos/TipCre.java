package objetos;
// Generated 13-may-2011 8:17:31 by Hibernate Tools 3.2.1.GA



/**
 * TipCre generated by hbm2java
 */
public class TipCre  implements java.io.Serializable {


     private int tipCreId;
     private Integer calId;
     private String tipCreDes;
     private Float tipCreLimInf;
     private Float tipCreLimSup;
     private Integer tipCreOrdPre;
     private Float tipCrePto;
     private Float tipCreWoe;
     private String tipCreDesLar;

    public TipCre() {
    }

	
    public TipCre(int tipCreId) {
        this.tipCreId = tipCreId;
    }
    public TipCre(int tipCreId, Integer calId, String tipCreDes, Float tipCreLimInf, Float tipCreLimSup, Integer tipCreOrdPre, Float tipCrePto, Float tipCreWoe, String tipCreDesLar) {
       this.tipCreId = tipCreId;
       this.calId = calId;
       this.tipCreDes = tipCreDes;
       this.tipCreLimInf = tipCreLimInf;
       this.tipCreLimSup = tipCreLimSup;
       this.tipCreOrdPre = tipCreOrdPre;
       this.tipCrePto = tipCrePto;
       this.tipCreWoe = tipCreWoe;
       this.tipCreDesLar = tipCreDesLar;
    }
   
    public int getTipCreId() {
        return this.tipCreId;
    }
    
    public void setTipCreId(int tipCreId) {
        this.tipCreId = tipCreId;
    }
    public Integer getCalId() {
        return this.calId;
    }
    
    public void setCalId(Integer calId) {
        this.calId = calId;
    }
    public String getTipCreDes() {
        return this.tipCreDes;
    }
    
    public void setTipCreDes(String tipCreDes) {
        this.tipCreDes = tipCreDes;
    }
    public Float getTipCreLimInf() {
        return this.tipCreLimInf;
    }
    
    public void setTipCreLimInf(Float tipCreLimInf) {
        this.tipCreLimInf = tipCreLimInf;
    }
    public Float getTipCreLimSup() {
        return this.tipCreLimSup;
    }
    
    public void setTipCreLimSup(Float tipCreLimSup) {
        this.tipCreLimSup = tipCreLimSup;
    }
    public Integer getTipCreOrdPre() {
        return this.tipCreOrdPre;
    }
    
    public void setTipCreOrdPre(Integer tipCreOrdPre) {
        this.tipCreOrdPre = tipCreOrdPre;
    }
    public Float getTipCrePto() {
        return this.tipCrePto;
    }
    
    public void setTipCrePto(Float tipCrePto) {
        this.tipCrePto = tipCrePto;
    }
    public Float getTipCreWoe() {
        return this.tipCreWoe;
    }
    
    public void setTipCreWoe(Float tipCreWoe) {
        this.tipCreWoe = tipCreWoe;
    }
    public String getTipCreDesLar() {
        return this.tipCreDesLar;
    }
    
    public void setTipCreDesLar(String tipCreDesLar) {
        this.tipCreDesLar = tipCreDesLar;
    }




}


