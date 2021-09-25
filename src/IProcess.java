import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IProcess {
    void process(String strs[]) {
        for(int i = 0; i < 3; i++){
            strs[i] += "!!!\n";
        }

        String text = "1+2mnfbdfd-2jnefjn0000+2";
        Pattern pattern = Pattern.compile("[0-9].+[-+*/].+[0-9]");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println(text.substring(matcher.start(), matcher.end()));
        }

    }
}
