public class PassByValueDemo {

    static void changeNumber(int x) {
        System.out.println("Inside Method: x = " + x);
        x = 99;
        System.out.println("Inside Method after change: x = " + x);
    }

    static void changeStudent(Student st) {
        System.out.println("Inside Method Before: " + st.completedCredits);

        st.completedCredits = 99;

        System.out.println("Inside Method After: " + st.completedCredits);
    }

    static void replaceStudent(Student st) {
        System.out.println("Inside Method Before: " + st.name);

        st = new Student();
        st.name = "Temporary";

        System.out.println("Inside Method After: " + st.name);
    }

    public static void main(String[] args) {

        System.out.println("Experiment A");

        int number = 10;

        System.out.println("Before: number = " + number);

        changeNumber(number);

        System.out.println("After: number = " + number);

        System.out.println("\nExperiment B");

        Student s1 = new Student();
        s1.studentId = "SP26-BAI-005";
        s1.name = "Abeer Amina";
        s1.completedCredits = 30;

        System.out.println("Before: completedCredits = "
                + s1.completedCredits);

        changeStudent(s1);

        System.out.println("After: completedCredits = "
                + s1.completedCredits);

        System.out.println("\nExperiment C");

        Student s2 = new Student();
        s2.studentId = "SP26-BAI-010";
        s2.name = "Ali Ishtiaq";
        s2.completedCredits = 25;

        System.out.println("Before: name = " + s2.name);

        replaceStudent(s2);

        System.out.println("After: name = " + s2.name);
    }
}