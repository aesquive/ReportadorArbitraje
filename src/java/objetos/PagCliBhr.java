package objetos;
// Generated 13-may-2011 8:17:31 by Hibernate Tools 3.2.1.GA



/**
 * PagCliBhr generated by hbm2java
 */
public class PagCliBhr  implements java.io.Serializable {


     private int pagCliBhrId;
     private CliBhr cliBhr;
     private Integer pagCliBhrNum;
     private Float pagCliBhrMto;

    public PagCliBhr() {
    }

	
    public PagCliBhr(int pagCliBhrId) {
        this.pagCliBhrId = pagCliBhrId;
    }
    public PagCliBhr(int pagCliBhrId, CliBhr cliBhr, Integer pagCliBhrNum, Float pagCliBhrMto) {
       this.pagCliBhrId = pagCliBhrId;
       this.cliBhr = cliBhr;
       this.pagCliBhrNum = pagCliBhrNum;
       this.pagCliBhrMto = pagCliBhrMto;
    }
   
    public int getPagCliBhrId() {
        return this.pagCliBhrId;
    }
    
    public void setPagCliBhrId(int pagCliBhrId) {
        this.pagCliBhrId = pagCliBhrId;
    }
    public CliBhr getCliBhr() {
        return this.cliBhr;
    }
    
    public void setCliBhr(CliBhr cliBhr) {
        this.cliBhr = cliBhr;
    }
    public Integer getPagCliBhrNum() {
        return this.pagCliBhrNum;
    }
    
    public void setPagCliBhrNum(Integer pagCliBhrNum) {
        this.pagCliBhrNum = pagCliBhrNum;
    }
    public Float getPagCliBhrMto() {
        return this.pagCliBhrMto;
    }
    
    public void setPagCliBhrMto(Float pagCliBhrMto) {
        this.pagCliBhrMto = pagCliBhrMto;
    }




}


