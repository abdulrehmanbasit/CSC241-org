 class Student1{
		String studentId;
		String name;
		int completedCredits;

		void addCredits (int c) {completedCredits +=c;}
		void addCredits (int c,int bonus) {completedCredits +=c;}
		int remainingCredits(int total){
     return total - completedCredits;
}
}