import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class LeetCode2Sum {

    private static Logger logger = Logger.getLogger(LeetCode2Sum.class.getSimpleName());

    /**
     * Задача: Two Sum (Сумма двух чисел)
     * Дан массив целых чисел nums и целое число target. Тебе нужно найти индексы
     * двух чисел в этом массиве, которые в сумме дают target.
     * Условия:У каждой задачи есть ровно одно решение.Нельзя использовать один и
     * тот же элемент дважды (нельзя сложить число само с собой по одному и тому же
     * индексу).
     * Вернуть ответ нужно в виде массива из двух чисел: [index1, index2].
     * 
     * Пример:
     * Вход: nums = [2, 7, 11, 15], target = 9
     * Выход: [0, 1] (потому что nums[0] + nums[1] = 2 + 7 = 9)
     * 
     * Пример 2:
     * Вход: nums = [3, 2, 4], target = 6
     * Выход: [1, 2] (потому что 2 + 4 = 6)
     * 
     * Твой план действий:Раньше
     * мы использовали HashSet, чтобы просто запоминать "видел я это число или нет".
     * Но здесь нам нужно не просто знать, что число было, а где именно оно стояло
     * (его индекс).Для этого идеально подойдет HashMap<Integer, Integer>, где:Key
     * (Ключ): Само число из массива.Value (Значение): Индекс этого числа.Логика
     * «Охотника»:Когда ты стоишь на числе x, ты не ищешь "что-нибудь". Ты ищешь
     * конкретное "дополнение" (назовем его complement), такое что:$$complement =
     * target - x$$Проходишь по массиву.Для текущего числа nums[i] вычисляешь, какое
     * число тебе нужно в пару: target - nums[i].Проверяешь в HashMap: «А нет ли там
     * этого дополнения?»Если есть — бинго! Возвращаешь текущий индекс i и индекс
     * дополнения из карты.Если нет — кладешь текущее число и его индекс в карту и
     * идешь дальше.
     * 
     */

    public static void main(String[] args) {
        int[] result = twoSum(new int[] { 2, 7, 11, 15 }, 9);
        logger.info(String.valueOf(result[0]));
        logger.info(String.valueOf(result[1]));
    }

    private static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (hashMap.containsKey(complement)) {
                return new int[] { hashMap.get(complement), i };
            }
            hashMap.put(nums[i], i);
        }
        return new int[0];
    }

}
