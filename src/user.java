import java.util.Scanner;

public class user {
    public static void userChoices() {
        Scanner inputOf = new Scanner(System.in);
        System.out.println("choose val 1, 2, or 3");
        boolean keepGoing = true;
        while (keepGoing) {
            int valUser = inputOf.nextInt();
            switch (valUser) {
            case 1:
                System.out.println("val 1 user");
                keepGoing = false;
                break;
            case 2:
                System.out.println("val 2 user");
                keepGoing = false;
                break;
            case 3:
                System.out.println("val 3 user");
                keepGoing = false;
                break;
            default:
                System.out.println("put in 1, 2 or 3");
                inputOf.nextLine();
            }
        }
    }
}
