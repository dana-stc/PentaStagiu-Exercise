import java.util.Scanner;

/**
 * Main
 * Created on 07-Mar-19
 * @author Stoica Ioana-Dana
 */
public class Main {

    public static void main(String[] args)
    {
        Scanner pathScanner = new Scanner(System.in);
        System.out.println("Please enter the input file!");
        String inputPath = pathScanner.next();
        System.out.println("The path of the input file is: " + inputPath);

        System.out.println("Please enter the output file!");
        String outputPath = pathScanner.next();
        System.out.println("The path of the output file is: " + outputPath);

        ReadFromFile file = new ReadFromFile(inputPath);
        file.readFile();
        WriteIntoFile file2 = new WriteIntoFile(outputPath);
        file2.writeToFile(file.getDataFromFile().toString());
        }
}