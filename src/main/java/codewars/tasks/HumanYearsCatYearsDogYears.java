package codewars.tasks;

import java.util.Arrays;

public class HumanYearsCatYearsDogYears {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(humanYearsCatYearsDogYears(3)));
    }

    public static int[] humanYearsCatYearsDogYears(final int humanYears) {

        int catYears = 0;
        int dogYears = 0;
        for (int i = 1; i <= humanYears; i++) {
            if (i == 1) {
                catYears += 15;
                dogYears += 15;
            } else if (i == 2) {
                catYears += 9;
                dogYears += 9;
            } else {
                catYears += 4;
                dogYears += 5;
            }
        }
        return new int[]{humanYears, catYears, dogYears};
    }
}
