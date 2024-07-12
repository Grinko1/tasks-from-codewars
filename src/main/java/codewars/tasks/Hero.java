package codewars.tasks;

public class Hero {
    public static void main(String[] args) {
        int arr[] = new int[]{0, 1, 1, 2, 3, 5, 8, 13, 21};
        int n = 6;
        n = arr[arr[n] / 2];
        System.out.println(n);
    }
    public static boolean hero(int bullets, int dragons) {
        // please code here
        return (bullets / 2) >= dragons;
    }

    public static void cal(long a, long b) {


    }
}
