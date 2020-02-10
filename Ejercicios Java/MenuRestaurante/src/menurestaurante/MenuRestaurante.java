package menurestaurante;
import java.util.Calendar;
import java.util.Scanner; 

public class MenuRestaurante {
 
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        Calendar c = Calendar.getInstance();
        int dia =  c.get(Calendar.DAY_OF_WEEK);
        int resp = 0;
        int seleccion = 0;
        int cant =0;
        double precio =0;
        String propina;
        int facturar =0;
        double totalPagar =0;
        double Descuento=0;
        double isv=0;
        double propinaSugerida =0;
        
        while(resp != -1){
            if(facturar == 0){
                System.out.println("Menu de restaurante");
                System.out.println("1. Platillo a    25.00");
                System.out.println("2. Platillo b   120.00");
                System.out.println("3. Platillo c    85.00");
                System.out.println("Para salir presione -1 ");
                System.out.println("Seleccione un platillo [1-3], para salir presione -1");
                resp = obj.nextInt();
                System.out.print("Ingrese la cantidad de platillos... "); 
                cant = obj.nextInt();
            } 
            switch(resp){
                case 1: 
                    precio = 25;
                    totalPagar = cant*precio;
                    System.out.println("---------------- Su orden ---------------");
                    System.out.println("Platillo b      "+precio+" x"+cant+"  "+totalPagar);
                    System.out.println("Presione 6 para facturar, 0 para cambiar orden, -1 para salir");
                    resp = obj.nextInt();
                    if(resp == 6){
                        facturar =1;
                    }
                    break;
                case 2: 
                    precio = 85;
                    totalPagar = cant*precio;
                    System.out.println("---------------- Su orden ---------------");
                    System.out.println("Platillo c      "+precio+" x"+cant+"  "+totalPagar);
                    System.out.println("Presione 6 para facturar, 0 para cambiar orden, -1 para salir");
                    resp = obj.nextInt();
                    if(resp == 6){
                        facturar =1;
                    }
                    break;
                case 3:
                    precio = 85;
                    totalPagar = cant*precio;
                    System.out.println("---------------- Su orden ---------------");
                    System.out.println("Platillo       "+precio+" x"+cant+"  "+totalPagar);
                    System.out.println("Presione 6 para facturar, 0 para cambiar orden, -1 para salir");
                    resp = obj.nextInt();
                    if(resp == 6){
                        facturar =1;
                    }
                    break;
                case 6: 
                    isv=totalPagar*0.15;
                    propinaSugerida=totalPagar*0.10;  
                    System.out.println("================================================ ");
                    System.out.println("------ Factura ------");
                    System.out.println("Platillo a      "+precio+" x"+cant+"  "+totalPagar);
                    System.out.println("I.S.V           15.00%    "+isv);
                    if(dia == 2 || dia == 4){
                        Descuento = totalPagar*0.05;
                        System.out.println("Descuento especial 5.0%  -"+Descuento);
                    }
                    System.out.println("------------------------------------------------");
                    System.out.println("Total a pagar... "+ ((totalPagar-Descuento) + isv));
                    System.out.println("");
                    System.out.println("Propina sugerida... "+propinaSugerida);
                    System.out.println("Desea incluir propina en su factura? S/N");
                    propina = obj.next(); 
                    if(propina.equalsIgnoreCase("S")){
                        System.out.println("Total a pagar... "+ (totalPagar-Descuento + isv+propinaSugerida));
                    }else{
                        System.out.println("Total a pagar... "+ (totalPagar-Descuento)+isv);
                    }        
                    resp=-1;
                    break;
                case -1: 
                    System.out.println("");
                    System.out.println("Gracias por su visita... ");
                    break;
                default: 
                    resp = 0; break;
            }           
        }
        
    }
    
}
