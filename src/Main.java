import java.util.Base64;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter input file name: ");
        String filename = scan.nextLine();

        IReader reader = new IReader();
        String enteredString = reader.read(filename);

        IEncoder encoder = new IEncoder();
        String encodedString = encoder.encode(enteredString);

        System.out.println("Enter output file name: ");
        filename = scan.nextLine();

        IWriter writer = new IWriter();
        writer.write(filename, encodedString);
        //writer.write(filename, enteredString);
        System.out.println();
    }
}
