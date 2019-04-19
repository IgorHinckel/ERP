
package MODEL;

public class Despesa {
    
    public String nomeDespesa;
    public String vencDespesa;
    public String tipoDespesa; //água,luz,telefone,lojas,diersão,comida,mercado, transferencia...
    public String formaPagamento;
    private int valorDespesa;
    
    
    
    public  String getNomeDespesa(){
        return nomeDespesa;
    }
    
    public void setNomeDespesa (String nomeDespesa){
        this.nomeDespesa = nomeDespesa;
    }
    
    
    public String getVencDespesa(){
        return vencDespesa;
    }
    
    public void setVencDespesa(String vencDespesa){
        this.vencDespesa = vencDespesa;
    }
    
    public String getTipoDespesa(){
        return tipoDespesa;
    }
    
    public String getFormaPagamento(){
        return formaPagamento;
    }
    
    public void setFormaPagamento(String formaPagamento){
        this.formaPagamento = formaPagamento;
    }
    
    public void setTipoDespesa(String tipoDespesa){
        this.tipoDespesa = tipoDespesa;
    }
    
    public int getValorDespesa(){
        return valorDespesa;
    }
    
    public void setValorDespesa(int valorDespesa){
        this.valorDespesa = valorDespesa;
    }
}
