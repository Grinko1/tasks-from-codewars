package codewars.tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MultipleOfIndex {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(multipleOfIndex(new int[]{22, -6, 32, 82, 9, 25})));
    }
    public static int[] multipleOfIndex(int[] array) {
        List<Integer> resultList = new ArrayList<>();

        if (array[0] == 0) {
            resultList.add(array[0]);
        }
        for (int i = 1; i < array.length; i++) {
            if (array[i] % i == 0) {
                resultList.add(array[i]);
            }
        }

        int[] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }

        return result;
    }
}
