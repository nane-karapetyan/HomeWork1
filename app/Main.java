package app;
public class Main {
    public static void main(String[] args) {
        String[] group = {"Lilit", "Hayk", "Aram"};

        DummyAppProMax myCall = new DummyAppProMax(group, true);

        myCall.answerCall();
        myCall.toggleScreenShare();
        myCall.endCall();
        myCall = null;

}
}