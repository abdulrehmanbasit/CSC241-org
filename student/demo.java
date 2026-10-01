Student s = new Student();
s.studentId = "SP26-BAI-004";
s.name = "ABDUL REHMAN BASIT";
s.completedCredits = 15;

s.addCredits(3);
s.addCredits(3,1);
System.out.println(s.remainingCredits(130));
