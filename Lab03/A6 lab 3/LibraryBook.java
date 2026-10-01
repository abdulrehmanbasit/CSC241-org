public class LibraryBook {

    private int totalCopies;
    private int borrowedCopies;
    private boolean configured;

    public boolean configure(int total) {

        if (configured || total <= 0) {
            return false;
        }

        totalCopies = total;
        borrowedCopies = 0;
        configured = true;

        return true;
    }

    public boolean borrow() {
        return borrow(1);
    }

    public boolean borrow(int n) {

        if (n <= 0 || n > getAvailable()) {
            return false;
        }

        borrowedCopies += n;
        return true;
    }

    public boolean returnCopies(int n) {

        if (n <= 0 || n > borrowedCopies) {
            return false;
        }

        borrowedCopies -= n;
        return true;
    }

    public int getAvailable() {
        return totalCopies - borrowedCopies;
    }

    public int getBorrowed() {
        return borrowedCopies;
    }
}
