package junit.tutorial.ch7;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(Enclosed.class)
public class LruCacheTest {

    public static class ContainsAAndBCase {

        LruCache<String> lruCache;

        @Before
        public void setUp() throws Exception {
            lruCache = new LruCache<>();
            lruCache.put("A", "valueA");
            lruCache.put("B", "valueB");
        }

        @Test
        public void testSizeReturns2() throws Exception {
            assertThat(lruCache.size()).isEqualTo(2);
        }

        @Test
        public void testGetAReturnsValueAKeysBA() throws Exception {
            assertThat(lruCache.get("A")).isEqualTo("valueA");
            assertThat(lruCache.keys.size()).isEqualTo(2);
            assertThat(lruCache.keys.get(0)).isEqualTo("B");
            assertThat(lruCache.keys.get(1)).isEqualTo("A");
        }

        @Test
        public void testGetBReturnsValueBKeysAB() throws Exception {
            assertThat(lruCache.get("B")).isEqualTo("valueB");
            assertThat(lruCache.keys.size()).isEqualTo(2);
            assertThat(lruCache.keys.get(0)).isEqualTo("A");
            assertThat(lruCache.keys.get(1)).isEqualTo("B");
        }

        @Test
        public void testGetCReturnsNullKeysAB() throws Exception {
            assertThat(lruCache.get("C")).isNull();
            assertThat(lruCache.keys.size()).isEqualTo(2);
            assertThat(lruCache.keys.get(0)).isEqualTo("A");
            assertThat(lruCache.keys.get(1)).isEqualTo("B");
        }

        @Test
        public void testPutCSize3KeysABC() throws Exception {
            // SetUp
            String key = "C";
            String item = "valueC";
            // Exercise
            lruCache.put(key, item);
            // Verify
            assertThat(lruCache.size()).isEqualTo(3);
            assertThat(lruCache.keys.size()).isEqualTo(3);
            assertThat(lruCache.keys.get(0)).isEqualTo("A");
            assertThat(lruCache.keys.get(1)).isEqualTo("B");
            assertThat(lruCache.keys.get(2)).isEqualTo("C");
        }
    }
}
