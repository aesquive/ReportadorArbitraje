package objetos;
// Generated 13-may-2011 8:17:31 by Hibernate Tools 3.2.1.GA



/**
 * NivEstPap generated by hbm2java
 */
public class NivEstPap  implements java.io.Serializable {


     private int nivEstPapId;
     private Cal cal;
     private String nivEstPapDes;
     private Float nivEstPapLimInf;
     private Float nivEstPapLimSup;
     private Integer nivEstPapOrdPre;
     private Float nivEstPapPto;
     private Float nivEstPapWoe;
     private String nivEstPapDesLar;

    public NivEstPap() {
    }

	
    public NivEstPap(int nivEstPapId) {
        this.nivEstPapId = nivEstPapId;
    }
    public NivEstPap(int nivEstPapId, Cal cal, String nivEstPapDes, Float nivEstPapLimInf, Float nivEstPapLimSup, Integer nivEstPapOrdPre, Float nivEstPapPto, Float nivEstPapWoe, String nivEstPapDesLar) {
       this.nivEstPapId = nivEstPapId;
       this.cal = cal;
       this.nivEstPapDes = nivEstPapDes;
       this.nivEstPapLimInf = nivEstPapLimInf;
       this.nivEstPapLimSup = nivEstPapLimSup;
       this.nivEstPapOrdPre = nivEstPapOrdPre;
       this.nivEstPapPto = nivEstPapPto;
       this.nivEstPapWoe = nivEstPapWoe;
       this.nivEstPapDesLar = nivEstPapDesLar;
    }
   
    public int getNivEstPapId() {
        return this.nivEstPapId;
    }
    
    public void setNivEstPapId(int nivEstPapId) {
        this.nivEstPapId = nivEstPapId;
    }
    public Cal getCal() {
        return this.cal;
    }
    
    public void setCal(Cal cal) {
        this.cal = cal;
    }
    public String getNivEstPapDes() {
        return this.nivEstPapDes;
    }
    
    public void setNivEstPapDes(String nivEstPapDes) {
        this.nivEstPapDes = nivEstPapDes;
    }
    public Float getNivEstPapLimInf() {
        return this.nivEstPapLimInf;
    }
    
    public void setNivEstPapLimInf(Float nivEstPapLimInf) {
        this.nivEstPapLimInf = nivEstPapLimInf;
    }
    public Float getNivEstPapLimSup() {
        return this.nivEstPapLimSup;
    }
    
    public void setNivEstPapLimSup(Float nivEstPapLimSup) {
        this.nivEstPapLimSup = nivEstPapLimSup;
    }
    public Integer getNivEstPapOrdPre() {
        return this.nivEstPapOrdPre;
    }
    
    public void setNivEstPapOrdPre(Integer nivEstPapOrdPre) {
        this.nivEstPapOrdPre = nivEstPapOrdPre;
    }
    public Float getNivEstPapPto() {
        return this.nivEstPapPto;
    }
    
    public void setNivEstPapPto(Float nivEstPapPto) {
        this.nivEstPapPto = nivEstPapPto;
    }
    public Float getNivEstPapWoe() {
        return this.nivEstPapWoe;
    }
    
    public void setNivEstPapWoe(Float nivEstPapWoe) {
        this.nivEstPapWoe = nivEstPapWoe;
    }
    public String getNivEstPapDesLar() {
        return this.nivEstPapDesLar;
    }
    
    public void setNivEstPapDesLar(String nivEstPapDesLar) {
        this.nivEstPapDesLar = nivEstPapDesLar;
    }




}


