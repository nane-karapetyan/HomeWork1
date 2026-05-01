package app;

public class DummyAppProMax extends DummyAppPro {
    private boolean isScreenSharing;

    public DummyAppProMax(String[] people, boolean cameraStatus) {
        super(people, cameraStatus);
        isScreenSharing = false;
    }

    public void toggleScreenShare() {
        isScreenSharing = !isScreenSharing;
        System.out.println("Screen sharing " + (isScreenSharing ? "started" : "stopped"));
    }

    public boolean isSharing() {
        return isScreenSharing;
    }
}