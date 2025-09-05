
public class CartaoDeNatal extends CartaoWeb {

    public CartaoDeNatal(String destinatario) {
        super(destinatario);
    }

    public String retornarMensagem(String remetente) {
        return "Querido (a) " + this.destinatario + " Feliz Hannukah!\n Atenciosamente: " + remetente + "\n";
    }
}
