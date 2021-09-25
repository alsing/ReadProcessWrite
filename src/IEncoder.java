import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class IEncoder {
    String encode (String str) {
        byte[] buffer = str.getBytes(StandardCharsets.UTF_8);
        return Base64.getEncoder().encodeToString(buffer);
    }
}
