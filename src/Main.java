import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        RecursiveSort recursiveSort = new RecursiveSort();

        int[] fibonacciArray = new int[]{
                4181, 89, 2584, 2, 3, 8, 5, 34, 21, 13,
                55, 1, 144, 1597, 377, 610, 987,
                233, 1, 0
        };

        recursiveSort.mergeSort(fibonacciArray);

        System.out.println(Arrays.toString(fibonacciArray));
    }
}