
/**
 * Main
 * Created on 07-Mar-19
 * @author Stoica Ioana-Dana
 */
public class Main {

    public static void main(String[] args)
    {
        ReadFromFile file = new ReadFromFile("src/file.txt");
        file.readFile();
        System.out.println(file.getDataFromFile().toString());

        WriteIntoFile file2 = new WriteIntoFile("src/file2.txt");
        file2.writeToFile(file.getDataFromFile().toString());

    }
}
