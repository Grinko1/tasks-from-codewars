package codewars.tasks;

public class IntToBinary {
    public static void main(String[] args) {
        System.out.println(toBinary(3));
    }
    public static int toBinary(int n) {
        return Integer.parseInt(Integer.toBinaryString(n));
    }
}
