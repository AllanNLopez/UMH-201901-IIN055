/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facturaciontotal;

/**
 *
 * @author MI-PC
 */
public class FacturacionTotal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente c1 = new Cliente("08012020123455", "Cliente de prueba 1",  "PERSONAL",  "GRATUITO",  1, 0 );
        Cliente c2 = new Cliente("09091234567890", "Cliente de prueba 2",  "PYME",  "BASICO",  1, 0 );
        Cliente c3 = new Cliente("07912000876542", "Cliente de prueba 3",  "PYME",  "PREMIUM",  1, 0 );
        Cliente c4 = new Cliente("20201201201231", "Cliente de prueba 4",  "CORPORATIVO",  "PREMIUM",  1, 0 );
        Cliente c5 = new Cliente("07891231282923", "Cliente de prueba 5",  "CORPORATIVO",  "PREMIUM GOLD",  1, 0 );
        
        Facturador F1 = new Facturador();
        
        System.out.println( c1.getInfoCliente() +
                            "\nTotal facturar: "+ 
                            F1.getTotalPagar(
                                        c1.getTipoPlan(), 
                                        c1.getTipoCliente(), 
                                        c1.getMeses(), 
                                        c1.getSaldoVencido()
                                    )
                           ); 
        System.out.println("=============================== ");
        System.out.println( c2.getInfoCliente() +
                            "\nTotal facturar: "+ 
                            F1.getTotalPagar(
                                        c2.getTipoPlan(), 
                                        c2.getTipoCliente(), 
                                        c2.getMeses(), 
                                        c2.getSaldoVencido()
                                    )
                           ); 
        System.out.println("=============================== ");
        System.out.println( c3.getInfoCliente() +
                    "\nTotal facturar: "+ 
                    F1.getTotalPagar(
                                c3.getTipoPlan(), 
                                c3.getTipoCliente(), 
                                c3.getMeses(), 
                                c3.getSaldoVencido()
                            )
                   ); 
        System.out.println("=============================== ");
        System.out.println( c4.getInfoCliente() +
            "\nTotal facturar: "+ 
            F1.getTotalPagar(
                        c4.getTipoPlan(), 
                        c4.getTipoCliente(), 
                        c4.getMeses(), 
                        c4.getSaldoVencido()
                    )
           ); 
        System.out.println("=============================== ");
        System.out.println( c5.getInfoCliente() +
            "\nTotal facturar: "+ 
            F1.getTotalPagar(
                        c5.getTipoPlan(), 
                        c5.getTipoCliente(), 
                        c5.getMeses(), 
                        c5.getSaldoVencido()
                    )
           ); 
        
    }
    
}
