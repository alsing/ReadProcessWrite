import java.util.Base64;

public class IDecoder {
    String decode(String str) {
        byte[] buffer = Base64.getDecoder().decode(str);
        return new String(buffer);
    }
}
