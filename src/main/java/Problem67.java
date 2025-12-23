import java.math.BigInteger;

public class Problem67 {
    public static void main(String[] args) {
        System.out.println(addBinary(
                "10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101",
                "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011"
        ));
    }

    public static String addBinary(String a, String b) {
        BigInteger number0 = new BigInteger(a, 2);
        BigInteger number1 = new BigInteger(b, 2);

        BigInteger sum = number0.add(number1);
        return sum.toString(2);
    }
}
