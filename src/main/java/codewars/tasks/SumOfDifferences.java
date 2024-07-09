package codewars.tasks;

import java.util.Arrays;
import java.util.Comparator;

public class SumOfDifferences {
    public static void main(String[] args) {
        System.out.println(sumOfDifferences(new int[]{-17,-17}));
    }
    public static int sumOfDifferences(int[] arr) {
        Arrays.sort(arr);
        int sum=0;
        for (int i =  arr.length-1; i >0; i--) {
            if (i -1 <= arr.length-1){
                sum += arr[i] - arr[i-1];
            }
        }
        return sum;
    }
}
