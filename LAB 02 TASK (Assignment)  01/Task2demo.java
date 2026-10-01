public class Task2demo {
    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        s1.studentId = "SP26-BAI-005";
        s1.name = "Abeer Amina";
        s1.completedCredits = 30;

        s2.studentId = "SP26-BAI-010";
        s2.name = "Ali Ishtiaq";
        s2.completedCredits = 25;

        s3.studentId = "SP26-BAI-003";
        s3.name = "Abdul Rehman Azam";
        s3.completedCredits = 40;

        s1.addCredits(10);
        s2.addCredits(5);

        int remaining1 = s1.remainingCredits(120);
        int remaining2 = s2.remainingCredits(120);

        System.out.println("Remaining credits for " + s1.name + ": " + remaining1);
        System.out.println("Remaining credits for " + s2.name + ": " + remaining2);

        System.out.println(s1.summary());
        System.out.println(s2.summary());
        System.out.println(s3.summary());
    }
}