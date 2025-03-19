public class Samsung implements AdvancedSmartPhone {
    @Override
    public void makeCall(String number) {
        System.out.println("Samsung calling " + number + "...");
    }

    @Override
    public void sendSMS(String number, String message) {
        System.out.println("Samsung sending SMS to " + number + ": " + message);
    }

    @Override
    public void browseWeb(String url) {
        System.out.println("Samsung browsing: " + url);
    }

    @Override
    public void takePicture() {
        System.out.println("Samsung taking a picture...");
    }
}