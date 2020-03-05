/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2.ejercicio2;

/**
 *
 * @author MI-PC
 */
public class Cliente {
    private int numCliente;
    private String rtn;
    private String nombreJuridico;
    private String origen;
    private String paisOrigen;
    private String nombreRepresentante;
    private String telefonoRepresentante;
    private String correRepresentante;
    private String direccion;
    private int cantEmpleados;
    private double facturacionMensual;
private String tipoCliente;
    public Cliente() {
    }

    public Cliente(int numCliente, String rtn, String nombreJuridico, String origen, String paisOrigen, String nombreRepresentante, String telefonoRepresentante, String correRepresentante, String direccion, int cantEmpleados, double facturacionMensual) {
        this.numCliente = numCliente;
        this.rtn = rtn;
        this.nombreJuridico = nombreJuridico;
        this.origen = origen;
        this.paisOrigen = paisOrigen;
        this.nombreRepresentante = nombreRepresentante;
        this.telefonoRepresentante = telefonoRepresentante;
        this.correRepresentante = correRepresentante;
        this.direccion = direccion;
        this.cantEmpleados = cantEmpleados;
        this.facturacionMensual = facturacionMensual;
    }

    public Cliente(String rtn, String nombreJuridico, int cantEmpleados, double facturacionMensual) {
        this.rtn = rtn;
        this.nombreJuridico = nombreJuridico;
        this.cantEmpleados = cantEmpleados;
        this.facturacionMensual = facturacionMensual;
    }
    
    public void imprimirInfoCliente(){
        System.out.println("------ informacion de cliente -----.---");
        System.out.println("Numero Cliente:\t"+this.numCliente);
        System.out.println("RTN de cliente:\t"+this.rtn);
        System.out.println("Nombre juridico:\t"+this.nombreJuridico);
        System.out.println("Cantidad Empleados:\t"+this.cantEmpleados);
        System.out.println("Facturacion Mensual:\t"+this.facturacionMensual);
    }

    public int getNumCliente() {
        return numCliente;
    }

    public void setNumCliente(int numCliente) {
        this.numCliente = numCliente;
    }

    public String getRtn() {
        return rtn;
    }

    public void setRtn(String rtn) {
        this.rtn = rtn;
    }

    public String getNombreJuridico() {
        return nombreJuridico;
    }

    public void setNombreJuridico(String nombreJuridico) {
        this.nombreJuridico = nombreJuridico;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public String getNombreRepresentante() {
        return nombreRepresentante;
    }

    public void setNombreRepresentante(String nombreRepresentante) {
        this.nombreRepresentante = nombreRepresentante;
    }

    public String getTelefonoRepresentante() {
        return telefonoRepresentante;
    }

    public void setTelefonoRepresentante(String telefonoRepresentante) {
        this.telefonoRepresentante = telefonoRepresentante;
    }

    public String getCorreRepresentante() {
        return correRepresentante;
    }

    public void setCorreRepresentante(String correRepresentante) {
        this.correRepresentante = correRepresentante;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCantEmpleados() {
        return cantEmpleados;
    }

    public void setCantEmpleados(int cantEmpleados) {
        this.cantEmpleados = cantEmpleados;
    }

    public double getFacturacionMensual() {
        return facturacionMensual;
    }

    public void setFacturacionMensual(double facturacionMensual) {
        this.facturacionMensual = facturacionMensual;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }
    
    public String getInfo(){
        String retorno;
        
        retorno = "------ informacion de cliente -----.--- \n"+
                  "Numero Cliente:\t"+this.numCliente+"\n"+
                  "RTN de cliente:\t"+this.rtn+"\n"+
         "Nombre juridico:\t"+this.nombreJuridico+"\n"+
        "Cantidad Empleados:\t"+this.cantEmpleados+"\n"+
        "Facturacion Mensual:\t"+this.facturacionMensual;
        
        return retorno;
    }
    
    
    
}
