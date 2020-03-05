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
public class tipoCliente {
    private String tipoCliente;
    
    tipoCliente(){
        tipoCliente ="";
    }
    
    public String getTipoCliente(double facturacionMensual, int cantEmpleados){
        
        if(cantEmpleados> 1000 && facturacionMensual > 2500){
           this.tipoCliente = "Corporativo";
        }else if(cantEmpleados > 500 && cantEmpleados <=1000){
            if(facturacionMensual > 2500){
                this.tipoCliente = "Corporativo";
            }else if(facturacionMensual > 1000 && facturacionMensual <= 2500.99){
                this.tipoCliente = "Grande";
            }
        }else if(cantEmpleados>250 && cantEmpleados < 501){
            if(facturacionMensual<2501){
                this.tipoCliente = "Grande";
            }else if(facturacionMensual > 2500){
                this.tipoCliente = "Corporativo";
            }
        }else if(cantEmpleados>50 && cantEmpleados < 251){
            if(facturacionMensual<1001){
                this.tipoCliente = "PYME";
            }else if(facturacionMensual>1000 && facturacionMensual<5001){
                this.tipoCliente = "Mediana";
            }else if(facturacionMensual > 5000){
                this.tipoCliente = "Grande";
            }
        }else if(cantEmpleados > 1 && cantEmpleados < 51){
            if(facturacionMensual<1001){
                this.tipoCliente = "MiPyMe";
            }else if(facturacionMensual>1000 && facturacionMensual<5001){
                this.tipoCliente ="PYME";
            }else if(facturacionMensual>5000){
                this.tipoCliente = "Grande";
            }
        }else if(cantEmpleados == 1 && facturacionMensual < 1001){
            this.tipoCliente = "Comerciante Individual";
        }else if(cantEmpleados == 1 && facturacionMensual > 1000){
            this.tipoCliente = "Especial";
        }else{
            this.tipoCliente = "Indeterminado";
        }
        
        return this.tipoCliente;
    }
}
