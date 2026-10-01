package model;

public class AccessBox {

    public int open = 1;
    protected int family = 2;
    int packageOnly = 3;
    private int secret = 4;

    public void printInside() {
        System.out.println(open + " " + family + " "
                + packageOnly + " " + secret);
    }
}
