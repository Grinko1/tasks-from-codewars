package codewars.tasks;

public class PythagoreanTriple {
    public static void main(String[] args) {
        System.out.println(pythagoreanTriple(new int[]{100, 3, 999}));

    }
    public static int pythagoreanTriple(int[] triple){
        for (int i = 0; i < triple.length; i++) {
            double c = Math.pow(triple[i], 2);
            for (int j = 0; j < triple.length-1; j++) {
                double a = Math.pow(triple[j], 2);
                double b = Math.pow(triple[j+1], 2);
                if (i != j){
                    if (a + b == c){
                        return 1;
                    }
                }
            }
        }
        return 0;

    }

}
