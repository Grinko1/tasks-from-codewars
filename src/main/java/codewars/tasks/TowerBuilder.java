package codewars.tasks;

import java.util.Arrays;

public class TowerBuilder {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(towerBuilder(3)));
    }
    public static String[] towerBuilder(int nFloors){
        String[] tower = new String[nFloors];
        int width= 2* nFloors-1;
        for (int i = 0; i < nFloors; i++) {
            int stars = 2 * i +1;
            int spaces = (width -stars)/2;

            StringBuilder floor = new StringBuilder();
            for (int j = 0; j < spaces; j++) {
                floor.append(" ");
            }
            for (int j = 0; j < stars; j++) {
                floor.append("*");
            }
            for (int j = 0; j < spaces; j++) {
                floor.append(" ");
            }
            tower[i] = floor.toString();
        }
        return tower;
    }
}
