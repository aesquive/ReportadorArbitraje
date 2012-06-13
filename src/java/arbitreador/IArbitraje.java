/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arbitreador;

import java.util.Date;

/**
 *
 * @author alberto
 */
public interface IArbitraje {
    
    Integer getId();
    void setId(Integer id);
     Integer getUsuId();
     void setUsuId(Integer usuId);
     Integer getCliId();
     void setCliId(Integer cliId);
      String getCve();
      void setCve(String cve);
      Date getFec();
      void setFec(Date fec);
}
