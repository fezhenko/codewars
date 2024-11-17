import java.util.Arrays;
import java.util.logging.Logger;
import java.util.stream.IntStream;

public class MergeSortedArrays {

    private static final Logger logger = Logger.getLogger(MergeSortedArrays.class.getSimpleName());

    public static void main(String[] args) {

        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;
        merge(nums1, m, nums2, n);
        logger.info(Arrays.toString(nums1));
    }

    /**
     * You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
     * <p>
     * Merge nums1 and nums2 into a single array sorted in non-decreasing order.
     * <p>
     * The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
     */
    private static void merge(int[] nums1, int m, int[] nums2, int n) {
        IntStream.range(0, n)
                .forEach(i -> nums1[m + i] = nums2[i]);
        Arrays.sort(nums1);
    }
}
