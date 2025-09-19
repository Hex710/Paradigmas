
public abstract class Imovel {

    private Endereco end;
    private int preco;

    public Imovel(Endereco end, int preco) {
        this.setEnd(end);
        this.setPreco(preco);
    }

    public Endereco getEnd() {
        return this.end;
    }

    public int getPreco() {
        return this.preco;
    }

    public void setEnd(Endereco end) {
        if (end != null) {
            this.end = end;
        }
    }

    public void setPreco(int preco) {
        if (preco > 0) {
            this.preco = preco;
        }
    }

    public abstract int calcularValorImovel();
}
