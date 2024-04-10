package lesson33;

import java.util.*;

public class Lesson33 {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(25);
        integers.add(5);
        integers.add(3);
        integers.add(-4);
        System.out.println(integers);
        integers.remove(Integer.valueOf(3));
        System.out.println(integers);

        Deque<String> strings = new LinkedList<>();
        strings.push("I");
        strings.push("love");
        strings.push("Java");
        strings.push("!");
        System.out.println(strings);
        strings.pop();
        System.out.println(strings);
        System.out.println(strings.pop());
        System.out.println(strings);

        for (Integer item : integers) {
            System.out.println(item);
        }

        Iterator<Integer> iterator=integers.iterator();
        while (iterator.hasNext()){
            Integer item=iterator.next();
            System.out.println(item);
        }
    }

}
