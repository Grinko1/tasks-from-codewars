package codewars.tasks;

public class MultiTable {
    public static void main(String[] args) {
        System.out.println(multiTable(5));
    }


    public static String multiTable(int num) {
        StringBuilder res = new StringBuilder();
        for (int i = 1; i <=10 ; i++) {
            res.append(i).append(" * ").append(num).append(" = ").append(i*num).append("\n");
        }
        return res.substring(0, res.length()-1); // good luck
    }
}
