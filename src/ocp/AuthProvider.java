package ocp;

public interface AuthProvider {
	boolean authenticate(String log, String pass);
    String getServiceName();
}
