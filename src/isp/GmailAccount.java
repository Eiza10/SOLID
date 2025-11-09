package isp;

public class GmailAccount implements Emailable {
    private String name;
    private String emailAddress;
    
    public GmailAccount(String name, String emailAddress) {
        this.name = name;
        this.emailAddress = emailAddress;
    }
    
    public String getName() {
        return name;
    }
    
    @Override
    public String getEmail() {
        return emailAddress;
    }
    
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}
