package codewars.tasks;

import java.util.Arrays;

public class TotalPoints {
    public static void main(String[] args) {
        System.out.println(points(new String[]
                {"1:0", "2:0", "3:0", "4:0", "2:1", "3:1", "4:1", "3:2", "4:2", "4:3"}));
    }

    public static int points(String[] games) {
        int total = 0;
        for (String game : games) {
            String[] res = game.split(":");
            int ours = Integer.parseInt(res[0]);
            int rivals = Integer.parseInt(res[1]);
            if (ours > rivals) {
                total += 3;
            } else if (ours == rivals) {
                total += 1;
            }
        }
        return total;
    }
}
