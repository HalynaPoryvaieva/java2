package lesson__14;

import lesson__9.HomeWork9;

import java.util.Arrays;
import static lesson__13.Hm12_1.*;
import static lesson__9.HomeWork9.createRandomArray;

public class Hw13 {
    // Используя System.currentTimeMillis() замерить время создания массива из 100_000 случайных целых чисел,
    // время линейного поиска в нём, время сортировки и время бинарного поиска.
    // Увеличить размерность массива до 100_000_000 и снова замерить время. Какие выводы?
    public static void main(String[] args) {
        int[] array = createRandomArray(100000, 100000000);
        for (int a : array) {
            long startTime = 0;
            System.out.println("Размер массива: " + array.length);
            long starTime = System.currentTimeMillis();
            array = createRandomArray(1000000, 100000000);
            long andTime = System.currentTimeMillis();
            System.out.println("Время создания массива: " + (andTime - startTime) + "ms ");

            starTime = System.currentTimeMillis();
            linerSerhc(array, 50);
            andTime = System.currentTimeMillis();
            System.out.println(" linerSerhc Time:" + (andTime - startTime) + "ms");
            System.out.println(linerSerhc(array, 50));

            selectionSort(array);
            starTime = System.currentTimeMillis();
            andTime = System.currentTimeMillis();
            System.out.println(" selectionSort Time:" + (andTime - startTime) + "ms");
            System.out.println(Arrays.toString(array));

            binarySearch(array, 50);
            starTime = System.currentTimeMillis();
            andTime = System.currentTimeMillis();
            System.out.println(binarySearch(array, 50));
            System.out.println(" binarySearch Time:" + (andTime - startTime) + "ms");
        }

    }
}
