package codewars.tasks;

import java.util.Arrays;
import java.util.List;

public class SortTextbook {
    public static void main(String[] args) {
        System.out.println(sort(Arrays.asList("Alg#bra", "$istory", "Geom^try", "**English")));
    }
    public static List<String> sort(List<String> textbooks) {

       textbooks.sort((o1, o2) -> o1.compareToIgnoreCase(o2));
        return textbooks;
    }

}
