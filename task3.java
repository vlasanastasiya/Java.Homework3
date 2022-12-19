import java.util.ArrayList;
import java.util.Random;

import static java.util.Collections.max;
import static java.util.Collections.min;

public class task3 {
    public static void main(String[] args) {
        Random rand = new Random();
        int size = 8;
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < size; i++) {
            list.add(rand.nextInt(50));
        }
        System.out.printf("Список -> %s\n", list);
        int max = max(list);
        int min = min(list);

        int count = list.size();
        int sum = 0;
        for (Integer i : list) {
            sum += i;
        }

        double result = sum / count;

        System.out.printf("Минимальное: %d, максимальное: %d, среднее арифметичское: %f", min, max, result);
    }
}
