package ocp;

import java.util.HashMap;
import java.util.Map;

public class AuthService {
    private Map<String, AuthProvider> providers;
    
    public AuthService() {
        providers = new HashMap<>();
        // Providers erregistratu
        registerProvider(new FacebookAuthProvider());
        registerProvider(new GoogleAuthProvider());
        registerProvider(new TwitterAuthProvider());
        registerProvider(new AppleAuthProvider());
    }
    
    public void registerProvider(AuthProvider provider) {
        providers.put(provider.getServiceName(), provider);
    }
    
    public boolean signIn(String service, String log, String pass) {
        AuthProvider provider = providers.get(service);
        if (provider != null) {
            return provider.authenticate(log, pass);
        }
        return false;
    }
}
