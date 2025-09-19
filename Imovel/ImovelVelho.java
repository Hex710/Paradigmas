
public class ImovelVelho extends Imovel {

    private int meters;
    private boolean damaged;

    public ImovelVelho(Endereco end, int preco, int meters, boolean damaged) {
        super(end, preco);
        this.setMeters(meters);
        this.setDamaged(damaged);
    }

    public int getMeters() {
        return this.meters;
    }

    public boolean isDamaged() {
        return this.damaged;
    }

    public void setMeters(int meters) {
        if (meters > 0) {
            this.meters = meters;
        }
    }

    public void setDamaged(boolean damaged) {
        this.damaged = damaged;
    }

    public int calcularValorImovel() {
        if (this.isDamaged()) {
            return this.meters * 100;
        } else {
            return this.meters * 1000;
        }
    }
}
