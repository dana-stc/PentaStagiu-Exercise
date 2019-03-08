import java.io.IOException;
import java.nio.file.*;
import java.util.stream.Stream;

/**
 * ReadFromFile
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
            lines.forEach(line -> this.dataFromFile.append(line).append("\n"));
            if (this.dataFromFile.length() == 0) {
                System.out.println("The file is empty");
            } else {
                this.dataFromFile.deleteCharAt(this.dataFromFile.length() - 1);//eliminate the last "\n"
            }
        } catch (NoSuchFileException ex) {
            System.out.println("The file doesn't exist. Please create one and rerun the program");
        } catch (IOException e) {
            System.out.println("An error occurred when processing the file. Please retry later");
            this.dataFromFile = new StringBuilder();
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
