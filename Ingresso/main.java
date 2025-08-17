import java.util.Scanner

public class main{
    public static void main(String args[]){
        Cinema cin = new Cinema;
        Ingressos vendas = new Ingressos[5];
        Scanner input = new Scanner(System.in);
        int total = 0;
        int caro = 0;

        for (int i = 0; i < 5; i++)
        {
            vendas[i] = new Ingressos;
            System.out.print("Digite o nome do filme: ");
            vendas[i].setNome(input.nextLine());
            System.out.print("Digite a sala de cinema: ");
            vendas[i].setSala(input.nextInt());
            System.out.print("Digite o preço do ingresso: ");
            vendas[i].setPreco(input.nextInt());
            input.nextLine();
            total = total + vendas[i].getPreco();
            if (vendas[i].getPreco() > vendas[caro].getPreco()){
                caro = i;
            }
        }
        cin.setVendas(vendas);

        for (int i = 0; i < 5; i++){
            System.out.println(cin.getVendas()[i].toString());
        }
        System.out.println("Arrecadação total: " + total);
        System.out.println("Nome e valor do ingresso do filme que vendeu um ingresso pelo maior valor: " + cin.getVendas()[caro].getNome() + "R$ " + cin.getVendas()[caro].getPreco());
    }
}