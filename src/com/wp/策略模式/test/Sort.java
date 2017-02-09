package com.wp.策略模式.test;

/**
 * Created by 王萍 on 2017/2/9 0009.
 */

/**
 * 将不同策略放在一个枚举里边
 * 但是这种方法违背了增加排序算法时，不修改源代码的原则，即必须修改此枚举
 */
public enum Sort {

    BubbleSort(){
        @Override
        public int[] sort(int[] arr) {
            int len=arr.length;
            for(int i=0;i<len;i++){
                for(int j=i+1;j<len;j++){
                    int temp;
                    if(arr[i]>arr[j]){
                        temp=arr[j];
                        arr[j]=arr[i];
                        arr[i]=temp;
                    }
                }
            }
            System.out.println("冒泡排序");
            return arr;
        }
    },SelectionSort() {
        @Override
        public int[] sort(int[] arr) {
            int len = arr.length;
            int temp;
            for (int i = 0; i < len; i++) {
                temp = arr[i];
                int j;
                int samllestLocation = i;
                for (j = i + 1; j < len; j++) {
                    if (arr[j] < temp) {
                        temp = arr[j];
                        samllestLocation = j;
                    }
                }
                arr[samllestLocation] = arr[i];
                arr[i] = temp;
            }
            System.out.println("选择排序");
            return arr;
        }
    },InsertionSort {
        @Override
        public int[] sort(int[] arr) {
            int len = arr.length;
            for (int i = 1; i < len; i++) {
                int j;
                int temp = arr[i];
                for (j = i; j > 0; j--) {
                    if (arr[j - 1] > temp) {
                        arr[j] = arr[j - 1];

                    } else
                        break;
                }
                arr[j] = temp;
            }
            System.out.println("插入排序");
            return arr;
        }
    };


    public abstract int[] sort(int arr[]);
}
