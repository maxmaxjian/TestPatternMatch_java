import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {

    private static final Pattern PATTERN = Pattern.compile(
            "softStagger_(\\w+)(\\((\\d+)\\))?", Pattern.CASE_INSENSITIVE);

    public static void main(String[] args) {
        String s = "softStagger_staggerItem(1)";
        Matcher matcher = PATTERN.matcher(s);
        System.out.println(matcher.matches());

        System.out.println("matcher = " + matcher);
//        System.out.println("matcher.groupCount() = " + matcher.groupCount());

        String s1 = matcher.group();
        System.out.println(s1);

    }

}
