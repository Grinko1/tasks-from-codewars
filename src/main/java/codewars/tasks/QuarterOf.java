package codewars.tasks;

public class QuarterOf {
    public static void main(String[] args) {
        System.out.println(quarterOf(2));
    }

    public static int quarterOf(int month) {
        if (month <= 3){
            return 1;
        }else if (month > 3 && month <=6 ){
            return 2;
        } else if (month > 6 && month <= 9) {
            return 3;
        }else {
            return 4;
        }

    }
}
