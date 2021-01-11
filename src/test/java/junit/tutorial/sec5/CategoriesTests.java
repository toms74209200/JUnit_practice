package junit.tutorial.sec5;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Categories.ExcludeCategory(SlowTest.class)
@Suite.SuiteClasses(SlowAndFastTest.class)
public class CategoriesTests {
}
