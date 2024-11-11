import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

public class FindSubarrayWithSums {
    public static final Logger logger = Logger.getLogger(FindSubarrayWithSums.class.getName());


    /**
     * Вход:
     * nums = [1, 3, -2, 5, 4, -3]
     * target = 6
     * Выход:
     * [1, 3]
     * Пояснение:
     * Подмассив с индексами от 1 до 3 (значения [3, -2, 5]) дает в сумме 6.
     */
    public static void main(String[] args) {
        int[] nums = new int[]{1, 3, -2, 5, 4, -3};
        int target = 6;
        logger.info(findSubarrayWithSums(nums, target).toString());
    }

    static List<Integer> findSubarrayWithSums(int[] nums, int target) {
        int currentSum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];

            if (currentSum == target) {
                return List.of(0, i);
            }

            // define the sub-array start index
            if (map.containsKey(currentSum - target)) {
                return List.of(map.get(currentSum - target) + 1, i);
            }

            map.put(currentSum, i);
        }

        return List.of();
    }
}
