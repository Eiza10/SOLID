package ocp;

public class GoogleAuthProvider implements AuthProvider {
    @Override
    public boolean authenticate(String log, String pass) {
        // use the Google api
        System.out.println("Authenticating with Google");
        return true;
    }
    
    @Override
    public String getServiceName() {
        return "google";
    }
}
