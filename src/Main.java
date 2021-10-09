import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String mainString = "";

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter input file name: ");
        String finName = scan.nextLine();
        System.out.println("Is data in your file encoded? Use +/-:");
        String isFinEncoded = scan.nextLine();

        if(finName.substring(finName.length() - 4).equals(".zip")) {
            mainString = IUnarchive.unarchive(finName);
        }
        else {
            mainString = IReader.read(finName);
        }

        if (isFinEncoded.equals("+")) {
            mainString = IDecoder.decode(mainString);
        }

        mainString = IProcess.process(mainString);

        System.out.println("Enter output file name: ");
        String foutName = scan.nextLine();

        System.out.println("Do you want your data to be encoded? Use +/-:");
        String isFoutEncoded = scan.nextLine();

        if (isFoutEncoded.equals("+")) {
            mainString = IEncoder.encode(mainString);
        }

        if(foutName.substring(foutName.length() - 4).equals(".zip")) {
            IArchive.archive(foutName, mainString);
        }
        else {
            IWriter.write(foutName, mainString);
        }

    }
}
