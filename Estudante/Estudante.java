
public class Estudante {

    private String nome;
    private int notaFinal;

    public String getNome() {
        return this.nome;
    }

    public int getNotaFinal() {
        return this.notaFinal;
    }

    public void setNome(String nome) {
        if (nome != null) {
            this.nome = nome;
        }
    }

    public void setNotaFinal(int notaFinal) {
        if ((notaFinal >= 0) && (notaFinal <= 100)) {
            this.notaFinal = notaFinal;
        }
    }

    public void printData() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Nota Final: " + this.notaFinal);
    }
}
