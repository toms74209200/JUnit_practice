package junit.tutorial.ch9;

import org.junit.rules.ExternalResource;

public class ServerResource extends ExternalResource {

    Server server;

    @Override
    protected void before() throws Throwable {
        server = new Server(80880);
        server.start();
    }

    @Override
    protected void after() {
        server.shutdown();
    }
}
