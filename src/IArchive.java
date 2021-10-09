import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class IArchive {
    static void archive(String filename, String str) {
        try(ZipOutputStream zout = new ZipOutputStream(new FileOutputStream(filename))){
            ZipEntry entry = new ZipEntry(filename.substring(0, filename.length() - 4) + ".txt");
            zout.putNextEntry(entry);
            zout.write(str.getBytes(StandardCharsets.UTF_8));
            zout.closeEntry();
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
