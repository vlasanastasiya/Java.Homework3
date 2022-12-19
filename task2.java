import java.util.ArrayList;
import java.util.Random;

public class task2 {
    public static void main(String[] args) {
        Random rand = new Random();
        int size = 8;
        ArrayList<Integer> list = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            list.add(rand.nextInt(50));
        }
        System.out.printf("Список -> %s\n", list);
        int i = 0;
        while (i < list.size()) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
            } else {
                i++;
            }
        }
        System.out.printf("Список с удаленными четными числами -> %s", list);
    }
}

