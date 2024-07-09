package codewars.tasks;

public class TwiceAsOld {
    public static void main(String[] args) {
        System.out.println(twiceAsOld(30,7));
    }
    public static  int twiceAsOld(int dadAge, int sonYears){
        if (sonYears == 0){
            return dadAge;
        }
        return Math.abs(dadAge -2 * sonYears);
    }
}
