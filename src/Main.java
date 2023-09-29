import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to the library, choose 1 for user or 2 for librarian");
        boolean keepRunning = true;
        do {
            try {
                int val = input.nextInt();
                //input.nextLine();
                if (val == 1) {
                    System.out.println("you chose user");
                } else if (val == 2) {
                    System.out.println("you chose librarian");
                } else {
                    System.out.println("pick 1 or 2");
                }
            } catch (InputMismatchException e) {
                System.out.println("you need to write an integer, 1 or 2");
                input.nextLine();
            }
        } while (keepRunning);
    }
}