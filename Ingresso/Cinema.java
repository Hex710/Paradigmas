public class Cinema{
    private Ingressos vendas[];

    public Ingressos[] getVendas(){
        return this.vendas;
    }

    public void setVendas(Ingressos vendas[]){
        if (vendas != null){
            this.vendas = vendas;
        }
    }
}