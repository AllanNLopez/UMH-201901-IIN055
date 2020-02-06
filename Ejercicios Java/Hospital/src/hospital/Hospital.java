/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;
import java.util.Scanner;
import java.util.Set;
/**
 *
 * @author LAB-A2
 */
public class Hospital {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Paciente objPaciente = new Paciente();
       Paciente objPaciente1 = new Paciente();
       
       nutricion objNutricion = new nutricion();
       Scanner entrada = new Scanner(System.in);
       double tmb = 0;
       
       
       System.out.println("Ingrese el edad del paciente ");
       objPaciente.setEdad(entrada.nextInt());
       System.out.println("Ingrese altura en cms del paciente ");
       objPaciente.setAltura(entrada.nextDouble());        
       System.out.println("Ingrese sexo del paciente ");
       objPaciente.setSexo(entrada.next());
       System.out.println("Ingrese peso en kg");
       objPaciente.setPeso(entrada.nextDouble());
       
       System.out.println("La edad es... "+ objPaciente.getEdad());
       System.out.println("La altura es... "+ objPaciente.getAltura());
       System.out.println("La sexo es... "+ objPaciente.getSexo());
       System.out.println("El peso es... "+ objPaciente.getPeso());
       
       tmb = objNutricion.getTMB(
                        objPaciente.getPeso(), 
                        objPaciente.getAltura(), 
                        objPaciente.getEdad(), 
                        objPaciente.getSexo()
       );
       
       System.out.println("El paciente necesita consumir "+tmb+" Calorias");
       
       //paciente 1
       
       System.out.println("El peso es... ");
       System.out.println("Ingrese el edad del paciente ");
       objPaciente1.setEdad(entrada.nextInt());
       System.out.println("Ingrese altura en cms del paciente ");
       objPaciente1.setAltura(entrada.nextDouble());        
       System.out.println("Ingrese sexo del paciente ");
       objPaciente1.setSexo(entrada.next());
       System.out.println("Ingrese peso en kg");
       objPaciente1.setPeso(entrada.nextDouble());
       
       System.out.println("La edad es... "+ objPaciente1.getEdad());
       System.out.println("La altura es... "+ objPaciente1.getAltura());
       System.out.println("La sexo es... "+ objPaciente1.getSexo());
       System.out.println("El peso es... "+ objPaciente1.getPeso());
        tmb = objNutricion.getTMB(
                        objPaciente1.getPeso(), 
                        objPaciente1.getAltura(), 
                        objPaciente1.getEdad(), 
                        objPaciente1.getSexo()
       );      
       System.out.println("El paciente necesita consumir "+tmb+" Calorias");
       

    }
    
}
