
import java.util.Scanner;

public class main {

    public static void main(String args[]) {
        Estudante[] turma = new Estudante[5];
        Scanner input = new Scanner(System.in);
        int media = 0;
        int fin = 0;
        int rep = 0;
        for (int i = 0; i < 5; i++) {
            turma[i] = new Estudante();
            System.out.print("Digite o nome do aluno: ");
            turma[i].setNome(input.nextLine());
            System.out.print("Digite a nota do aluno: ");
            turma[i].setNotaFinal(input.nextInt());
            input.nextLine();
            media = (media + turma[i].getNotaFinal());
            if ((turma[i].getNotaFinal() >= 40) && (turma[i].getNotaFinal() <= 69)) {
                fin = fin + 1;
            } else if (turma[i].getNotaFinal() <= 39) {
                rep = rep + 1;
            }
        }
        media = (media / 5);
        System.out.println("Média da turma: " + media);
        System.out.println("Quantia de alunos que farão exame final: " + fin);
        System.out.println("Quantia de alunos que reprovaram: " + rep);
        System.out.println("Alunos aprovados:");
        for (int i = 0; i < 5; i++) {
            if (turma[i].getNotaFinal() >= 70) {
                turma[i].printData();
            }
        }
    }
}
