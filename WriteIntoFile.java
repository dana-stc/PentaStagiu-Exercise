import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Main
 * Created on 07-Mar-19
 *
 * @author Stoica Ioana-Dana
 */

public class WriteIntoFile {

    private String outputPath;

    public WriteIntoFile(String outputPath) {
        this.outputPath = outputPath;
    }
    public void writeToFile(String dataFromFile) {
        //Get the file reference
        Path path = Paths.get(this.outputPath);

        //Use try-with-resource to get auto-closeable writer instance
        try (BufferedWriter writer = Files.newBufferedWriter(path)) {
            writer.write(dataFromFile); // clasa o transform in string
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getOutputPath() {
        return outputPath;
    }

    public void setOutputPath(String outputPath) {
        this.outputPath = outputPath;
    }
}
