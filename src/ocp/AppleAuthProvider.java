package ocp;

public class AppleAuthProvider implements AuthProvider {
    @Override
    public boolean authenticate(String log, String pass) {
        // use the Apple api
        System.out.println("Authenticating with Apple");
        return true;
    }
    
    @Override
    public String getServiceName() {
        return "apple";
    }
}
