static void increaseNumber(int n) { n += 3; }
static void updateObject(LabProgress p) { p.completeOne(); }
static void replaceLocal(LabProgress p) {
    p = new LabProgress();
    p.completeOne();
}
    public static void main(String[] args) {

        int n = 4;
        LabProgress progress = new LabProgress();
	System.out.println("No function Called");
        System.out.println("n = " + n);
        System.out.println("completedLabs = " +
                progress.getCompletedLabs());

        increaseNumber(n);{
	System.out.println("increaseNumber was called");
        System.out.println("n = " + n);

        System.out.println("completedLabs = " +
                progress.getCompletedLabs());
	}
        updateObject(progress);{

        System.out.println("updateObject was called");
        System.out.println("n = " + n);
        System.out.println("completedLabs = " +
                progress.getCompletedLabs());
	}
	replaceLocal(progress);{

        System.out.println("replaceLocal was called:");
        System.out.println("n = " + n);
        System.out.println("completedLabs = " +
                progress.getCompletedLabs());
    }

}