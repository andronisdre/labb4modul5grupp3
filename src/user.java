public class user {
    public static void userChoices() {
        System.out.println("choose val 1, 2, or 3");
        boolean keepGoing = true;
        while (keepGoing) {
            int valUser = Menu.input.nextInt();
            switch (valUser) {
            case 1 -> {System.out.println("val 1 user"); keepGoing = false;}
            case 2 -> {System.out.println("val 2 user"); keepGoing = false;}
            case 3 -> {System.out.println("val 3 user"); keepGoing = false;}
            default -> {System.out.println("put in 1, 2 or 3"); Menu.input.nextLine();}
            }
        }
    }
}
