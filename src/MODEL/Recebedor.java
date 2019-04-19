
package MODEL;

public class Recebedor {
    
    public String nomeRecebedor;
    public String categoriaRecebedor; //tipo do estabelecimento: LOJAS, SHOPPING, RESTAUTANTE 
    public String endereco;
    public String telefone;
    public boolean ativo;

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public String getNomeRecebedor() {
        return nomeRecebedor;
    }

    public void setNomeRecebedor(String nomeRecebedor) {
        this.nomeRecebedor = nomeRecebedor;
    }

    public String getCategoriaRecebedor() {
        return categoriaRecebedor;
    }

    public void setCategoriaRecebedor(String categoriaRecebedor) {
        this.categoriaRecebedor = categoriaRecebedor;
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
