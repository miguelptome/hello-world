package pt.courses.password;

public interface PasswordService {
    
    String hash(String input);
    
    String algorithm();
    
}
