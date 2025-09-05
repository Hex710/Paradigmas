
public abstract class CartaoWeb {

    protected String destinatario;

    public String getDestinatario() {
        return this.destinatario;
    }

    public void setDestinatario(String destinatario) {
        if (destinatario != null) {
            this.destinatario = destinatario;
        }
    }

    public CartaoWeb(String destinatario) {
        this.setDestinatario(destinatario);
    }

    public abstract String retornarMensagem(String remetente);
}
