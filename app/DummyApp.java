package app;
import java.util.List;

public class DummyApp {
    protected List<String> participants;
    protected boolean isCallActive;
    protected long startTime;
    protected long lastCallDuration;

    public DummyApp(List<String> participants) {
        if (participants.size() > 2) {
            throw new IllegalArgumentException("Max 2 participants allowed");
        }
        this.participants = participants;
        this.isCallActive = true;
        this.startTime = System.currentTimeMillis();

        System.out.println("Call started (DummyApp)");
    }
    public void endCall() {
        if (isCallActive) {
            long endTime = System.currentTimeMillis();
            lastCallDuration = (endTime - startTime) / 1000;
            isCallActive = false;
            System.out.println("Call ended");
        }
    }
    public long getLastCallDuration() {
        return lastCallDuration;
    }
    public void answerCall() {
        System.out.println("Call answered");
    }
}