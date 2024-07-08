package codewars.tasks;

import java.util.Objects;

public class WarnTheSheep {
    public static void main(String[] args) {
        System.out.println(warnTheSheep(new String[]{"sheep", "sheep", "sheep", "sheep", "sheep", "wolf", "sheep", "sheep"}));
    }
    public static String warnTheSheep(String[] array){
        int wolfIndex = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals("wolf")) {
                wolfIndex = i;
                break;
            }
        }

        if (wolfIndex == array.length - 1) {
            return "Pls go away and stop eating my sheep";
        }

        int sheepPosition = array.length - wolfIndex - 1;
        return "Oi! Sheep number " + sheepPosition + "! You are about to be eaten by a wolf!";

    }
}
