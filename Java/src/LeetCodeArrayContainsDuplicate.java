import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Logger;

public class LeetCodeArrayContainsDuplicate {

    private static Logger logger = Logger.getLogger(LeetCodeArrayContainsDuplicate.class.getSimpleName());

    /**
     * Given an integer array nums, return true if any value appears at least twice
     * in the array, and return false if every element is distinct.
     * 
     * Example 1:
     * Input: nums = [1,2,3,1]
     * Output: true
     * 
     * Explanation:
     * The element 1 occurs at the indices 0 and 3.
     * 
     * Example 2:
     * Input: nums = [1,2,3,4]
     * Output: false
     * 
     * Explanation:
     * All elements are distinct.
     * 
     * Example 3:
     * Input: nums = [1,1,1,3,3,4,3,2,4,2]
     * Output: true
     */

    public static void main(String[] args) {
        logger.info(String.valueOf(containsDuplicate(new int[] { 1, 2, 3, 1 })));
        logger.info(String.valueOf(containsDuplicate(new int[] { 1, 2, 3, 4 })));
        logger.info(String.valueOf(containsDuplicate(new int[] { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 })));
        logger.info(String.valueOf(containsDuplicate(new int[] { 3, 3 })));
        logger.info(String.valueOf(containsDuplicate(new int[] { 0, 4, 5, 0, 3, 6 })));
    }

    // NOT EFFICIENT
    public static boolean containsDuplicateWith2Pointers(int[] nums) {
        boolean hasduplicates = false;
        for (int i = 0; i < nums.length; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            if (left < nums.length && nums[i] == nums[left]) {
                hasduplicates = true;
                return hasduplicates;
            }
            while (left <= right) {
                if (nums[i] != nums[left] && nums[i] != nums[right]) {
                    left++;
                    right--;
                } else {
                    hasduplicates = true;
                    break;
                }
            }
            if (hasduplicates) {
                return hasduplicates;
            }
        }

        return hasduplicates;
    }

    /**
     * Подход 1: СортировкаTime Complexity: $O(n \log n)$Space Complexity: зависит
     * от реализации сортировки (от $O(1)$ до $O(n)$)Если мы отсортируем массив
     * (например, встроенным методом Arrays.sort(nums)), все дубликаты встанут рядом
     * друг с другом. Тогда тебе не понадобятся вложенные циклы. Достаточно будет
     * одного цикла for, чтобы просто сравнить каждого соседа: nums[i] ==
     * nums[i+1].
     * 
     * Подход 2: Использование структуры данных HashSet (Самый ожидаемый
     * на интервью)Time Complexity: $O(n)$Space Complexity: $O(n)$ (так как мы
     * выделяем память под структуру данных)HashSet (Хэш-множество) — это коллекция,
     * которая хранит только уникальные значения. Самая главная суперсила HashSet в
     * Java заключается в том, что проверка наличия элемента (contains) и добавление
     * (add) происходят за время $O(1)$ (моментально, независимо от размера
     * множества!).Логика невероятно проста:Идешь по массиву nums.Пытаешься добавить
     * текущее число в HashSet.Если число уже есть в множестве, значит, мы нашли
     * дубликат — сразу возвращаем true.
     */
    public static boolean containsDuplicateWithSorting(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] == nums[i]) {
                return true;
            }
        }
        return false;
    }

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> values = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!values.add(nums[i])) {
                return true;
            }
        }
        return false;
    }
}
