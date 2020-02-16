package facturaciontotal;

public class Cliente {
    private String rtn;
    private String nombreCompleto;
    private String tipoCliente;
    private String tipoPlan;
    private int meses;
    private double saldoVencido;
    
    public Cliente(){
        this.rtn = "";
        this.nombreCompleto = "";
        this.tipoCliente = "";
        this.tipoPlan = "";
        this.meses = 0;
        this.saldoVencido = 0;
    }
    
    //constructor con parametros
    public Cliente(String rtn, String nombreCompleto, String tipoCliente, String tipoPlan, int meses, double saldoVencido) {
        this.rtn = rtn;
        this.nombreCompleto = nombreCompleto;
        this.tipoCliente = tipoCliente;
        this.tipoPlan = tipoPlan;
        this.meses = meses;
        this.saldoVencido = saldoVencido;
    }
    
    //imprimir info del cliente
    public String getInfoCliente(){
        String info = "";
        return "RTN:           :  "+this.rtn+"\n"+
               "Nombre completo:  "+this.nombreCompleto+"\n"+
               "Tipo de cliente:  "+this.tipoCliente+"\n"+
               "tipo de Plan:     "+this.tipoPlan+"\n"+
               "Meses a facturar: "+this.meses+"\n"+
               "Saldos vencidos:  "+this.saldoVencido;
    }
    
    //metodos get y set    
    public String getRtn() {
        return rtn;
    }

    public void setRtn(String rtn) {
        this.rtn = rtn;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public String getTipoPlan() {
        return tipoPlan;
    }

    public void setTipoPlan(String tipoPlan) {
        this.tipoPlan = tipoPlan;
    }

    public int getMeses() {
        return meses;
    }

    public void setMeses(int meses) {
        this.meses = meses;
    }

    public double getSaldoVencido() {
        return saldoVencido;
    }

    public void setSaldoVencido(double saldoVencido) {
        this.saldoVencido = saldoVencido;
    }    
    
}
