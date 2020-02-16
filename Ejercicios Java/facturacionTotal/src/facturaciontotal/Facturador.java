package facturaciontotal;

public class Facturador {
    private double isv;
    private double totalPagar;
    
    Facturador(){
        this.isv = 0;
        this.totalPagar = 0;
    }
    
    public double getTotalPagar(String pTipoPlan, String pTipoCliente, int pMeses, double pSaldoVencido){        
        switch(pTipoPlan){
            case "GRATUITO":
                if(pTipoCliente.equals("PERSONAL")){ 
                   this.isv = 0*0.15;
                   this.totalPagar = this.isv+0+pSaldoVencido; 
                }else{
                    System.err.println("No se puede emitir factura.");
                }              
                break;
            case "BASICO":
                if(pTipoCliente.equals("PERSONAL") || pTipoCliente.equals("PYME") ){ 
                   this.isv = 3.99*0.15;
                   this.totalPagar = this.isv+3.99+pSaldoVencido; 
                }else{
                    System.err.println("No se puede emitir factura.");
                }              
                break;
            case "PREMIUM":
                if(pTipoCliente.equals("PYME") || pTipoCliente.equals("CORPORATIVO") ){ 
                   this.isv = 7.99*0.15;
                   this.totalPagar = this.isv+7.99+pSaldoVencido; 
                }else{
                    System.err.println("No se puede emitir factura.");
                }              
                break;
            case "PREMIUM GOLD":
                if(pTipoCliente.equals("CORPORATIVO") ){ 
                   this.isv = 9.99*0.15;
                   this.totalPagar = this.isv+9.99+pSaldoVencido; 
                }else{
                    System.err.println("No se puede emitir factura.");
                }              
                break;
            default: 
                System.out.println("No se reconoce el tipo de plan :(");
                break;
        }
        
       return this.totalPagar;
    }
    
}
