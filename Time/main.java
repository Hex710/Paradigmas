import java.util.Scanner;

public class main{
    public static void main(String[] args){
        Time clocks[] = new Time[2];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 2; i++){
            clocks[i] = new Time();
            System.out.print("Digite as horas: ");
            clocks[i].setHour(input.nextInt());
            System.out.print("Agora digite os minutos: ");
            clocks[i].setMinute(input.nextInt());
            input.nextLine();
        }
        System.out.print(clocks[0].toString());
        if(clocks[0].anterior(clocks[1].getHour(), clocks[1].getMinute())){
            System.out.print(" é mais tarde que ");
        }
        else if (clocks[0].posterior(clocks[1].getHour(), clocks[1].getMinute())){
            System.out.print(" é mais cedo que ");
        }
        else {
            System.out.print(" é o mesmo horário que ");
        }
        System.out.println(clocks[1].toString());
    }
}