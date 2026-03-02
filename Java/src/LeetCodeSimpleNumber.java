import static java.lang.String.valueOf;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.logging.Logger;

public class LeetCodeSimpleNumber {

    private static Logger logger = Logger.getLogger(LeetCodeRotateArray.class.getSimpleName());

    /**
     * Given a non-empty array of integers nums, every element appears twice except
     * for one. Find that single one.
     * 
     * You must implement a solution with a linear runtime complexity and use only
     * constant extra space.
     * 
     * Example 1:
     * Input: nums = [2,2,1]
     * Output: 1
     * 
     * Example 2:
     * Input: nums = [4,1,2,1,2]
     * Output: 4
     * 
     * Example 3:
     * Input: nums = [1]
     * Output: 1
     */

    public static void main(String[] args) {
        int result = singleNumber(new int[] { 1 });
        logger.info(valueOf(result));
    }

    public static int singleNumber(int[] nums) {
        Map<Integer, Integer> results = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int key = nums[i];
            if (null == results.computeIfPresent(key, (k, currentValue) -> currentValue + 1)) {
                results.put(key, 1);
            }
        }
        return results.entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Entry::getKey)
                .findFirst()
                .orElseGet(() -> 0);
    }
}
