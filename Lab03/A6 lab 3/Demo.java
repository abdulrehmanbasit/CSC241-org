public class Demo {

    public static void main(String[] args) {

        LibraryBook book1 = new LibraryBook();
        LibraryBook book2 = new LibraryBook();

        System.out.println("LibraryBook Integration Test");

        boolean result1 = book1.configure(3);
        boolean result2 = book2.configure(1);

        System.out.println("\nBook 1 configure(3): " + result1);
        System.out.println("Book 1 - Borrowed: " + book1.getBorrowed()
                + ", Available: " + book1.getAvailable());

        System.out.println("\nBook 2 configure(1): " + result2);
        System.out.println("Book 2 - Borrowed: " + book2.getBorrowed()
                + ", Available: " + book2.getAvailable());

        boolean result3 = book1.borrow(2);
        System.out.println("\nBook 1 borrow(2): " + result3);
        System.out.println("Book 1 - Borrowed: " + book1.getBorrowed()
                + ", Available: " + book1.getAvailable());

        boolean result4 = book1.borrow(2);
        System.out.println("\nBook 1 borrow(2): " + result4);
        System.out.println("Book 1 - Borrowed: " + book1.getBorrowed()
                + ", Available: " + book1.getAvailable());

        boolean result5 = book1.returnCopies(1);
        System.out.println("\nBook 1 returnCopies(1): " + result5);
        System.out.println("Book 1 - Borrowed: " + book1.getBorrowed()
                + ", Available: " + book1.getAvailable());

        boolean result6 = book1.returnCopies(2);
        System.out.println("\nBook 1 returnCopies(2): " + result6);
        System.out.println("Book 1 - Borrowed: " + book1.getBorrowed()
                + ", Available: " + book1.getAvailable());

        boolean result7 = book1.borrow();
        System.out.println("\nBook 1 borrow(): " + result7);
        System.out.println("Book 1 - Borrowed: " + book1.getBorrowed()
                + ", Available: " + book1.getAvailable());

        boolean result8 = book1.configure(10);
        System.out.println("\nBook 1 configure(10): " + result8);
        System.out.println("Book 1 - Borrowed: " + book1.getBorrowed()
                + ", Available: " + book1.getAvailable());

        System.out.println(" Independence Check");
        System.out.println("Book 1 - Borrowed: " + book1.getBorrowed()
                + ", Available: " + book1.getAvailable());

        System.out.println("Book 2 - Borrowed: " + book2.getBorrowed()
                + ", Available: " + book2.getAvailable());
    }
}