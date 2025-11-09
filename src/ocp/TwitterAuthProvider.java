package ocp;

public class TwitterAuthProvider implements AuthProvider {
    @Override
    public boolean authenticate(String log, String pass) {
        // use the Twitter api
        System.out.println("Authenticating with Twitter");
        return true;
    }
    
    @Override
    public String getServiceName() {
        return "twitter";
    }
}
