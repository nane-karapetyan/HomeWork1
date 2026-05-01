package app;
public class DummyApp {
    private String participants;
    private int lastCallDuration;

    public DummyApp(String person1, String person2) {
        participants = person1 + ", " + person2;
        lastCallDuration = 0;
    }

    public void answerCall() {
        System.out.println("Call answered between: " + participants);
    }

    public void endCall() {
        System.out.println("Call ended.");
    }

    public int getLastCallDuration() {
        return lastCallDuration;
    }

    public void setLastCallDuration(int duration) {
        lastCallDuration = duration;
    }
}