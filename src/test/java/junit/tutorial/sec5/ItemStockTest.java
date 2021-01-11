package junit.tutorial.sec5;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(Enclosed.class)
public class ItemStockTest {
    public static class EmptyCase {
        ItemStock itemStock;

        @Before
        public void setUp() throws Exception {
            itemStock = new ItemStock();
        }

        @Test
        public void testSizeAReturns0() throws Exception {
            assertThat(itemStock.size("A")).isEqualTo(0);
        }

        @Test
        public void testContainsAReturnsFalse() throws Exception {
            assertThat(itemStock.contains("A")).isFalse();
        }
    }

    public static class ContainsAItemA {
        ItemStock itemStock;

        @Before
        public void setUp() throws Exception {
            itemStock = new ItemStock();
            itemStock.add("A", 1);
        }

        @Test
        public void testSizeAReturns1() throws Exception {
            assertThat(itemStock.size("A")).isEqualTo(1);
        }

        @Test
        public void testContainsAReturnsTrue() throws Exception {
            assertThat(itemStock.contains("A")).isTrue();
        }
    }
}
