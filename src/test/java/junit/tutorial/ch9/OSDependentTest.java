package junit.tutorial.ch9;

import org.junit.Rule;
import org.junit.Test;

import java.io.File;

import static org.assertj.core.api.Assertions.assertThat;

public class OSDependentTest {
    @Rule
    public OSDependent osDependent = new OSDependent();

    @Test
    @RunOn(RunOn.OS.WINDOWS)
    public void onlyWindows() throws Exception {
        System.out.println("test: onlyWindows");
        assertThat(File.separator).isEqualTo("\\");
    }

    @Test
    @RunOn(RunOn.OS.MAC)
    public void onlyMac() throws Exception {
        System.out.println("test: onlyMac");
        assertThat(File.separator).isEqualTo("/");
    }

    @Test
    @RunOn(RunOn.OS.LINUX)
    public void onlyLinux() throws Exception {
        System.out.println("test: onlyLinux");
        assertThat(File.separator).isEqualTo("/");
    }
}
