public class Iphone implements AdvancedSmartPhone {
    @Override
    public void makeCall(String number) {
        System.out.println("iPhone calling " + number + "...");
    }

    @Override
    public void sendSMS(String number, String message) {
        System.out.println("iPhone sending SMS to " + number + ": " + message);
    }

    @Override
    public void browseWeb(String url) {
        System.out.println("iPhone browsing: " + url);
    }

    @Override
    public void takePicture() {
        System.out.println("iPhone taking a picture...");
    }
}