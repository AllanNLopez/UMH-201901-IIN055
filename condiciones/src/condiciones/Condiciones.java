/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condiciones;
import java.util.Scanner;
/**
 *
 * @author MI-PC
 */
public class Condiciones {
    
    public static void main(String[] args) { 
        Scanner entrada = new Scanner(System.in); 
        int disponibleSol = 100;
        int disponibleSombra = 100;
        int disponibleSilla = 100; 
        int tipoLocalidad = 0;
        int cantBoletos = 0;
        String nombreLocalidad = "";
        double totalAPagar = 0;
        
        System.out.println("------ BOLETERIA -----------");
        System.out.println(" 1. Localidad Sol    .......   50.00 Lps");
        System.out.println(" 2. Localidad Sombra .......  100.00 Lps");
        System.out.println(" 3. Localidad Silla  .......  150.00 Lps");
        System.out.println("Ingrese la localidad que desea ingresar... ");
        tipoLocalidad = entrada.nextInt();
        
        System.out.println("Cuantos boletos ordenara? ");
        cantBoletos = entrada.nextInt();
        
        if(tipoLocalidad == 1){
            //evaluar que hayan dispobibles
            if(disponibleSol > cantBoletos){
                totalAPagar = cantBoletos * 50;
            } else {
                System.err.println("No hay suficientes localidades. Intente de nuevo. ");
            }
        } else if ( tipoLocalidad == 2){
            if(disponibleSombra > cantBoletos){
                totalAPagar = cantBoletos * 100;
            }else {
                System.err.println("No hay suficientes localidades. Intente de nuevo. Vea otras localidades ");
            }
        }else if ( tipoLocalidad == 3){
            if(disponibleSilla > cantBoletos){
                totalAPagar = cantBoletos * 150;
            }else {
                System.err.println("No hay suficientes localidades. Intente de nuevo. Vea otras localidades ");
            }
        }else {
            System.err.println("La localidad que digito no es valida... ");
        }
        
        System.out.println("----- FACTURA ----------------");
        System.out.println(" Boletos  "+nombreLocalidad+ ": "+cantBoletos);
        System.out.println(" Total a pagar .............. "+totalAPagar);
        
        
    }
    
}
