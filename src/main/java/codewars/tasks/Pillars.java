package codewars.tasks;

public class Pillars {
    public static void main(String[] args) {
        System.out.println(pillars(11,15,30));
    }
    public static int pillars(int numPill, int dist, int width){
        if (numPill == 1){
            return 0;
        }
        return (numPill - 1) * dist * 100 + (numPill - 2) * width;

    }
}
