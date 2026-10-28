
public class Demo {
    public static void main(String[] args) {

        // Create two Book objects
        Book book1 = new Book(
            "B101", "Java Programming",
            "BC101", "S1-A", "James Gosling"
        );

        Book book2 = new Book(
            "B102", "Object Oriented Programming",
            "BC102", "S1-B", "Robert Lafore"
        );

        // Create one Magazine object
        Magazine magazine1 = new Magazine(
            "M101", "Computer World",
            "BC103", "S2-A", 25
        );

        // Create a section with capacity four
        LibrarySection section =
            new LibrarySection("Computing Section", 4);

        // Add the three existing items
        section.addItem(book1);
        section.addItem(book2);
        section.addItem(magazine1);

        // Display section and its items
        section.displayItems();

        // Create two more items
        Book book3 = new Book(
            "B103", "Data Structures",
            "BC104", "S1-C", "Mark Allen Weiss"
        );

        Magazine magazine2 = new Magazine(
            "M102", "Technology Today",
            "BC105", "S2-B", 10
        );

        // Fill the fourth available position
        section.addItem(book3);

        // Try adding the fifth item
        section.addItem(magazine2);

        // Display all four stored items
        section.displayItems();
    }
}
