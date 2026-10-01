class demo1{
	public static void main(String[] args ){
	Student s = new Student();
	s.studentId = "SP26-BAI-004";
	s.name= "ABDUL REHMAN BASIT";
	s.completedCredits = 15;

	s.addCredits(3);
	s.addCredits(3,2);
	System.out.println(s.remainingCredits(130));
	}
}