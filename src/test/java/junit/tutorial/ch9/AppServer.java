package junit.tutorial.ch9;

import org.junit.rules.ExternalResource;

public class AppServer extends ExternalResource {

    @Override
    protected void before() throws Throwable {
        System.out.println("start AP");
    }

    @Override
    protected void after() {
        System.out.println("shutdown AP.");
    }
}
