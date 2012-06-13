package baseMeta.objetos;
// Generated 1/04/2010 01:02:42 AM by Hibernate Tools 3.2.1.GA


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * BanPorUso generated by hbm2java
 */
public class BanPorUso  implements java.io.Serializable {


     private BigDecimal banPorUsoId;
     private Cal cal;
     private String banPorUsoDes;
     private Double banPorUsoLimInf;
     private Double banPorUsoLimSup;
     private BigDecimal banPorUsoOrdPre;
     private Double banPorUsoPto;
     private Double banPorUsoWoe;
     private String banPorUsoDesLar;
     private Set<CliMta> cliMtas = new HashSet<CliMta>(0);

    public BanPorUso() {
    }

	
    public BanPorUso(BigDecimal banPorUsoId) {
        this.banPorUsoId = banPorUsoId;
    }
    public BanPorUso(BigDecimal banPorUsoId, Cal cal, String banPorUsoDes, Double banPorUsoLimInf, Double banPorUsoLimSup, BigDecimal banPorUsoOrdPre, Double banPorUsoPto, Double banPorUsoWoe, String banPorUsoDesLar, Set<CliMta> cliMtas) {
       this.banPorUsoId = banPorUsoId;
       this.cal = cal;
       this.banPorUsoDes = banPorUsoDes;
       this.banPorUsoLimInf = banPorUsoLimInf;
       this.banPorUsoLimSup = banPorUsoLimSup;
       this.banPorUsoOrdPre = banPorUsoOrdPre;
       this.banPorUsoPto = banPorUsoPto;
       this.banPorUsoWoe = banPorUsoWoe;
       this.banPorUsoDesLar = banPorUsoDesLar;
       this.cliMtas = cliMtas;
    }
   
    public BigDecimal getBanPorUsoId() {
        return this.banPorUsoId;
    }
    
    public void setBanPorUsoId(BigDecimal banPorUsoId) {
        this.banPorUsoId = banPorUsoId;
    }
    public Cal getCal() {
        return this.cal;
    }
    
    public void setCal(Cal cal) {
        this.cal = cal;
    }
    public String getBanPorUsoDes() {
        return this.banPorUsoDes;
    }
    
    public void setBanPorUsoDes(String banPorUsoDes) {
        this.banPorUsoDes = banPorUsoDes;
    }
    public Double getBanPorUsoLimInf() {
        return this.banPorUsoLimInf;
    }
    
    public void setBanPorUsoLimInf(Double banPorUsoLimInf) {
        this.banPorUsoLimInf = banPorUsoLimInf;
    }
    public Double getBanPorUsoLimSup() {
        return this.banPorUsoLimSup;
    }
    
    public void setBanPorUsoLimSup(Double banPorUsoLimSup) {
        this.banPorUsoLimSup = banPorUsoLimSup;
    }
    public BigDecimal getBanPorUsoOrdPre() {
        return this.banPorUsoOrdPre;
    }
    
    public void setBanPorUsoOrdPre(BigDecimal banPorUsoOrdPre) {
        this.banPorUsoOrdPre = banPorUsoOrdPre;
    }
    public Double getBanPorUsoPto() {
        return this.banPorUsoPto;
    }
    
    public void setBanPorUsoPto(Double banPorUsoPto) {
        this.banPorUsoPto = banPorUsoPto;
    }
    public Double getBanPorUsoWoe() {
        return this.banPorUsoWoe;
    }
    
    public void setBanPorUsoWoe(Double banPorUsoWoe) {
        this.banPorUsoWoe = banPorUsoWoe;
    }
    public String getBanPorUsoDesLar() {
        return this.banPorUsoDesLar;
    }
    
    public void setBanPorUsoDesLar(String banPorUsoDesLar) {
        this.banPorUsoDesLar = banPorUsoDesLar;
    }
    public Set<CliMta> getCliMtas() {
        return this.cliMtas;
    }
    
    public void setCliMtas(Set<CliMta> cliMtas) {
        this.cliMtas = cliMtas;
    }




}


