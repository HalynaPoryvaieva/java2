package lesson14;

import java.util.Arrays;

import static lesson13.Hm12.*;
import static lesson9.HomeWork9.createRandomArray;

public class Hw13 {
    // Используя System.currentTimeMillis() замерить время создания массива из 100_000 случайных целых чисел,
    // время линейного поиска в нём, время сортировки и время бинарного поиска.
    // Увеличить размерность массива до 100_000_000 и снова замерить время. Какие выводы?
    public static void main(String[] args) {
        int[] array = createRandomArray(100_000, 100_000);

        long startTime = 0;
        long starTime = System.currentTimeMillis();
        long andTime = System.currentTimeMillis();
        System.out.println("Время создания массива: " + (andTime - startTime) + "ms ");

        starTime = System.currentTimeMillis();
        linerSerhc(array, 50);
        System.out.println(" linerSerhc Time:" + (andTime - startTime) + "ms");

        starTime = System.currentTimeMillis();
        selectionSort(array);
        System.out.println(" selectionSort Time:" + (andTime - startTime) + "ms");

        starTime = System.currentTimeMillis();
        binarySearch(array, 50);
        System.out.println(" binarySearch Time:" + (andTime - startTime) + "ms");
    }

}

