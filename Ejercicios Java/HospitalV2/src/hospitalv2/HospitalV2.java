package hospitalv2;

public class HospitalV2 {
    
    public static void main(String[] args) {
        Persona[] personas = new Persona[5];        
        personas[0] = new Paciente();
        personas[1] = new Doctor(); 
        
        for(int i=0; i<personas.length; i++){
            System.out.println(i+" - "+personas[i].getIdentificacion());
        } 
         
        
    }
    
}
