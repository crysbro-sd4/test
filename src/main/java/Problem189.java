import java.util.Arrays;

public class Problem189 {
    public static void main(String[] args) {
        rotate(new int[]{5864,782973,146928,65258,335423,13691,94744,208426,592583,551595,211821,607331,108495,568457,3526},
                54944);
    }

    public static void rotate(int[] nums, int k) {
        k = k % nums.length;
        for (int i = 0; i < k; i++) {
            int last = nums[nums.length - 1];
            for (int j = nums.length - 1; j > 0; j--) {
                nums[j] = nums[j - 1];
            }
            nums[0] = last;
        }
    }
}

