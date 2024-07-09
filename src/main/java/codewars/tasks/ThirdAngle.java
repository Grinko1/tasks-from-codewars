package codewars.tasks;

public class ThirdAngle {
    public static void main(String[] args) {
        System.out.println(otherAngle(50,60));

    }
    public static int otherAngle(int angle1, int angle2) {

        return 180 - (angle1 + angle2);
    }
}
