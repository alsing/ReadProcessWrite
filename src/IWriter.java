import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class IWriter {
    /*void write(String strs[]) {
        try(FileWriter writer = new FileWriter("newData.json")){

            for (int i = 0; i < 3; i++) {
                writer.write(strs[i]);
                //writer.flush();
            }
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }*/

    void write(String filename, String str){
        try(FileOutputStream fos = new FileOutputStream(filename)){
            byte[] buffer = str.getBytes(StandardCharsets.UTF_8);
            fos.write(buffer, 0, buffer.length);
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
