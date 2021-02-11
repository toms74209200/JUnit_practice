package junit.tutorial.ch9;

import java.io.File;

public class TemporaryFolderExample {

    public static void mkDefaultFiles(File folder, String name) throws Exception {
        new File(folder, name).createNewFile();
    }
}
