package lesson35;

import java.util.HashSet;
import java.util.Set;

/**
 * AIT-TR,Java Basic,Task1
 * @author Halyna Poryvaieva
 * @version 10-04-24
 */
public class Hw35 {
    public static void main(String[] args) {
        String text = "java student project java student";
        String[] words = text.split("\\s+");
        Set<String> uniqueWords = new HashSet<>();

        for (String word : words) {
            uniqueWords.add(word);
        }

        System.out.println(uniqueWords);
    }
}
