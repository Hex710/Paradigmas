
public class Livro {

    private String titulo;
    private short ano;
    private Autor autor;

    public Livro(String titulo, short ano, String nome, String nacionalidade) {
        this.setTitulo(titulo);
        this.setAno(ano);
        this.setAutor(nome, nacionalidade);
    }

    public String getTitulo() {
        return this.titulo;
    }

    public short getAno() {
        return this.ano;
    }

    public Autor getAutor() {
        return this.autor;
    }

    public void setTitulo(String titulo) {
        if (titulo != null) {
            this.titulo = titulo;
        }
    }

    public void setAno(short ano) {
        if (ano >= 0) {
            this.ano = ano;
        }
    }

    public void setAutor(String nome, String nacionalidade) {
        this.autor.setNome(nome);
        this.autor.setNacionalidade(nacionalidade);
    }

    public String lToString() {
        return "Titulo: " + this.titulo + " Ano de Publicação: " + this.ano + " Autor: " + this.autor.getNome();
    }
}
