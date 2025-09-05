
public class CartaoDeAniversario extends CartaoWeb {

    public CartaoDeAniversario(String destinatario) {
        super(destinatario);
    }

    public String retornarMensagem(String remetente) {
        return "Querido (a) " + this.destinatario + " Parabéns! Você está um dia mais perto da morte!\n Atenciosamente: " + remetente + "\n";
    }
}
