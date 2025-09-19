
public abstract class Aluno {

    protected String nome;
    protected int matricula;
    protected String disciplina;

    public Aluno(String nome, int matricula, String disciplina) {
        this.setNome(nome);
        this.setMatricula(matricula);
        this.setDisciplina(disciplina);
    }

    public void setNome(String nome) {
        if (nome != null) {
            this.nome = nome;
        }
    }

    public void setMatricula(int matricula) {
        if (matricula >= 0) {
            this.matricula = matricula;
        }
    }

    public void setDisciplina(String disciplina) {
        if (disciplina != null) {
            this.disciplina = disciplina;
        }
    }

    public String getNome() {
        return this.nome;
    }

    public int getMatricula() {
        return this.matricula;
    }

    public String getDisciplina() {
        return this.disciplina;
    }
}
