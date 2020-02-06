package com.thoughtworks;

public class ArrayPractice3 {

    /**
     * 完成本方法实现功能: 将一个整型数组array中值0的元素去掉，并把剩下的元素组成新的数组
     */
    public static int[] filterZero(int[] array) {
        int newSize = 0;
        int[] arr = new int[array.length];
        for (int x: array) {
            if (x != 0) {
                arr[newSize] = x;
                newSize++;
            }
        }
        int[] newArr = new int[newSize];
        for (int i = 0; i < newSize; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }
}
