package codewars.tasks;

public class ReplaceDotsInStr {
    public static void main(String[] args) {
        System.out.println(replaceDots("one.two.three"));
    }
    public static String replaceDots(final String str) {
        return str.replaceAll("\\.", "-");
    }
}
