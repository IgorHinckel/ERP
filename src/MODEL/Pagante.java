
package MODEL;

public class Pagante {
    
    public String nomePagante;
    public String categoriaPagante; //tipo do estabelecimento: LOJAS, SHOPPING, RESTAUTANTE 
    public String endereco;
    public String telefone;
    public boolean ativo;

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public String getNomePagante() {
        return nomePagante;
    }

    public void setNomePagante(String nomePagante) {
        this.nomePagante = nomePagante;
    }

    public String getCategoriaPagante() {
        return categoriaPagante;
    }

    public void setCategoriaPagante(String categoriaPagante) {
        this.categoriaPagante = categoriaPagante;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    
    
    
}
