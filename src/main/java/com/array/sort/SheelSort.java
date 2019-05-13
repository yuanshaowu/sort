package com.array.sort;

import java.util.Arrays;

/**
 * 希尔排序
 *
 * @author huang
 * @date 2019/5/13
 */
public class SheelSort {

    public static void main(String[] args) {
        int[] array = new int[]{32, 15, 54, 3, 25, 345};
        System.out.println(Arrays.toString(array));
        sheelSort(array);
        System.out.println(Arrays.toString(array));
    }

    private static void sheelSort(int[] a) {
        int d = a.length;
        while (d != 0) {
            d = d / 2;
            //分的组数
            for (int x = 0; x < d; x++) {
                //组中的元素，从第二个数开始
                for (int i = x + d; i < a.length; i += d) {
                    //j为有序序列最后一位的位数
                    int j = i - d;
                    //要插入的元素
                    int temp = a[i];
                    //从后往前遍历。
                    for (; j >= 0 && temp < a[j]; j -= d) {
                        //向后移动d位
                        a[j + d] = a[j];
                    }
                    a[j + d] = temp;
                }
            }
        }
    }
}
