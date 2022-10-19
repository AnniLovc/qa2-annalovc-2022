public class Job {

    private String position;
    private double bruttoSalary;
    private String workType;
    private boolean healthInsurance;
    private boolean remotework;

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getBruttoSalary() {
        return bruttoSalary;
    }

    public void setBruttoSalary(double bruttoSalary) {
        this.bruttoSalary = bruttoSalary;
    }

    public String getWorkType() {
        return workType;
    }

    public void setWorkType(String workType) {
        this.workType = workType;
    }

    public boolean isHealthInsurance() {
        return healthInsurance;
    }

    public void setHealthInsurance(boolean healthInsurance) {
        this.healthInsurance = healthInsurance;
    }

    public boolean isRemotework() {
        return remotework;
    }

    public void setRemotework(boolean remotework) {
        this.remotework = remotework;
    }
}
