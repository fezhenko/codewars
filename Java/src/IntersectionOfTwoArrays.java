import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

public class IntersectionOfTwoArrays {

    private static final Logger logger = Logger.getLogger(MergeSortedArrays.class.getSimpleName());

    public static void main(String[] args) {
        logger.info(Arrays.toString(intersect(new int[] { 1, 2, 2, 1 }, new int[] { 2, 2 })));
    }

    /**
     * Given two integer arrays nums1 and nums2, return an array of their
     * intersection. Each element in the result must appear as many times as it
     * shows in both arrays and you may return the result in any order.
     * 
     * Example 1:
     * Input: nums1 = [1,2,2,1], nums2 = [2,2]
     * Output: [2,2]
     * 
     * Example 2:
     * Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
     * Output: [4,9]
     * Explanation: [9,4] is also accepted.
     * 
     */
    public static int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> init = new HashMap<>();
        if (nums1.length > nums2.length) {
            intersect(nums2, nums1);
        }
        fillTheMap(nums1, init);
        List<Integer> results = new ArrayList<>();
        for (int i = 0; i < nums2.length; i++) {
            int val = nums2[i];
            int count = init.getOrDefault(val, 0);
            if (count > 0) {
                results.add(val);
                init.put(val, count - 1);
            }
        }

        return results
                .stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }

    private static void fillTheMap(int[] nums, Map<Integer, Integer> init) {
        for (int i = 0; i < nums.length; i++) {
            int val = nums[i];
            init.put(val, init.getOrDefault(val, 0) + 1);
        }
    }
}
