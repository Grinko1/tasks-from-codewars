package codewars.tasks;

public class GetSum {
    public static void main(String[] args) {
        System.out.println(getSum(2, -1));
    }

    public static int getSum(int a, int b) {
        if (a == b) {
            return a;
        }
        int sum = 0;
        for (int i = Integer.min(a, b); i <= Integer.max(a, b); i++) {
            sum += i;
        }
        return sum;
    }
}
