public class NumberToWords {
    private static final String[] units = {
            "", "One", "Two", "Three", "Four", "Five", "Six",
            "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve",
            "Thirteen", "Fourteen", "Fifteen", "Sixteen",
            "Seventeen", "Eighteen", "Nineteen"
    };

    private static final String[] tens = {
            "", "", "Twenty", "Thirty", "Forty", "Fifty",
            "Sixty", "Seventy", "Eighty", "Ninety"
    };
    public static String convertAmountToWords(double amount) {
        if (amount == 0)
            return "Zero Only";

        long wholePart = (long) amount;
        long decimalPart = Math.round((amount - wholePart) * 100);

        String words = convert(wholePart) + " Rupees";

        if (decimalPart > 0) {
            words += " and " + convert(decimalPart) + " Cents";
        }

        return words + " Only";
    }

    private static String convert(long number) {

        if (number < 20)
            return units[(int) number];

        if (number < 100)
            return tens[(int) number / 10] + " " + units[(int) number % 10];

        if (number < 1000)
            return units[(int) number / 100] + " Hundred " + convert(number % 100);

        if (number < 1000000)
            return convert(number / 1000) + " Thousand " + convert(number % 1000);

        if (number < 1000000000)
            return convert(number / 1000000) + " Million " + convert(number % 1000000);

        return convert(number / 1000000000) + " Billion " + convert(number % 1000000000);

    }

    public static void main(String[] args) {
        System.out.println(convertAmountToWords(289654.00));
    }
}
