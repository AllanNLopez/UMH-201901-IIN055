/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

/**
 *  TMB = (10 x peso en kg) + (6,25 × altura en cm) – (5 × edad en años) + 5
 * TMB = (10 x peso en kg) + (6,25 × altura en cm) – (5 × edad en años) – 161
 * @author LAB-A2
 */
public class nutricion {
    double tmb;
    nutricion(){
        
    }
    //TMB Tasa de metabolismo basal 
    public double getTMB(double peso, double altura, int edad, String sexo){
        
        if(sexo.equals("M")){
            tmb = (10*peso) + (6.25*altura)-(5*edad)+5;
        }else if(sexo.equals("F")){
            tmb = (10*peso) + (6.25*altura)-(5*edad)-161;
        }
        
        return tmb;
    }
    
}
