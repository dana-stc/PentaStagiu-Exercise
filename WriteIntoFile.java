import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * WriteIntoFile
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
        if (dataFromFile.isEmpty()) {
            System.out.println("The content of the file is empty");
        } else {
            System.out.println("The program will write to the file that you specified and if it doesn't exist it will create it with the same name");
            Path path = Paths.get(this.outputPath);

            //Use try-with-resource to get auto-closeable writer instance
            try (BufferedWriter writer = Files.newBufferedWriter(path)) {
                writer.write(dataFromFile);
                System.out.println("The data was written successfully to the output file");
            } catch (IOException e) {
                System.out.println("An error occurred while processing the data");
            }
        }
    }

    public String getOutputPath() {
        return outputPath;
    }

    public void setOutputPath(String outputPath) {
        this.outputPath = outputPath;
    }
}
