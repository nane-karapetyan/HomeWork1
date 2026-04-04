package app;
import java.util.List;

public class DummyAppProMax extends DummyAppPro {

    private boolean isScreenSharing;

    public DummyAppProMax(List<String> participants) {
        super(participants);
        this.isScreenSharing = false;
    }

    public void toggleScreenSharing() {
        if (!isCallActive) {
            System.out.println("Cannot share screen without active call");
            return;
        }

        isScreenSharing = !isScreenSharing;
        System.out.println("Screen sharing is now " + (isScreenSharing ? "ON" : "OFF"));
    }

    public boolean isScreenSharing() {
        return isScreenSharing;
    }
}