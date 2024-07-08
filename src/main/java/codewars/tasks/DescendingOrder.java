package codewars.tasks;


import java.util.Arrays;
import java.util.Comparator;

public class DescendingOrder {
    public static void main(String[] args) {
        System.out.println(sortDesc(4356));
    }
    public static int sortDesc(final int num) {
        String[] numsArr = String.valueOf(num).split("");
        Arrays.sort(numsArr, Comparator.reverseOrder());
       return Integer.parseInt(String.join("",numsArr));
    }
}
