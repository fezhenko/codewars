package unique_array_value;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class UniqueArrayFinder {

    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 4, 2, 4};
        findUniqueArrayValue(arr);
    }

    public static void findUniqueArrayValue(int[] array) {
        Set<Map.Entry<Integer, Long>> entries =
                Arrays.stream(array)
                        .boxed()
                        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                        .entrySet();

        System.out.println(entries);
    }
}
