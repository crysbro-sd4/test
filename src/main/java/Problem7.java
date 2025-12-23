import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem7 {
    public static void main(String[] args) {
        String text = "ab";
        Pattern pattern = Pattern.compile("b*");
        Matcher matcher = pattern.matcher(text);

        boolean fullMatch = matcher.matches();
        System.out.println(fullMatch);
//        System.out.println(reverse(-2147));
    }

    public static int reverse(int x) {
        String num = String.valueOf(Math.abs((long)x));
        StringBuilder stringBuilder = new StringBuilder(num);
        String revers = stringBuilder.reverse().toString();
        long reversedNum = 0;
        if (x >=0 ) {
            reversedNum = Long.parseLong(revers);
        }
        else if (x < 0 ) {
            reversedNum = -Long.parseLong(revers);
        }

        if (reversedNum < Integer.MIN_VALUE || reversedNum > Integer.MAX_VALUE) {
            return 0; // overflow
        }

        return (int) reversedNum;
    }
}
