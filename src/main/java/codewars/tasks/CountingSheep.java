package codewars.tasks;

public class CountingSheep {
    public static void main(String[] args) {
        System.out.println(countingSheep(3));
    }

    public static String countingSheep(int num) {
       StringBuilder res = new StringBuilder();
       if (num ==0){
           return "";
       }

        for (int i = 1; i <= num; i++) {
            res.append(i).append(" sheep...");
        }
        return res.toString();
    }
}
