public class AuthenticationSystem {
    public boolean login(String username, String password) {
        
        System.out.println("User logged in: " + username);
        return true;
    }

    public void logout(String userID) {
        
        System.out.println("User logged out: " + userID);
    }

    public void registerUser(String userInfo) {
       
        System.out.println("User registered: " + userInfo);
    }
}