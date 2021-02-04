package junit.tutorial.ch8;

import junit.tutorial.ch5.Calculator;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;
import org.yaml.snakeyaml.Yaml;

import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(Theories.class)
public class CalculatorDataPointsYamlTest {
    @SuppressWarnings("unchecked")
    @DataPoints
    public static Fixture[] getParames() throws Exception {
        BufferedReader br = Files.newBufferedReader(Paths.get("src/test/resources/ch8/params.yml"));
        return ((List<Fixture>) new Yaml().load(br)).toArray(new Fixture[0]);
    }

    @Theory
    public void add(Fixture p) throws Exception {
        Calculator calculator = new Calculator();
        assertThat(calculator.add(p.x, p.y)).isEqualTo(p.expected);
    }

    public static class Fixture {
        public int x;
        public int y;
        public int expected;
    }
}
