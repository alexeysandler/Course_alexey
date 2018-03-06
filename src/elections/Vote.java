package elections;

public class Vote {
    public String candiateName;
    boolean isDoubleVoted=false;

    public String getCandiateName() {
        return candiateName;
    }

    public void setCandiateName(String candiateName) {
        this.candiateName = candiateName;
    }

    public boolean isDoubleVoted() {
        return isDoubleVoted;
    }

    public void setDoubleVoted() {
        isDoubleVoted = true;
    }


    public Vote(String candiateName) {
        this.candiateName=candiateName;
    }

    public String getName() {
        return candiateName;
    }
}
