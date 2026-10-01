package app;

import model.AccessBox;
public class OutsideCheck {

    public static void main(String[] args) {

        AccessBox box = new AccessBox();

        System.out.println("Outside Package Check:");

        // public member: accessible
        System.out.println("open = " + box.open);

        // protected: not accessible from different package
        // System.out.println("family = " + box.family);

        // package-private: not accessible from different package
        // System.out.println("packageOnly = " + box.packageOnly);

        // private: not accessible
        // System.out.println("secret = " + box.secret);

        // Public method can be called
        box.printInside();
    }
}
