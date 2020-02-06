package com.thoughtworks;

public class ArrayPractice4 {

    /**
     * 完成本方法实现功能: 将一个数字插入到给定的已经排好序的数组中，要求插入以后数组依然是有序的
     */
    public static int[] insert(int number) {
        int[] array = new int[]{1, 20, 50, 100};
        int insertIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (number > array[i]) {
                insertIndex = i + 1;
            }
        }
        int[] newArr = new int[array.length + 1];
        for (int i = 0; i < newArr.length; i++) {
            if (i < insertIndex) {
                newArr[i] = array[i];
            } else if (i == insertIndex) {
                newArr[i] = number;
            } else {
                newArr[i] = array[i - 1];
            }
        }
        return newArr;
    }
}
