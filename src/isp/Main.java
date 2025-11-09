package isp;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== PERSON OBJEKTUA ===");
        // Person objektua sortu
        Person person = new Person(
            "Jon Doe",
            "Main Street 123",
            "jon@example.com",
            "+34 666 555 444"
        );
        
        // Email bidali (Emailable interface)
        EmailSender.sendEmail(person, "Kaixo! Email bat da hau.");
        
        // SMS bidali (SMSable interface)
        SMSSender.sendSMS(person, "Kaixo! SMS bat da hau.");
        
        System.out.println("=== GMAIL ACCOUNT OBJEKTUA ===");
        // GmailAccount objektua sortu
        GmailAccount gmailAccount = new GmailAccount(
            "Jane Smith",
            "jane.smith@gmail.com"
        );
        
        // Emaila bidali
        EmailSender.sendEmail(gmailAccount, "Gmail kontutik email bat!");
    }
}