import java.util.Objects;

public class Problem2011 {
    public static void main(String[] args) {
        System.out.println(finalValueAfterOperations(new String[] {"++X","++X","X++"}));
    }

    public static int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for (String operation : operations) {
            if (Objects.equals(operation, "--X") || Objects.equals(operation, "X--")) {
                x--;
            } else if (Objects.equals(operation, "++X") || Objects.equals(operation, "X++")) {
                x++;
            }
        }
        return x;
    }
}
