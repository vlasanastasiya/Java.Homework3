            //   Реализовать алгоритм сортировки слиянием


import java.util.Arrays;
 

public class task1 {
    public static void main(String[] args) {
        int[] array = { 55, 78, 3, 12, 33, 74 };
        int[] result = mergesort(array);
        System.out.println(Arrays.toString(result));
    }
 
    public static int[] mergesort(int[] array) {
        int[] arrsort = Arrays.copyOf(array, array.length);
        int[] arrsort2 = new int[array.length];
        int[] result = mergesortInner(arrsort, arrsort2, 0, array.length);
        return result;
    }
 
    public static int[] mergesortInner(int[] arrsort, int[] arrsort2,
            int indexStart, int endIndex) {
        if (indexStart >= endIndex - 1) {
            return arrsort;
        }
        
        int middle = indexStart + (endIndex - indexStart) / 2;
        int[] sorted1 = mergesortInner(arrsort, arrsort2, indexStart, middle);
        int[] sorted2 = mergesortInner(arrsort, arrsort2, middle, endIndex);
   
        int index1 = indexStart;
        int index2 = middle;
        int index = indexStart;
        int[] result = sorted1 == arrsort ? arrsort2 : arrsort;
        while (index1 < middle && index2 < endIndex) {
            result[index++] = sorted1[index1] < sorted2[index2]
                    ? sorted1[index1++] : sorted2[index2++];
        }
        while (index1 < middle) {
            result[index++] = sorted1[index1++];
        }
        while (index2 < endIndex) {
            result[index++] = sorted2[index2++];
        }
        return result;
    }
}