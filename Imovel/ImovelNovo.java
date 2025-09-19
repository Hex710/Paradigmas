
public class ImovelNovo extends Imovel {

    private int meters;
    private boolean goodPlace;

    public ImovelNovo(Endereco end, int preco, int meters, boolean goodPlace) {
        super(end, preco);
        this.setMeters(meters);
        this.setGoodPlace(goodPlace);
    }

    public int getMeters() {
        return this.meters;
    }

    public boolean isGoodPlace() {
        return this.goodPlace;
    }

    public void setMeters(int meters) {
        if (meters > 0) {
            this.meters = meters;
        }
    }

    public void setGoodPlace(boolean goodPlace) {
        this.goodPlace = goodPlace;
    }

    public int calcularValorImovel() {
        if (this.isGoodPlace()) {
            return 10000 * meters;
        } else {
            return 100 * meters;
        }
    }
}
