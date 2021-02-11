package junit.tutorial.ch9;

public class Server {

    int port;

    public Server(int port) {
        this.port = port;
    }

    public void start() {
        System.out.println("Start server port: "+port);
    }

    public void shutdown() {
        System.out.println("Shutdown server");
    }
}
