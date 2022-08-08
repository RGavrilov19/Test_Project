package com.max.idea;

public class Task_3 {
    public static void main(String[] args) {
        int[] arr = {5, 2, 19, 6, 12};
        int frst_elem = arr[0];
        arr[0] = arr[arr.length-1];
        arr[arr.length-1] = frst_elem;
        System.out.println(arr[0]+arr[(arr.length-1)/2]);
    }
}
