
public abstract class Passageiros {

    protected String nome;
    protected int numeroDeVoo;
    protected boolean fezCheckIn;
    protected int peso;
    protected boolean contrabando;

    public String getNome() {
        return this.nome;
    }

    public int getNumeroDeVoo() {
        return this.numeroDeVoo;
    }

    public boolean IsFezCheckIn() {
        return this.fezCheckIn;
    }

    public int getPeso() {
        return this.peso;
    }

    public boolean IsContrabando() {
        return this.contrabando;
    }

    public void setNome(String nome) {
        if (nome != null) {
            this.nome = nome;
        }
    }

    public void setNumeroDeVoo(int numeroDeVoo) {
        if (numeroDeVoo > 0) {
            this.numeroDeVoo = numeroDeVoo;
        }
    }

    public void setFezCheckIn(boolean fezCheckIn) {
        this.fezCheckIn = fezCheckIn;
    }

    public void setPeso(int peso) {
        if (peso > 0) {
            this.peso = peso;
        }
    }

    public void setContrabando(boolean contrabando) {
        this.contrabando = contrabando;
    }

    public Passageiros(String nome, int numeroDeVoo, int peso, boolean contrabando) {
        this.setNome(nome);
        this.setNumeroDeVoo(numeroDeVoo);
        this.setPeso(peso);
        this.setContrabando(contrabando);
        this.setFezCheckIn(false);
    }

    public void CheckIn() {
        setFezCheckIn(true);
    }

    public abstract boolean checagemDeSegurança();

    public abstract void embarque();
}
