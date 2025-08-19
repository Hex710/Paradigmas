import java.util.Scanner;

public class main{
    public static void main(String[] args){
        Data calendar[] = new Data[3];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 3; i++)
        {
            calendar[i] = new Data();
            System.out.print("Digite o ano: ");
            calendar[i].setYear(input.nextInt());
            System.out.print("Digite o mês: ");
            calendar[i].setMonth(input.nextInt());
            System.out.print("Digite o dia: ");
            calendar[i].setDay(input.nextInt(), calendar[i].getMonth());
            input.nextLine();
        }

        if ((calendar[0].anterior(calendar[1].getYear(), calendar[1].getMonth(), calendar[1].getDay())) && (calendar[0].anterior(calendar[2].getYear(), calendar[2].getMonth(), calendar[2].getDay()))){
            if (calendar[2].anterior(calendar[1].getYear(), calendar[1].getMonth(), calendar[1].getDay())){
                System.out.println(calendar[0].toString() + " " + calendar[2].toString() + " " + calendar[1].toString());
            }
            else{
                System.out.println(calendar[0].toString() + " " + calendar[1].toString() + " " + calendar[2].toString());
            }
        }
        else if ((calendar[1].anterior(calendar[0].getYear(), calendar[0].getMonth(), calendar[0].getDay())) && (calendar[1].anterior(calendar[2].getYear(), calendar[2].getMonth(), calendar[2].getDay()))){
            if (calendar[2].anterior(calendar[0].getYear(), calendar[0].getMonth(), calendar[0].getDay())){
                System.out.println(calendar[1].toString() + " " + calendar[2].toString() + " " + calendar[0].toString());
            }
            else{
                System.out.println(calendar[1].toString() + " " + calendar[0].toString() + " " + calendar[2].toString());
            }
        }
        else
        {
            if (calendar[1].anterior(calendar[0].getYear(), calendar[0].getMonth(), calendar[0].getDay())){
                System.out.println(calendar[2].toString() + " " + calendar[1].toString() + " " + calendar[0].toString());
            }
            else{
                System.out.println(calendar[2].toString() + " " + calendar[0].toString() + " " + calendar[1].toString());
            }
        }
    }
}