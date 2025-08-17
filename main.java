
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Conta[] clientes = new Conta[3];
        Scanner input = new Scanner(System.in);
        int pobre = 0;
        int total = 0;
        int rico = 0;

        for (int i = 0; i < 3; i++) {
            clientes[i] = new Conta();
            System.out.print("Digite o nome do titular da conta: ");
            clientes[i].setTitulo(input.nextLine());
            System.out.print("Digite o saldo da conta: ");
            clientes[i].setSaldo(input.nextInt());
            System.out.print("Digite o limite de saque da conta: ");
            clientes[i].setLimite(input.nextInt());
            input.nextLine();
            total = (total + clientes[i].getSaldo());
            if (clientes[i].getSaldo() < clientes[pobre].getSaldo()) {
                pobre = i;
            }
            if (clientes[i].getSaldo() > clientes[rico].getSaldo()) {
                rico = i;
            }
        }

        System.out.println("Saldo total dos 3 clientes: " + total);
    }
}
