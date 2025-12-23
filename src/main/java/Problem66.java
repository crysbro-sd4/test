import java.util.ArrayList;
import java.util.Arrays;

public class Problem66 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int[]{1,2,3})));
    }

    public static int[] plusOne(int[] digits) {
//        StringBuilder num = new StringBuilder();
//        StringBuilder sb = new StringBuilder();
//        ArrayList<Integer> arr = new ArrayList<>();
//
//        for (int digit : digits) {
//            num.append(digit);
//        }
//
//        int i = num.length() - 1;
//        int j = 0;
//        int carry = 0;
//
//        while (i >= 0 || j >=0 || carry > 0) {
//            int n1 = (i >= 0)? num.charAt(i) - '0':0;
//            int n2 = (j >= 0)? 1:0;
//
//            int sum = n1 + n2 + carry;
//            sb.append(sum % 10);
//            carry = sum / 10;
//
//            i--;
//            j--;
//        }
//        sb.reverse();
//        for (int k = 0; k < sb.length(); k++) {
//            arr.add(sb.charAt(k) - '0');
//        }
//        int[] result = new int[arr.size()];
//        for (int k = 0; k < arr.size(); k++) {
//            result[k] = arr.get(k);
//        }
//        return result;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits; // no carry, done
            }
            digits[i] = 0; // set to 0 and carry over
        }

        // if we reach here, all digits were 9 (e.g. 999 -> 1000)
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }
}
