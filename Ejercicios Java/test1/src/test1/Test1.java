package test1;
import java.util.Scanner; //importar el objeto Scanner de lectura de datos.

public class Test1 {
    public static void main(String[] args) {
        //declaracion de una varible en java
        int     numeroEntero = 0; //variable de tipo numero entero
        double  numeroDecimal =0; //variable del tipo numero decimal
        long    numeroExtenso =0; //variable del tipo numero extenso
        boolean datoBooleano = true;  //variable del tipo booleano (verdadero/falso)
        char    datoCaracter = 'a'; //vaible de un caracter
        String  cadenaCaracteres = ""; //variable que contiene una cadena de caracterews
        
        //declaracion e instanciacion de un objeto Scanner
        Scanner objScanner = new Scanner(System.in);
        
        //escribir en pantalla
        System.out.println("Esta es un texto con salto de linea... ");
        System.out.print("Esta es un texto sin salto de linea... ");
        
        System.out.println();
        //pedir datos a un usuario
        System.out.println(" ------------ Pidiendo datos al usuario ------------  ");
        System.out.print("Ingrese un numero entero... ");
        numeroEntero = objScanner.nextInt(); //leer dato en pantalla
        System.out.print("Ingrese un numero decimal... ");
        numeroDecimal = objScanner.nextDouble();
        System.out.print("Ingrese un numero extenso... ");
        numeroExtenso = objScanner.nextLong();
        System.out.print("Ingrese un texto... ");
        cadenaCaracteres = objScanner.nextLine();
        
        //Escribir variables
        System.out.println(" -------------- imprimiendo resultados  -------------------  ");
        System.out.println("Este es un numero entero...  "+numeroEntero);
        System.out.println("Este es un numero decimal...  "+numeroDecimal);
        System.out.println("Este es un numero extenso...  "+numeroExtenso);
        System.out.println("Este es un dato Booleano...  "+datoBooleano);
        System.out.println("Este es un caracter...  "+datoCaracter);
        System.out.println("Esta es una cadena de caracteres...  "+cadenaCaracteres); 
                
    }
    
}
