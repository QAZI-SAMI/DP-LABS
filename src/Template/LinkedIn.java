package Template;

public class LinkedIn extends Network {
    public LinkedIn(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public boolean logIn(String userName, String password) {
        System.out.println("\nChecking user's parameters");
        System.out.println("Name: " + this.userName);
        System.out.print("Password: ");
        for (int i = 0; i < this.password.length(); i++) {
            System.out.print("*");
        }
        simulateNetworkLatency();
        System.out.println("\n\nLogIn success on LinkedIn");
        return true;
    }

    public boolean sendData(Message message) {
        boolean messagePosted = true;
        if (messagePosted) {
            System.out.println("Message: '" + message.getDescription() + "' was posted on LinkedIn");
            return true;
        } else {
            return false;
        }
    }

    public void logOut() {
        System.out.println("User: '" + userName + "' was logged out from LinkedIn");
    }
}