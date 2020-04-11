import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class R {
    public static String removeBang(String str) {
        return str.replaceAll("(\\w)(!)+", "$1");
    }
}