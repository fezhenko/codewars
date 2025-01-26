import java.util.Arrays;
import java.util.logging.Logger;

public class MergeSortedArraysII {

    private static final Logger logger = Logger.getLogger(MergeSortedArraysII.class.getSimpleName());

    public static void main(String[] args) {

        int[] nums1 = {1, 2, 3, 5, 7, 9};
        int[] nums2 = {2, 5, 6};
        logger.info(Arrays.toString(merge(nums1, nums2)));
    }

    /**
     * You are given two integer arrays nums1 and nums2, sorted in non-decreasing order
     * <p>
     * Merge nums1 and nums2 into a single array sorted in non-decreasing order.
     */
    private static int[] merge(int[] nums1, int[] nums2) {

        int totalCapacity = nums1.length + nums2.length;
        int[] result = new int[totalCapacity];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                result[k++] = nums1[i++];
            } else {
                result[k++] = nums2[j++];
            }
        }

        while (i < nums1.length) {
            result[k++] = nums1[i++];
        }

        while (j < nums2.length) {
            result[k++] = nums1[j++];
        }

        return result;
    }
}
