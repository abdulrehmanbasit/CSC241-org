public class Demo {

    public static void main(String[] args) {

        StudentProfile student = new StudentProfile();

        System.out.println("StudentProfile Test");

        boolean result1 = student.registerId("SP26-BCS-047");
        System.out.println("registerId(\"SP26-BCS-047\"): " + result1);
        System.out.println("Student ID: " + student.getStudentId());

        boolean result2 = student.registerId("NEW-ID");
        System.out.println("registerId(\"NEW-ID\"): " + result2);
        System.out.println("Student ID remains: " + student.getStudentId());

        boolean result3 = student.setGpa(3.40);
        System.out.println("setGpa(3.40): " + result3);
        System.out.println("GPA: " + student.getGpa());

        boolean result4 = student.setGpa(4.50);
        System.out.println("setGpa(4.50): " + result4);
        System.out.println("GPA remains: " + student.getGpa());

        boolean result5 = student.addCredits(15);
        System.out.println("addCredits(15): " + result5);
        System.out.println("Completed Credits: "
                + student.getCompletedCredits());

        boolean result6 = student.addCredits(-2);
        System.out.println("addCredits(-2): " + result6);
        System.out.println("Completed Credits remain: "
                + student.getCompletedCredits());

        boolean result7 = student.addCredits(3);
        System.out.println("addCredits(3): " + result7);
        System.out.println("Completed Credits: "
                + student.getCompletedCredits());

        System.out.println("Final Summary");
        System.out.println(student.summary());
    }
}
