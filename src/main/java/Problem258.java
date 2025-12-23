public class Problem258 {
    public static void main(String[] args) {
//        System.out.println(addDigits(8125));
        System.out.println(1/10);
    }

    public static int addDigits(int num) {
//        int number = num;
//        int sum = 0;
//        while (String.valueOf(number).length() > 1) {
//            for (int i = 0; i < String.valueOf(number).length(); i++) {
//                sum += String.valueOf(number).charAt(i) - '0';
//            }
//            number = sum;
//            sum = 0;
//        }

        while (num >=10) {
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }
        return num;
    }
}

