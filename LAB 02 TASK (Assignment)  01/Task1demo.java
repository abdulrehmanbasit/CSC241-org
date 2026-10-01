public class Task1demo {
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

        System.out.println("Before change:");
        System.out.println(s1.studentId+" "+s1.name+" "+s1.completedCredits);
        System.out.println(s2.studentId+" "+s2.name+" "+s2.completedCredits);
        System.out.println(s3.studentId+" "+s3.name+" "+s3.completedCredits);

        s1.completedCredits += 10;

        System.out.println("After change:");
        System.out.println(s1.studentId+" "+s1.name+" "+s1.completedCredits);
        System.out.println(s2.studentId+" "+s2.name+" "+s2.completedCredits);
        System.out.println(s3.studentId+" "+s3.name+" "+s3.completedCredits);

        
    }
}