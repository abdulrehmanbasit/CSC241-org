package model;

public class SamePackageCheck {

    public static void main(String[] args) {

        AccessBox box = new AccessBox();

        System.out.println("Same Package Check:");

        System.out.println("open = " + box.open);
        System.out.println("family = " + box.family);
        System.out.println("packageOnly = " + box.packageOnly);

        // Private member cannot be accessed outside AccessBox
        // System.out.println("secret = " + box.secret);
    }
}
