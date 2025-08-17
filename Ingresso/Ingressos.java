public class Ingressos{
    private String nome;
    private int sala;
    private int preco;

    public String getNome(){
        return this.nome;
    }

    public int getSala(){
        return this.sala;
    }

    public int getPreco(){
        return this.preco;
    }

    public void setNome(String nome){
        if (nome != null){
            this.nome = nome;
        }
    }

    public void setSala(int sala){
        if (sala > 0){
            this.sala = sala;
        }
    }

    public void setPreco(int preco){
        if (preco > 0){
            this.preco = preco;
        }
    }

    public String toString() {
        return: "Filme: " + this.nome + ", Sala: " + this.sala + ", Preço: " + this.preco;
    }
}