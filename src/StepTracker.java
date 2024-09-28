public class StepTracker {

    private int minimumSteps;
    private int dailySteps;

    private int activeDays;
    private int activeSteps;
    private int days;

    private int totalSteps;

    public StepTracker(int stepRequirement) {
        minimumSteps = stepRequirement;
        activeDays = 0;
        activeSteps = 0;
        days = 0;
        totalSteps = 0;
    }

    public int activeDays() {
        return activeDays;
    }

    public int getActiveDays() {
        return activeDays;
    }

    public int averageSteps() {
        return (activeDays > 0) ? activeSteps / activeDays : 0;
    }

    public int addDailySteps(int dailySteps) {
        this.dailySteps = dailySteps;
        days++;
        totalSteps += dailySteps;

        if (dailySteps >= minimumSteps) {
            activeDays++;
            activeSteps += dailySteps;
        }
        return activeDays;
    }

    public int getDays() {
        return days;
    }

    public int getStepsForActiveDays() {
        return activeSteps;
    }

    public int getTotalSteps() {
        return totalSteps;
    }

    public int getStepsForActiveDay() {

        return minimumSteps;
    }
}
