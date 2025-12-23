import java.util.Arrays;

public class Problem4 {
    public static void main(String[] args) {
        System.out.println(findMedianSortedArrays(new int[]{2,4}, new int[]{1}));
//        System.out.println(9/2);
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int[] result = new int[n1 + n2];
        int i = 0, j = 0, k = 0;
        while (i < n1 && j < n2) {
            if(nums1[i] <= nums2[j]) {
                result[k++] = nums1[i++];
            } else
                result[k++] = nums2[j++];
        }
        while (i < n1) result[k++] = nums1[i++];
        while (j < n2) result[k++] = nums2[j++];

        System.out.println(Arrays.toString(result));
        if((n1 + n2) == 1) return result[0];
        if (!((n1 + n2) % 2 == 0)) return result[(n1 + n2)/2];
        else return (double) (result[(n1 + n2) / 2] + result[(n1 + n2) / 2 - 1]) / 2;
    }
}
