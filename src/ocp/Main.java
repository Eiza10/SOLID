package ocp;

public class Main {
    public static void main(String[] args) {
        AuthService authService = new AuthService();
        
        authService.signIn("facebook", "user@fb.com", "pass123");
        authService.signIn("apple", "user@apple.com", "pass456");
    }
}
