/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;
import java.util.Date;

/**
 *
 * @author LAB-A2
 */
public class Paciente {
    private String identidad;
    private String nombres;
    private String apellidos;
    private Date fechaNacimiento;
    private int edad;
    private String sexo;
    private double altura;
    private double peso;
    
    Paciente(){
        this.identidad = "";
        this.nombres = "fULANITO PEDRO";
        this.apellidos = "";
        this.edad = 0;
        this.sexo = "M";
    };
    
    public String getNombrePaciente(){
        return this.nombres;
    };
    
    public String retornarApellidosPaciente(){
        return this.apellidos;
    };
    
   public void setEdad(int edad){
       this.edad = edad;
   };
   
   public void setAltura(double altura){
       this.altura = altura;
   }
   
   public void setSexo(String sexo){
       this.sexo = sexo;
   }
    
    public void setNombres(String pNombre){
        this.nombres = pNombre;
    };
    
   public int getEdad(){
       return this.edad;
   }
   
   public String getSexo(){
       return this.sexo;
   }
   
   public double getAltura(){
       return this.altura;
   }
   
   public void setPeso(double peso){
       this.peso = peso;
   }
   
   public double getPeso(){
       return this.peso;
   }
}
