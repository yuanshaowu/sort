package com.array.sort;

import java.util.Arrays;

/**
 * 快速排序
 *
 * @author huang
 * @date 2019/5/13
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] array = new int[]{32, 15, 54, 3, 25, 345};
        System.out.println(Arrays.toString(array));
        quickSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }

    private static void quickSort(int[] numbers, int start, int end) {
        if (start < end) {
            // 选定的基准值（第一个数值作为基准值）
            int base = numbers[start];
            // 记录临时中间值
            int temp;
            int i = start, j = end;
            do {
                while ((numbers[i] < base) && (i < end)) {
                    i++;
                }
                while ((numbers[j] > base) && (j > start)) {
                    j--;
                }
                if (i <= j) {
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                    i++;
                    j--;
                }
            } while (i <= j);
            if (start < j) {
                quickSort(numbers, start, j);
            }
            if (end > i) {
                quickSort(numbers, i, end);
            }
        }
    }
}
