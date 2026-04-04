package app;
public class DummyAppPro extends DummyApp {
    private String[] participantsList;
    private boolean isCameraOn;

    public DummyAppPro(String[] people, boolean cameraStatus) {
        super(people.length > 0 ? people[0] : "Unknown", people.length > 1 ? people[1] : "Unknown");

        if (people.length <= 10) {
            participantsList = people;
        } else {
            System.out.println("Warning: Maximum 10 participants allowed.");
        }
        isCameraOn = cameraStatus;
    }

    public void toggleCamera() {
        isCameraOn = !isCameraOn;
        System.out.println("Camera is now " + (isCameraOn ? "ON" : "OFF"));
    }

    public boolean getCameraStatus() {
        return isCameraOn;
    }
}