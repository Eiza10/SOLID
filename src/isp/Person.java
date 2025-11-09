package isp;

public class Person implements Emailable, SMSable {
    private String name;
    private String address;
    private String email;
    private String telephone;
    
    // Constructor
    public Person(String name, String address, String email, String telephone) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.telephone = telephone;
    }
    
    // Getters eta Setters
    public void setName(String n) { name = n; }
    public String getName() { return name; }
    
    public void setAddress(String a) { address = a; }
    public String getAddress() { return address; }
    
    public void setEmail(String e) { email = e; }
    @Override
    public String getEmail() { return email; }
    
    public void setTelephone(String t) { telephone = t; }
    @Override
    public String getTelephone() { return telephone; }
}
