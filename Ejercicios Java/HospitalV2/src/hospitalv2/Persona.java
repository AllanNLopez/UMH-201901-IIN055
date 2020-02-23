
package hospitalv2;

public class Persona {
    protected String identificacion;
    private String nombre;
    private String fechaNacimiento;
    private int    edad;
    private String lugarNacimiento;
    private String ciudadDomicilio;
    private String deptoDomicilio;
    private String direccionDomicilio;
    private String telefonoDomicilio;
    private String correoElectronico;
    private String tipoSangre;
    private String profesion;
    private String empleador;
    private String telefonoTrabajo;
    private String escolaridad;
    private double peso;
    private double altura;
    
    public Persona(){
        this.identificacion = "";
        this.nombre = "";
        this.fechaNacimiento = "";
        this.edad = 0;
        this.lugarNacimiento = "";
        this.ciudadDomicilio = "";
        this.deptoDomicilio = "";
        this.direccionDomicilio = "";
        this.telefonoDomicilio = "";
        this.correoElectronico = "";
        this.tipoSangre = "";
        this.profesion = "";
        this.empleador = "";
        this.telefonoTrabajo = "";
        this.escolaridad = "";
        this.peso = 0;
        this.altura =0;
    }

    public Persona(String identificacion, String nombre, String fechaNacimiento, int edad, String lugarNacimiento, String ciudadDomicilio, String deptoDomicilio, String direccionDomicilio, String telefonoDomicilio, String correoElectronico, String tipoSangre, String profesion, String empleador, String telefonoTrabajo, String escolaridad, double peso, double altura) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.edad = edad;
        this.lugarNacimiento = lugarNacimiento;
        this.ciudadDomicilio = ciudadDomicilio;
        this.deptoDomicilio = deptoDomicilio;
        this.direccionDomicilio = direccionDomicilio;
        this.telefonoDomicilio = telefonoDomicilio;
        this.correoElectronico = correoElectronico;
        this.tipoSangre = tipoSangre;
        this.profesion = profesion;
        this.empleador = empleador;
        this.telefonoTrabajo = telefonoTrabajo;
        this.escolaridad = escolaridad;
        this.peso = peso;
        this.altura = altura;
    }

    public Persona(String identificacion, String nombre, String fechaNacimiento, int edad, String ciudadDomicilio, String deptoDomicilio, String direccionDomicilio, double peso, double altura) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.edad = edad;
        this.ciudadDomicilio = ciudadDomicilio;
        this.deptoDomicilio = deptoDomicilio;
        this.direccionDomicilio = direccionDomicilio;
        this.peso = peso;
        this.altura = altura;
    }

    public void setDatosPersonales(String identificacion, String nombre, String fechaNacimiento, int edad, String ciudadDomicilio, String deptoDomicilio, String direccionDomicilio, double peso, double altura) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.edad = edad;
        this.ciudadDomicilio = ciudadDomicilio;
        this.deptoDomicilio = deptoDomicilio;
        this.direccionDomicilio = direccionDomicilio;
        this.peso = peso;
        this.altura = altura;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getLugarNacimiento() {
        return lugarNacimiento;
    }

    public void setLugarNacimiento(String lugarNacimiento) {
        this.lugarNacimiento = lugarNacimiento;
    }

    public String getCiudadDomicilio() {
        return ciudadDomicilio;
    }

    public void setCiudadDomicilio(String ciudadDomicilio) {
        this.ciudadDomicilio = ciudadDomicilio;
    }

    public String getDeptoDomicilio() {
        return deptoDomicilio;
    }

    public void setDeptoDomicilio(String deptoDomicilio) {
        this.deptoDomicilio = deptoDomicilio;
    }

    public String getDireccionDomicilio() {
        return direccionDomicilio;
    }

    public void setDireccionDomicilio(String direccionDomicilio) {
        this.direccionDomicilio = direccionDomicilio;
    }

    public String getTelefonoDomicilio() {
        return telefonoDomicilio;
    }

    public void setTelefonoDomicilio(String telefonoDomicilio) {
        this.telefonoDomicilio = telefonoDomicilio;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getEmpleador() {
        return empleador;
    }

    public void setEmpleador(String empleador) {
        this.empleador = empleador;
    }

    public String getTelefonoTrabajo() {
        return telefonoTrabajo;
    }

    public void setTelefonoTrabajo(String telefonoTrabajo) {
        this.telefonoTrabajo = telefonoTrabajo;
    }

    public String getEscolaridad() {
        return escolaridad;
    }

    public void setEscolaridad(String escolaridad) {
        this.escolaridad = escolaridad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    
    
    
}
