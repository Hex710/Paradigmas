
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        CartaoWeb cartoes[] = new CartaoWeb[3];
        Scanner input = new Scanner(System.in);
        String remetente;
        System.out.print("Insira o primeiro destinatario: ");
        cartoes[0] = new CartaoDeAniversario(input.nextLine());
        System.out.print("Insira o segundo destinatario: ");
        cartoes[1] = new CartaoDeNatal(input.nextLine());
        System.out.print("Insira o terceiro destinatario: ");
        cartoes[2] = new CartaoDiaDosNamorados(input.nextLine());
        System.out.print("Insira o seu nome: ");
        remetente = input.nextLine();
        for (int i = 0; i < 3; i++) {
            System.out.println(cartoes[i].retornarMensagem(remetente));
        }
    }
}
