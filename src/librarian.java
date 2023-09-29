import java.util.Scanner;

public class librarian {

    public static void librarianChoices() {
        Scanner inputOf = new Scanner(System.in);
        System.out.println("choose val 1, 2, or 3");
        int valLibrarian = inputOf.nextInt();
        boolean keepGoing = true;
        while (keepGoing) {
            switch (valLibrarian) {
                case 1:
                    System.out.println("val 1");
                    keepGoing = false;
                    break;
                case 2:
                    System.out.println("val 2");
                    keepGoing = false;
                    break;
                case 3:
                    System.out.println("val 3");
                    keepGoing = false;
                    break;
                default:
                    System.out.println("put in 1, 2 or 3");
                    inputOf.nextLine();
            }
        }
    }
}

