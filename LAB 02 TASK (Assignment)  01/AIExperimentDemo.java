public class AIExperimentDemo {

    static void modifyExperiment(AIExperiment experiment) {
        experiment.completedEpochs += 5;
    }

    public static void main(String[] args) {

        AIExperiment exp1 = new AIExperiment();
        AIExperiment exp2 = new AIExperiment();

        exp1.experimentName = "Image Classification";
        exp1.completedEpochs = 10;
        exp1.targetEpochs = 50;

        exp2.experimentName = "Chatbot Training";
        exp2.completedEpochs = 20;
        exp2.targetEpochs = 60;

        System.out.println("Initial State:");
        System.out.println(exp1.status());
        System.out.println(exp2.status());

        exp1.runEpochs(10);
        exp2.runEpochs(10, 5);

        System.out.println("\nAfter Method Calls:");
        System.out.println(exp1.status());
        System.out.println(exp2.status());

        System.out.println("\nRemaining Epochs:");
        System.out.println(exp1.experimentName + ": "
                + exp1.remainingEpochs());

        System.out.println(exp2.experimentName + ": "
                + exp2.remainingEpochs());

        System.out.println("\nStatus:");
        System.out.println(exp1.status());
        System.out.println(exp2.status());

        exp1.runEpochs(5);

        System.out.println("\nAfter Changing Only Experiment 1:");
        System.out.println(exp1.status());
        System.out.println(exp2.status());

        System.out.println("\nPass-by-Value Mutation Experiment:");
        System.out.println("Before helper method: "
                + exp2.completedEpochs);

        modifyExperiment(exp2);

        System.out.println("After helper method: "
                + exp2.completedEpochs);
    }
}