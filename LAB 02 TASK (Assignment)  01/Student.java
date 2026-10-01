public class Student {
    String studentId;
    String name;
    int completedCredits;

    void addCredits(int credits) {
        completedCredits += credits;
    }

    int remainingCredits(int degreeCredits) {
        int remaining = degreeCredits - completedCredits;
        return remaining;
    }

    String summary() {
        return "ID: " + studentId +
               ", Name: " + name +
               ", Completed Credits: " + completedCredits;
    }
}