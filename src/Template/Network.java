package Template;

public abstract class Network {
    String userName;
    String password;

    Network() {}

    public boolean post(Message message) {
        if (logIn(this.userName, this.password)) {
            boolean result = sendData(message);
            logOut();
            return result;
        }
        return false;
    }

    abstract boolean logIn(String userName, String password);
    abstract boolean sendData(Message message);
    abstract void logOut();

    protected void simulateNetworkLatency() {
        try {
            int i = 0;
            System.out.println();
            while (i < 10) {
                System.out.print(".");
                Thread.sleep(500);
                i++;
            }
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}