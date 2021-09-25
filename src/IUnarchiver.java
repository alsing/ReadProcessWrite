import java.io.*;
import java.io.FileInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class IUnarchiver {
    void unarchive(String filename) {
        try(ZipInputStream zin = new ZipInputStream(new FileInputStream(filename))) {
            ZipEntry entry;
            String name;
            long size;
            while((entry = zin.getNextEntry()) != null){
                name = entry.getName();
                size = entry.getSize();
                System.out.printf("File name: %s \t File size: %d \n", name, size);

                FileOutputStream fout = new FileOutputStream( "new" + name);
                for (int c = zin.read(); c != -1; c = zin.read()) {
                    fout.write(c);
                }
                fout.flush();
                zin.closeEntry();
                fout.close();
            }
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
