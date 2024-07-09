package codewars.tasks;

public class Feast {
    public static void main(String[] args) {
        System.out.println(feast("brown bear","bear claw"));
    }
    public static boolean feast(String beast, String dish) {

        return beast.substring(0,1).equals(dish.substring(0,1))
                &&
                beast.substring(beast.length()-1).equals(
                dish.substring(dish.length()-1)
        );

    }
}
