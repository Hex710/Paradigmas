public class CartaoDiaDosNamorados extends CartaoWeb{
    public CartaoDiaDosNamorados(String destinatario){
        super(destinatario);
    }

    public String retornarMensagem(String remetente){
        return "Querido (a) " + this.destinatario + " espero que você tenha desencalhado esse ano, já tá dando dó.\n Atenciosamente: " + remetente + "\n";
    }
}
