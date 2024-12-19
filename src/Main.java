import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input seconds => : ");
        String seconds = scanner.nextLine();
        int finalTime = Integer.parseInt(seconds)/ 60;

        if(finalTime == 1) {
            System.out.println("Final Time is " + finalTime + " minute");
        } else if (finalTime > 1) {
            System.out.println("Final Time is " + finalTime + " minute");
        }

    }
}