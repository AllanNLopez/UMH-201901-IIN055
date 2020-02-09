/*
  Clase Divisa: Contiene los datos generales de una divisa. 
 */
package conversordivisas;
import java.util.Scanner;
/**
 *
 * @author MI-PC
 */
public class Divisa {
    private String nombreDivisa;
    private String pais;
    private String simbolo;
    private double tasaCambio;
    private double montoLps;
    Scanner entrada;
    
    Divisa(){
        this.entrada = new Scanner(System.in);
    }
    
    public void setNombre(String pNombre){
        this.nombreDivisa = pNombre;
    }
    
    public void setPais(String pPais){
        this.pais = pPais;
    }
    
    public void setSimbolo(String pSimbolo){
        this.simbolo = pSimbolo;
    }
    
    public void setTasaCambio(double pTasa){
        this.tasaCambio = pTasa;
    }
    
    public void setMontoLps(double pMonto){
        this.montoLps = pMonto;
    }
    
    public double getConversion(){
        return montoLps*this.tasaCambio;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public double getTasaCambio() {
        return tasaCambio;
    }

    public double getMontoLps() {
        return montoLps;
    }
    
    public void pedirInfo(){ 
       System.out.print("Ingrese nombre... ");
       this.nombreDivisa = entrada.nextLine();
       System.out.print("Ingrese Pais... ");
       this.pais = entrada.nextLine();
       System.out.print("Ingrese Simbolo... ");
       this.simbolo = entrada.next();
       System.out.print("Ingrese tasa de cambio... ");
       this.tasaCambio = entrada.nextDouble();
       System.out.print("Ingrese monto en lempiras... ");
       this.montoLps = entrada.nextDouble();
    }
    
    public String getInfo(){
        String info;
        info = "================================= \n"+
               "Nombre: "+this.nombreDivisa+"\n"+
               "Pais: "+this.pais+"\n"+
               "Simbolo: "+this.simbolo+"\n"+
               "Tasa de cambio: "+this.tasaCambio+"\n"+
               "Monto en lempiras : "+this.montoLps+"\n"+
               "Conversion : "+this.simbolo+" "+this.getConversion()+"\n";; 
        return info;
    }
    
}
