package objetos;
// Generated 13-may-2011 8:17:31 by Hibernate Tools 3.2.1.GA



/**
 * CreOtr generated by hbm2java
 */
public class CreOtr  implements java.io.Serializable {


     private int creOtrId;
     private Cal cal;
     private String creOtrDes;
     private Float creOtrLimInf;
     private Float creOtrLimSup;
     private Integer creOtrOrdPre;
     private Float creOtrPto;
     private Float creOtrWoe;
     private String creOtrDesLar;

    public CreOtr() {
    }

	
    public CreOtr(int creOtrId) {
        this.creOtrId = creOtrId;
    }
    public CreOtr(int creOtrId, Cal cal, String creOtrDes, Float creOtrLimInf, Float creOtrLimSup, Integer creOtrOrdPre, Float creOtrPto, Float creOtrWoe, String creOtrDesLar) {
       this.creOtrId = creOtrId;
       this.cal = cal;
       this.creOtrDes = creOtrDes;
       this.creOtrLimInf = creOtrLimInf;
       this.creOtrLimSup = creOtrLimSup;
       this.creOtrOrdPre = creOtrOrdPre;
       this.creOtrPto = creOtrPto;
       this.creOtrWoe = creOtrWoe;
       this.creOtrDesLar = creOtrDesLar;
    }
   
    public int getCreOtrId() {
        return this.creOtrId;
    }
    
    public void setCreOtrId(int creOtrId) {
        this.creOtrId = creOtrId;
    }
    public Cal getCal() {
        return this.cal;
    }
    
    public void setCal(Cal cal) {
        this.cal = cal;
    }
    public String getCreOtrDes() {
        return this.creOtrDes;
    }
    
    public void setCreOtrDes(String creOtrDes) {
        this.creOtrDes = creOtrDes;
    }
    public Float getCreOtrLimInf() {
        return this.creOtrLimInf;
    }
    
    public void setCreOtrLimInf(Float creOtrLimInf) {
        this.creOtrLimInf = creOtrLimInf;
    }
    public Float getCreOtrLimSup() {
        return this.creOtrLimSup;
    }
    
    public void setCreOtrLimSup(Float creOtrLimSup) {
        this.creOtrLimSup = creOtrLimSup;
    }
    public Integer getCreOtrOrdPre() {
        return this.creOtrOrdPre;
    }
    
    public void setCreOtrOrdPre(Integer creOtrOrdPre) {
        this.creOtrOrdPre = creOtrOrdPre;
    }
    public Float getCreOtrPto() {
        return this.creOtrPto;
    }
    
    public void setCreOtrPto(Float creOtrPto) {
        this.creOtrPto = creOtrPto;
    }
    public Float getCreOtrWoe() {
        return this.creOtrWoe;
    }
    
    public void setCreOtrWoe(Float creOtrWoe) {
        this.creOtrWoe = creOtrWoe;
    }
    public String getCreOtrDesLar() {
        return this.creOtrDesLar;
    }
    
    public void setCreOtrDesLar(String creOtrDesLar) {
        this.creOtrDesLar = creOtrDesLar;
    }




}


