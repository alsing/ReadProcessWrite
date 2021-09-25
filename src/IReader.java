import javax.print.DocFlavor;
import java.io.FileReader;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class IReader {
   /* void read(String strs[], String name) {
        //String strs[] = new String[10];
        String line = "";
        try {
            FileReader fr = new FileReader(name);
            BufferedReader reader = new BufferedReader(fr);
            line = reader.readLine();
            //System.out.println(line);
            //strs[0] = line;
            for (int i = 0; line != null; i++) {
                System.out.println(line);
                strs[i] = line;
                line = reader.readLine();
            }
            //while (line != null) {
              //  System.out.println(line);
                //line = reader.readLine();
            //}
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return;
        /*int n = 0;
        String str = "";
        try (FileReader reader = new FileReader("data.txt")){
            n = reader.read();
            str = reader.read();
            System.out.println((char)n);
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
        return n;
    }*/

    void read(String name){
        try(FileInputStream fin = new FileInputStream(name)){
            byte[] buffer = new byte[fin.available()];
            fin.read(buffer, 0, fin.available());
            //String str = StandardCharsets.UTF_8.decode(byteBuffer).toString();
            String s = new String( buffer , StandardCharsets.UTF_8 );
            System.out.println(s);
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
