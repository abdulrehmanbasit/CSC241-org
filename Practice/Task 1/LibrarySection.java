
public class LibrarySection {
    private String sectionName;
    private LibraryItem[] items;
    private int count;

    public LibrarySection(String sectionName, int capacity) {
        this.sectionName = sectionName;
        items = new LibraryItem[capacity];
        count = 0;
    }

    public void addItem(LibraryItem item) {
        if (count < items.length) {
            items[count] = item;
            count++;
            System.out.println("Item added successfully.");
        } else {
            System.out.println("Section full");
        }
    }

    public void displayItems() {
        System.out.println("\nSection: " + sectionName);
        System.out.println("-------------------------");

        for (int i = 0; i < count; i++) {
            System.out.println("\nItem " + (i + 1));
            items[i].displayInfo();
        }
    }
}
