package lesson35;

import java.util.*;

public class HWork35 {
    public static void main(String[] args) {
        String text = "To be or not to be that is the question " +
                "Whether it is nobler in the mind to suffer " +
                "The slings and arrows of outrageous fortune " +
                "Or to take arms against a sea of troubles " +
                "And by opposing end them To die to sleep " +
                "No more and by a sleep to say we end";
        String[] words = text.toLowerCase().split(" ");
        Set<String> uniqueWords = new TreeSet<>(List.of(words));
        System.out.println(Arrays.toString(words));
        System.out.println(uniqueWords);


    }
}
