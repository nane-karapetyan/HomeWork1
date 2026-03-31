package app;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<String> users = Arrays.asList("John Doe", "Jane Smith");

        DummyAppProMax app = new DummyAppProMax(users);

        app.answerCall();

        app.toggleCamera();
        app.toggleScreenSharing();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        app.endCall();

        System.out.println("Last call duration: " + app.getLastCallDuration() + " sec");

        app = null;
    }
}