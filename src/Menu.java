import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    public static Scanner input = new Scanner(System.in);

    public Menu() {
        mainMenu();
    }

    public void mainMenu() {
        //Scanner input = new Scanner(System.in);
        System.out.println("welcome to the library, choose 1 for user or 2 for librarian");
        boolean keepRunning = true;
        do {
            try {
                int val = input.nextInt();
                if (val == 1) {
                    System.out.println("you chose user");
                    user.userChoices();
                    keepRunning = false;
                } else if (val == 2) {
                    System.out.println("you chose librarian");
                    System.out.println("write the password");
                    int password = input.nextInt();
                    if (password == 2845) {
                        System.out.println("password was correct");
                        librarian.librarianChoices();
                        keepRunning = false;
                    } else { System.out.println("wrong password");
                        System.out.println("choose val 1 or 2 for user or librarian");
                    }
                } else {
                    System.out.println("pick 1 or 2");
                }
            } catch (InputMismatchException e) {
                System.out.println("you need to write an integer, 1 or 2");
                System.out.println("choose val 1 or 2 again for user or librarian");
                input.nextLine();
            }
        } while (keepRunning);
    }
}

