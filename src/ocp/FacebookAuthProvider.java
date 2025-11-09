package ocp;

public class FacebookAuthProvider implements AuthProvider {
    @Override
    public boolean authenticate(String log, String pass) {
        // use the FB api
        System.out.println("Authenticating with Facebook");
        return true;
    }
    
    @Override
    public String getServiceName() {
        return "facebook";
    }
}
