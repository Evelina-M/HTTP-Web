public class Main {
    public static final int SERVER_SOCKET = 9999;
    public static final int POOL_SIZE = 64;

    public static void main(String[] args) {
        Server server = new Server(SERVER_SOCKET, POOL_SIZE);
        server.start();
    }
}