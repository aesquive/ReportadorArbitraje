/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package base;

import java.util.List;
import objetos.Usu;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.SimpleExpression;

/**
 *
 * @author alberto
 */
public class Dao {
    
    private static Session sesion;
    
    public Dao(){
        sesion= sesion==null ? HibernateUtil.getSessionFactory().openSession() :sesion;
    }
    
    
    public List getTabla(Class clase){
        return sesion.createCriteria(clase).list();
    }

    public Object get(Class clase, Criterion criterio) {
        List list = sesion.createCriteria(clase).add(criterio).list();
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }
    
    public static void main(String[] args) {
        Dao dao=new Dao();
    }
    
}
