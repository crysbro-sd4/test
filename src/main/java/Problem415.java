public class Problem415 {
    public static void main(String[] args) {
        System.out.println(addStrings("11", "1"));
//        int num = 8;
//        System.out.println((int)Math.floor(Math.sqrt(num)));
    }

    public static String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();

        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;

        while (i >= 0 || j >=0 || carry > 0) {
            int n1 = (i >= 0)? num1.charAt(i) - '0':0;
            int n2 = (j >= 0)? num2.charAt(j) - '0':0;

            int sum = n1 + n2 + carry;
            sb.append(sum % 10);
            carry = sum / 10;

            i--;
            j--;
        }

        return sb.reverse().toString();
    }
}
