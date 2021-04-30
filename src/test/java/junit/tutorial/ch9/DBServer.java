package junit.tutorial.ch9;

import org.junit.rules.ExternalResource;

public class DBServer extends ExternalResource {
    @Override
    protected void before() throws Throwable {
        System.out.println("start DB");
    }

    @Override
    protected void after() {
        System.out.println("shutdown DB.");
    }
}
