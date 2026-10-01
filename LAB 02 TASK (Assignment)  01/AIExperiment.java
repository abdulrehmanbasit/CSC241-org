public class AIExperiment {
    String experimentName;
    int completedEpochs;
    int targetEpochs;

    // Increase completedEpochs
    void runEpochs(int epochs) {
        completedEpochs += epochs;
    }

    // Overloaded method
    void runEpochs(int epochs, int bonusEpochs) {
        completedEpochs += epochs + bonusEpochs;
    }

    // Return remaining epochs
    int remainingEpochs() {
        int remaining = targetEpochs - completedEpochs;
        return remaining;
    }

    // Return one-line status
    String status() {
        return "Experiment: " + experimentName
                + ", Completed: " + completedEpochs
                + ", Target: " + targetEpochs;
    }
}