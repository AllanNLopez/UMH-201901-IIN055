/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversordivisas;
import java.util.Scanner;
/**
 *
 * @author MI-PC
 */
public class ConversorDivisas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Divisa divisa1 = new Divisa();
       Divisa divisa2 = new Divisa();
       Divisa divisa3 = new Divisa();
       Scanner entrada = new Scanner(System.in);
       
       //Pedir informacion de la divisa... 
       divisa1.pedirInfo();
       divisa2.pedirInfo();
       divisa3.pedirInfo();
       
       //imprimir resultados.
       System.out.println("Resultados... ");
       System.out.println(divisa1.getInfo());
       System.out.println(divisa2.getInfo());
       System.out.println(divisa3.getInfo());
       
    }
    
}
