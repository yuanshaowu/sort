package com.array.sort;

import java.util.Arrays;

/**
 * 插入排序
 *
 * @author huang
 * @date 2019/5/13
 */
public class InsertSort {

    public static void main(String[] args) {
        int[] array = new int[]{32, 15, 54, 3, 25, 345};
        System.out.println(Arrays.toString(array));
        insertSort(array);
        System.out.println(Arrays.toString(array));
    }

    private static void insertSort(int[] a) {
        //数组长度，将这个提取出来是为了提高速度。
        int length = a.length;
        //要插入的数
        int insertNum;
        //插入的次数
        for (int i = 1; i < length; i++) {
            //要插入的数
            insertNum = a[i];
            //已经排序好的序列元素个数
            int j = i - 1;
            //序列从后到前循环，将大于insertNum的数向后移动一格
            while (j >= 0 && a[j] > insertNum) {
                //元素移动一格
                a[j + 1] = a[j];
                j--;
            }
            //将需要插入的数放在要插入的位置。
            a[j + 1] = insertNum;
        }
    }
}
