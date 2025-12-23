import java.util.Arrays;

public class Problem58 {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello World"));
    }

    public static int lengthOfLastWord(String s) {
        int len = 0;
        String[] arr = s.trim().split(" ");

        return arr[arr.length - 1].length();
    }
}
