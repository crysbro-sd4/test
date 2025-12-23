public class Problem65 {
    public static void main(String[] args) {
        System.out.println(isNumber("-123.456e789"));
    }

    public static boolean isNumber(String s) {
//        String regex = "[+-]?[0-9]+?.?[0-9]*[eE]?[+-]?[0-9]+?";
        String regex = "^[+-]?(\\.\\d+|\\d+(\\.\\d*)?)([eE][+-]?\\d+)?$";
        return s.matches(regex);
    }
}
