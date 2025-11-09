package isp;

public class SMSSender {
    public static void sendSMS(SMSable recipient, String message) {
        // BAKARRIK telephone-a behar du
        String telephone = recipient.getTelephone();
        System.out.println("Sending SMS to: " + telephone);
        System.out.println("Message: " + message);
        System.out.println("SMS sent successfully!\n");
    }
}
