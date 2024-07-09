package codewars.tasks;

public class Century {
    public static void main(String[] args) {
        System.out.println(century(1500));
    }
    public static int century(int number) {
        if (number < 1000){
            return number % 10 == 0 ? number/100:  (number/100) +1 ;
        }else{
            if (number % 10 > 0){
                return (number/100) +1;
            }else{
                return number/100;
            }
        }


    }
}
