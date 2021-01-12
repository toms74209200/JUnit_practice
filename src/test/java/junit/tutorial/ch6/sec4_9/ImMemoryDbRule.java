package junit.tutorial.ch6.sec4_9;

import junit.tutorial.ch6.sec4_8.InMemoryDb;
import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

public class ImMemoryDbRule implements TestRule {

    InMemoryDb inMemoryDb = null;

    @Override
    public Statement apply(final Statement base, Description description) {
        inMemoryDb = new InMemoryDb();
        return new Statement() {

            @Override
            public void evaluate() throws Throwable {
                inMemoryDb.start();
                try {
                    base.evaluate();
                } finally {
                    inMemoryDb.shutdownNow();
                }
            }
        };
    }

}
