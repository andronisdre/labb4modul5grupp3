public class librarian {
    public static void librarianChoices() {
        System.out.println("choose val 1, 2, or 3");
        boolean keepGoing = true;
        while (keepGoing) {
            int valLibrarian = Menu.input.nextInt();
            switch (valLibrarian) {
                case 1 -> {addNewBook(); keepGoing = false;}
                case 2 -> {System.out.println("val 2 librarian"); keepGoing = false;}
                case 3 -> {System.out.println("val 3 librarian"); keepGoing = false;}
                default -> {System.out.println("put in 1, 2 or 3"); Menu.input.nextLine();}
            }

        }
    }
    public static void addNewBook() {
        System.out.println("Please add book title: ");
        String title = Menu.input.next();
        book newBook = new book(title);
        System.out.println(title);
        System.out.println(newBook);
        System.out.println("added book!");
    }
}

