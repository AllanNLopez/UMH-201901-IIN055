package guia2.ejercicio2;
import java.util.Scanner;
public class Guia2Ejercicio2 { 
    public static void main(String[] args) {
       Cliente misClientes[] = new Cliente[50];
       tipoCliente tipificador = new tipoCliente();
       Scanner entrada = new Scanner(System.in);
       int resp =0;
       int cont =0;
       int indice =0;
       
       while(resp != -1){
           System.out.println("\n\n\n\n  ");
           System.out.println("==================================================");
           System.out.println("                     Bienvenido                  "); 
           System.out.println("==================================================");
           System.out.println("1. Ingresar un cliente");
           System.out.println("2. Mostrar mis clientes");
           System.out.println("3. Mostrar informacion de un cliente");
           System.out.println("4. Salir del programa");
           System.out.println("Seleccione una opcion... ");
           resp = entrada.nextInt();
           switch(resp){
               case 1: 
                   misClientes[cont] = new Cliente();
                   System.out.print("Ingrese nombre del cliente... ");
                   misClientes[cont].setNombreJuridico(entrada.next()); 
                   System.out.print("Ingrese Facturacion mensual del cliente... ");
                   misClientes[cont].setFacturacionMensual(entrada.nextDouble());
                   System.out.print("Ingrese cantidad de empleados... ");
                   misClientes[cont].setCantEmpleados(entrada.nextInt());
                   cont++;
                   System.out.println("Cliente ingresado con exito...");
                   break;
               case 2: 
                   System.out.println("-------------- mis clientes -----------------");
                   System.out.println("No\tNombre \tEmpleados \tFacturacion\tTipo Cliente");
                   for(int i=0; i<cont; i++){
                       System.out.print(
                                (i+1)+"\t"+
                                misClientes[i].getNombreJuridico()+"\t"+
                                misClientes[i].getCantEmpleados()+"\t"+
                                misClientes[i].getFacturacionMensual()+"\t"+
                                tipificador.getTipoCliente(
                                        misClientes[i].getFacturacionMensual(),
                                        misClientes[i].getCantEmpleados()
                                        )+"\n"
                                );
                   }
                   System.out.println("=============================================");
                   break;
               case 3:
                    System.out.print("Ingrese el numero de lista... ");
                    indice = entrada.nextInt();
                    if(cont>0){
                        System.out.println("------ Detalle de cliente ----------------- ");
                        misClientes[indice-1].imprimirInfoCliente();
                        System.out.println("Tipo de cliente... "+ tipificador.getTipoCliente(
                                                                        misClientes[indice-1].getFacturacionMensual(),
                                                                        misClientes[indice-1].getCantEmpleados()
                                                                        ));
                    }else{
                        System.err.println("No hay ningun registro... ");
                    }
                    break;
               case 4: 
                    System.err.println("*************************************************");
                    System.out.println("El programa ha finalizado... ");
                    resp=-1;
                    break;
               default: break;
           }
           
       }
    }
    
}
