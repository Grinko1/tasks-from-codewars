package codewars.tasks;

public class NearestSq {
    public static void main(String[] args) {
        System.out.println(nearestSq(111));
    }
    public static int nearestSq(final int n){
        int sqrt = (int) Math.sqrt(n);
        int lowerSquare = sqrt * sqrt;

        int higherSquare = (sqrt + 1) * (sqrt + 1);

        int distToLower = n - lowerSquare;
        int distToHigher = higherSquare - n;

        if (distToLower <= distToHigher) {
            return lowerSquare;
        } else {
            return higherSquare;
        }
    }
}
