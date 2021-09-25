import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class IArchiver {
    void archive(String str) {
        try(ZipOutputStream zout = new ZipOutputStream(new FileOutputStream("newArchive.zip"))){
            ZipEntry entry = new ZipEntry("newData.txt");
            zout.putNextEntry(entry);
            zout.write(str.getBytes(StandardCharsets.UTF_8));
            zout.closeEntry();
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
