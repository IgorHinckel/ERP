
package MODEL;

public class Receita {
    
    public String nomeReceita;
    public String tipoReceita; //SALARIO,HORA EXTRA,SORTEIO,RENDIMENTOS,PRESENTE,TRANSFERENCIA...
    private int valorReceita;
    
    public  String getNomeReceita(){
        return nomeReceita;
    }
    
    public void setNomeReceita (String nomeReceita){
        this.nomeReceita = nomeReceita;
    }

    public String getTipoReceita(){
        return tipoReceita;
    }
    
    public void setTipoReceita(String tipoReceita){
        this.tipoReceita = tipoReceita;
    }
    
    public int getValorReceita(){
        return valorReceita;
    }
    
    public void setValorReceita(int valorReceita){
        this.valorReceita = valorReceita;
    }
}
