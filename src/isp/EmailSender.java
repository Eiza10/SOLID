package isp;

public class EmailSender {
    public static void sendEmail(Emailable recipient, String message) {
        // BAKARRIK email-a behar du
        String email = recipient.getEmail();
        System.out.println("Sending email to: " + email);
        System.out.println("Message: " + message);
        System.out.println("Email sent successfully!\n");
    }
}
