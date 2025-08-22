
public class Autor {

    private String nome;
    private String nacionalidade;

    public Autor(String nome, String nacionalidade) {
        this.setNome(nome);
        this.setNacionalidade(nacionalidade);
    }

    public String getNome() {
        return this.nome;
    }

    public String getNacionalidade() {
        return this.nacionalidade;
    }

    public void setNome(String nome) {
        if (nome != null) {
            this.nome = nome;
        }
    }

    public void setNacionalidade(String nacionalidade) {
        if (nacionalidade != null) {
            this.nacionalidade = nacionalidade;
        }
    }

    public String aToString() {
        return "Nome: " + this.nome + " Nacionalidade: " + this.nacionalidade;
    }
}
