package com.wp.策略模式;

public class Client
{
    public static void main(String args[])
    {
       int arr[]={1,4,6,2,5,3,7,10,9};
       int result[];
       ArrayHandler ah=new ArrayHandler();
       
       Sort sort = new BubbleSort();    //使用选择排序
       
       ah.setSortObj(sort); //设置具体策略
       result=ah.sort(arr);
       
       for(int i=0;i<result.length;i++)
       {
               System.out.print(result[i] + ",");
       }

        System.out.println();

        com.wp.策略模式.test.Sort.BubbleSort.sort(result);
        com.wp.策略模式.test.Sort.InsertionSort.sort(result);
        com.wp.策略模式.test.Sort.SelectionSort.sort(result);

    }
}