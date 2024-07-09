package codewars.tasks;

import java.util.Arrays;

public class ToCsvText {
    public static void main(String[] args) {
        System.out.println(toCsvText(new int[][] {
                { 0, 1, 2, 3, 45 },
                { 10,11,12,13,14 },
                { 20,21,22,23,24 },
                { 30,31,32,33,34 } }));
    }
    public static String toCsvText(int[][] array){
        StringBuilder res = new StringBuilder();
        for (int[] arr : array) {
            for (int i = 0; i < arr.length; i++) {
                int n = arr[i];
                if (i == arr.length -1){
                    res.append(n);
                }else{
                    res.append(n).append(",");
                }

            }
           res.append("\n");
        }
        if (res.length() > 0) {
            res.setLength(res.length() - 1);
        }
        return res.toString();

    }
}
