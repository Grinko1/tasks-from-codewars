package codewars.tasks;

public class OddCount {
    public static void main(String[] args) {
        System.out.println(oddCount(15023));
    }
    public static int oddCount(int n){
        int count =0;
        for (int i = 0; i < n; i++) {
            if (i % 2 ==1 ){
                count++;
            }
        }
        return n /2;
    }
}
