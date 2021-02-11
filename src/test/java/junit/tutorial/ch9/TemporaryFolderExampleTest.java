package junit.tutorial.ch9;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.File;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

import static org.assertj.core.api.Assertions.assertThat;

public class TemporaryFolderExampleTest {

    @Rule
    public TemporaryFolder temporaryFolder = new TemporaryFolder();

    @Test
    public void testMkDefaultFilesCreating2Files() throws Exception {
        File folder = temporaryFolder.getRoot();
        TemporaryFolderExample.mkDefaultFiles(folder, "UnitTest");
        TemporaryFolderExample.mkDefaultFiles(folder, "readme.txt");
        List<String> actualFiles = Arrays.asList(Objects.requireNonNull(folder.list()));
        actualFiles.sort(Comparator.naturalOrder());
        assertThat(actualFiles.size()).isEqualTo(2);
        assertThat(actualFiles.get(0)).isEqualTo("UnitTest");
        assertThat(actualFiles.get(1)).isEqualTo("readme.txt");
    }
}
