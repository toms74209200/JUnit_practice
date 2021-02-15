package junit.tutorial.ch9;

import org.assertj.core.api.SoftAssertions;
import org.junit.Test;

public class ShopInfoTest {

    public static class InstantiationTest {

        @Test
        public void testDefaultConstructor() throws Exception {
            // Exercise
            ShopInfo instance = new ShopInfo();
            // Verify
            // ErrorCollector of Junit4 is compatible with SoftAssertions#setAfterAssertionErrorCollected of assertJ
            SoftAssertions softly = new SoftAssertions();
            StringBuilder reportBuilder = new StringBuilder(String.format("Assertions report:%n"));
            softly.setAfterAssertionErrorCollected(error -> reportBuilder.append(String.format("------------------%n%s%n", error.toString())));
            softly.assertThat(instance).isNotNull();
            softly.assertThat(instance.getId()).isNull();
            softly.assertThat(instance.getName()).isEmpty();
            softly.assertThat(instance.getAddress()).isEmpty();
            softly.assertThat(instance.getUrl()).isNull();
            System.out.print(reportBuilder);
        }
    }
}
