package codewars.tasks;

public class ExpressionsMatter {
    public static void main(String[] args) {
        System.out.println(expressionsMatter(2, 1, 2));
    }
    public static int expressionsMatter(int a, int b, int c){
        int max = 0;

        // Case 1: a * (b + c)
        max = Math.max(max, a * (b + c));

        // Case 2: a * b * c
        max = Math.max(max, a * b * c);

        // Case 3: a + b * c
        max = Math.max(max, a + b * c);

        // Case 4: (a + b) * c
        max = Math.max(max, (a + b) * c);

        // Case 5: a + b + c
        max = Math.max(max, a + b + c);

        // Case 6: a * b + c
        max = Math.max(max, a * b + c);

        // Case 7: a + b * c
        max = Math.max(max, a + b * c);

        // Case 8: a * (b + c)
        max = Math.max(max, a * (b + c));

        return max;
    }
}
