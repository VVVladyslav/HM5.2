import java.util.Arrays;

public class RecursiveSort {

    public static void mergeSort(int[] fibanachInts) {
        int[] support = Arrays.copyOf(fibanachInts, fibanachInts.length);
        int startIndex = 0;
        int stopIndex = support.length - 1;
        mergeSort(fibanachInts, support, startIndex, stopIndex);
    }

    public static void mergeSort(int[] fibanachInts, int[] support, int startIndex, int endIndex){
        if(startIndex >= endIndex){
            return;
        }
        int h = startIndex + (endIndex - startIndex) / 2;
        mergeSort(fibanachInts, support, startIndex, h);
        mergeSort(fibanachInts, support, h +1, endIndex);
        merge(fibanachInts, support, startIndex, h, h +1, endIndex);
    }

    public static void merge(int[] fibanachInts, int[] supportArray, int ls, int le, int rs, int re){
        for (int i = ls; i <= re; i++) {
            supportArray[i] = fibanachInts[i];
        }
        int l = ls;
        int r = rs;
        for (int i = ls; i <= re; i++) {
            if (l > le){
                fibanachInts[i] = supportArray[r];
                r = r + 1;
            } else if (r > re) {
                fibanachInts[i] = supportArray[l];
                l = l + 1;
            } else if (supportArray[l] < supportArray[r]) {
                fibanachInts[i] = supportArray[l];
                l = l + 1;
            }else {
                fibanachInts[i] = supportArray[r];
                r = r + 1;
            }
        }
    }
}
