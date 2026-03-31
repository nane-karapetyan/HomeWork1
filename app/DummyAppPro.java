package app;
import java.util.List;

public class DummyAppPro extends DummyApp {

    private boolean isCameraOn;

    public DummyAppPro(List<String> participants) {
        super(participants);

        if (participants.size() > 10) {
            throw new IllegalArgumentException("Max 10 participants allowed");
        }

        this.isCameraOn = false;
        System.out.println("Pro version call started");
    }

    public void toggleCamera() {
        isCameraOn = !isCameraOn;
        System.out.println("Camera is now " + (isCameraOn ? "ON" : "OFF"));
    }

    public boolean isCameraOn() {
        return isCameraOn;
    }
}