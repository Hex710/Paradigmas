import java.util.Scanner;

public class main{
    public static void main(String[] args) {
        String titulo, nome, nacionalidade;
        short ano;
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o titulo do livro: ");
        titulo = input.nextLine();
        System.out.print("Digite o nome do autor: ");
        nome = input.nextLine();
        System.out.print("Digite a nacionalidade do autor: ");
        nacionalidade = input.nextLine();
        System.out.print("Digite o ano de publicação do livro: ");
        ano = input.nextShort();
        input.nextLine();

        Livro l = new Livro(titulo, ano, nome, nacionalidade);
        System.out.println(l.toString());
    }
}
