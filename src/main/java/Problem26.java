import java.util.ArrayList;
import java.util.Arrays;

public class Problem26 {
    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[] {0,0,1,1,1,2,2,3,3,4}));
    }

    public static int removeDuplicates(int[] nums) {
//        ArrayList<Integer> a = new ArrayList<>();
//        for (int i = 0; i < nums.length; i++) {
//            if(!a.contains(nums[i])) {
//                a.add(nums[i]);
//            }
//        }
//        for (int i = 0; i < a.size(); i++) {
//            nums[i] = a.get(i);
//        }
//        System.out.println(Arrays.toString(nums));
//        return a.size();
        if (nums.length == 0) return 0;

        int k = 1; // index for the next unique element
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i]; // place unique element in the front
                k++;
            }
        }
        return k;
    }
}
