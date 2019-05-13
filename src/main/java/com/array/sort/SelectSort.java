package com.array.sort;

import java.util.Arrays;

/**
 * 简单选择排序
 *
 * @author huang
 * @date 2019/5/13
 */
public class SelectSort {

    public static void main(String[] args) {
        int[] array = new int[]{32, 15, 54, 3, 25, 345};
        System.out.println(Arrays.toString(array));
        selectSort(array);
        System.out.println(Arrays.toString(array));
    }

    private static void selectSort(int[] a) {
        int length = a.length;
        //循环次数
        for (int i = 0; i < length; i++) {
            int key = a[i];
            int position = i;
            //选出最小的值和位置
            for (int j = i + 1; j < length; j++) {
                if (a[j] < key) {
                    key = a[j];
                    position = j;
                }
            }
            //交换位置
            a[position] = a[i];
            a[i] = key;
        }
    }
}
