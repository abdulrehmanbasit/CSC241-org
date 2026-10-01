 class Student{
		String studentId;
		String name;
		int completedCredits;

		void addCredits (int c) {completedCredits +=c;}
		void addCredits (int c , int bonus) {completedCredits +=c+bonus;}
		int remainingCredits(int total){
     return total - completedCredits;
}
}