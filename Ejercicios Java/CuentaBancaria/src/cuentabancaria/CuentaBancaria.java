/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentabancaria;
import java.util.Scanner;
/**
 *
 * @author MI-PC
 */
public class CuentaBancaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String numeroCuenta = "2901231312";
        double saldoDisponible = 500;
        double totalRetiros = 0;
        double totalDepositos = 500;
        double creditoPendiente = 0;    
        double monto = 0;
        int resp = 0;
        
        while(resp != -1){
            System.out.println("---- Bienvenido a su banca electronica ---- ");
            System.out.println(" 1. Consulta de saldo  "); 
            System.out.println(" 2. Realizar una transaccion ");
            System.out.println(" 3. Solicitar un credito rapido");
            System.out.println("-1. Salir ");
            System.out.println(" Que desea realizar... ? ");
            resp = entrada.nextInt(); 
            
            switch(resp){
                case 1:
                    System.out.println("");
                    System.out.println("----------------------------------------");
                    System.out.println("El estado de la cuenta "+numeroCuenta);
                    System.out.println("Total de depositos... "+totalDepositos);
                    System.out.println("Total de retiros...   ("+totalRetiros+")");
                    System.out.println("----------------------------------------");
                    System.out.println("Saldo disponible...   "+saldoDisponible);
                    System.out.println("----------------------------------------");
                    System.out.println("Credito pendiente....  "+creditoPendiente);
                    break;
                case 2: 
                    System.out.println("");
                    System.out.println("Debito de cuenta #"+numeroCuenta);
                    System.out.println("Saldo disponible...   "+saldoDisponible);
                    System.out.println("Ingrese el monto a transferir... ");
                    monto = entrada.nextDouble();
                    
                    if((saldoDisponible-monto)> 100){
                        totalRetiros += monto;
                        saldoDisponible = totalDepositos - totalRetiros;
                    }else{
                        System.err.println("No se puede transferir, monto mayor al disponible");
                        resp = 0;
                    }
                    break;
                case 3: 
                    System.out.println("----------------------------------------");
                    System.out.println("Credito rapido a cuenta #"+numeroCuenta);
                    System.out.println("Ingrese el monto requerido... ");
                    monto = entrada.nextDouble();
                    if(monto<(saldoDisponible*3)+1){
                        totalDepositos += monto;
                        creditoPendiente +=monto;
                        saldoDisponible = totalDepositos - totalRetiros;
                    }else{
                       System.err.println("Monto no valido, excede el permitido.");
                       resp = 0; 
                    }
                    break;
                default: 
                        resp = 0;
            }
            System.out.println("");
            System.out.println(" ===================================================  "); 
            System.out.println(" Presione -1 para salir, 0 para volver al menu ");
            resp = entrada.nextInt();
            
        }
        
    }
    
}
