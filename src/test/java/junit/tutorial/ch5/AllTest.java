package junit.tutorial.ch5;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({FooTest.class, BarTest.class})
public class AllTest {
}
