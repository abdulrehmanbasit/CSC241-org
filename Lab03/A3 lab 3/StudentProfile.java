public class StudentProfile{

    private String studentId;
    private double gpa;
    private int completedCredits;

    public StudentProfile() {
        studentId = null;
        gpa = 0.0;
        completedCredits = 0;
    }
    public boolean registerId(String id) {
        if (studentId != null) {
            return false;
        }

        if (id == null || id.trim().isEmpty()) {
            return false;
        }

        studentId = id;
        return true;
    }
    public boolean setGpa(double value) {
        if (value < 0.0 || value > 4.0) {
            return false;
        }

        gpa = value;
        return true;
    }
    public boolean addCredits(int amount) {
        if (amount <= 0) {
            return false;
        }

        completedCredits += amount;
        return true;
    }
    public String getStudentId() {
        return studentId;
    }

    public double getGpa() {
        return gpa;
    }

    public int getCompletedCredits() {
        return completedCredits;
    }
    public String summary() {
        return "Student ID: " + studentId
                + ", GPA: " + gpa
                + ", Completed Credits: " + completedCredits;
    }
}

