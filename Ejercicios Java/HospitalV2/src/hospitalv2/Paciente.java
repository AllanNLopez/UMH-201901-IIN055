/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalv2;

/**
 *
 * @author MI-PC
 */
public class Paciente extends Persona {
    private String numExpediente;
    
    public Paciente() {
        this.identificacion = "988899";
    }

    public Paciente(String identificacion, String nombre, String fechaNacimiento, int edad, String lugarNacimiento, String ciudadDomicilio, String deptoDomicilio, String direccionDomicilio, String telefonoDomicilio, String correoElectronico, String tipoSangre, String profesion, String empleador, String telefonoTrabajo, String escolaridad, double peso, double altura) {
        super(identificacion, nombre, fechaNacimiento, edad, lugarNacimiento, ciudadDomicilio, deptoDomicilio, direccionDomicilio, telefonoDomicilio, correoElectronico, tipoSangre, profesion, empleador, telefonoTrabajo, escolaridad, peso, altura);
    }

    public Paciente(String identificacion, String nombre, String fechaNacimiento, int edad, String ciudadDomicilio, String deptoDomicilio, String direccionDomicilio, double peso, double altura) {
        super(identificacion, nombre, fechaNacimiento, edad, ciudadDomicilio, deptoDomicilio, direccionDomicilio, peso, altura);
    }
    

    
    
}
