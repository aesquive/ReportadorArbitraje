package objetos;
// Generated 13-may-2011 8:17:31 by Hibernate Tools 3.2.1.GA



/**
 * StaMta generated by hbm2java
 */
public class StaMta  implements java.io.Serializable {


     private int staMtaId;
     private String staMtaDes;

    public StaMta() {
    }

	
    public StaMta(int staMtaId) {
        this.staMtaId = staMtaId;
    }
    public StaMta(int staMtaId, String staMtaDes) {
       this.staMtaId = staMtaId;
       this.staMtaDes = staMtaDes;
    }
   
    public int getStaMtaId() {
        return this.staMtaId;
    }
    
    public void setStaMtaId(int staMtaId) {
        this.staMtaId = staMtaId;
    }
    public String getStaMtaDes() {
        return this.staMtaDes;
    }
    
    public void setStaMtaDes(String staMtaDes) {
        this.staMtaDes = staMtaDes;
    }




}


