import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * Main
 * Created on 07-Mar-19
 *
 * @author Stoica Ioana-Dana
 */

public class ReadFromFile {

    private String inputPath;
    private StringBuilder dataFromFile;

    public ReadFromFile(String inputPath) {
        this.inputPath = inputPath;
        this.dataFromFile = new StringBuilder();
    }

    public void readFile() {
        Path path = Paths.get(this.inputPath);
        try (Stream<String> lines = Files.lines(path)) {
            lines.forEach(line -> this.dataFromFile.append(line).append("\n")); // need to read more
            if (this.dataFromFile.length() == 0) {
                System.out.println("File is empty");
            } else {
                this.dataFromFile.deleteCharAt(this.dataFromFile.length() - 1);//eliminate the last "\n"
            }
        } catch (IOException ex) {
            // do something or re-throw...
        }
    }

    public String getInputPath() {
        return inputPath;
    }

    public void setInputPath(String inputPath) {
        this.inputPath = inputPath;
    }

    public StringBuilder getDataFromFile() {
        return dataFromFile;
    }

    public void setDataFromFile(StringBuilder dataFromFile) {
        this.dataFromFile = dataFromFile;
    }

}
