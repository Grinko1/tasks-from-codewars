package example.task.codewars;

public class WhoLikesIt {
    public static void main(String[] args) {
        String[] names = {"Max", "John", "Mark", "Peter","Max", "John", "Mark", "Peter"};
        System.out.println(whoLikes(names));
    }

    public static String whoLikes(String[] names) {
        if (names.length > 3){
            return names[0]+", "+ names[1] + " and " + (names.length -2) + " others like this";
        }else{
            return switch (names.length) {
                case 0 -> "no one likes this";
                case 1 -> names[0] + " likes it";
                case 2 -> names[0] + " and "+ names[1] +" like it";
                case 3 -> names[0] +", " +names[1]+" and "+ names[2] +" like it";
                default -> throw new IllegalStateException("Unexpected value: " + names.length);
            };
        }
     
    }
}
