import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;

public class FindPairs {

    private static final Logger logger = Logger.getLogger(FindPairs.class.getName());

    /**
     * Вход:
     * nums = [1, 2, 3, 4, 6]
     * target = 6
     * Выход:
     * [1, 3]
     * Пояснение:
     * Числа с индексами 1 и 3 (значения 2 и 4) дают в сумме 6.
     */

    public static void main(String[] args) {
        List<Integer> nums = List.of(1, 2, 3, 4, 6);
        int target = 6;
        logger.info(findPairs(nums, target).toString());
        logger.info(findPairsOptimized(nums, target).toString());
    }

    // O(n2)
    static List<Integer> findPairs(List<Integer> nums, int target) {
        for (int i = 0; i < nums.size(); i++) {
            for (int j = i + 1; j < nums.size(); j++) {
                if (nums.get(i) + nums.get(j) == target) {
                    return List.of(i, j);
                }
                continue;
            }
            continue;
        }
        return Collections.emptyList();
    }

    // O(n)
    static List<Integer> findPairsOptimized(List<Integer> nums, int target) {
        int left = 0;
        int right = nums.size() - 1;
        while (left < right) {
            int sum = nums.get(left) + nums.get(right);
            if (sum == target) {
                return List.of(left, right);
            }
            if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return Collections.emptyList();
    }
}
