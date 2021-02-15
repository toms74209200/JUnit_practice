package junit.tutorial.ch9;

import org.junit.rules.Verifier;

import static org.assertj.core.api.Assertions.assertThat;

public class ErrorLogVerifier extends Verifier {

    final ErrorLog log;

    public ErrorLogVerifier(ErrorLog log) {
        this.log = log;
    }

    @Override
    protected void verify() throws Throwable {
        assertThat(log.size()).isEqualTo(0);
    }
}
