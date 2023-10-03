import java.util.Scanner;

public class librarian {
    public static void librarianChoices() {
        Scanner inputOf = new Scanner(System.in);
        System.out.println("choose val 1, 2, or 3");
        boolean keepGoing = true;
        while (keepGoing) {
            int valLibrarian = inputOf.nextInt();
            switch (valLibrarian) {
                case 1 -> {System.out.println("val 1 librarian"); keepGoing = false;}
                case 2 -> {System.out.println("val 2 librarian"); keepGoing = false;}
                case 3 -> {System.out.println("val 3 librarian"); keepGoing = false;}
                default -> {System.out.println("put in 1, 2 or 3"); inputOf.nextLine();}
            }
        }
    }
}

