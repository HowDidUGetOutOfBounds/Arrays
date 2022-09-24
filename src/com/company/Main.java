package com.company;

import java.util.Scanner;

public class Main {



    public static int[] bubbleSort(int[] array)
    {
        boolean sorted = false;
        int temp;
        while (!sorted)
        {
            sorted = true;
            for(int i = 0; i < array.length - 1; i++)
            {
                if(array[i] > array[i+1])
                {
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    sorted = false;
                }
            }
        }
        return array;
    }
    //                  0  1  2   3   4  5   6   7   8    9
    static int[] arr = {6, 2, 15, 5, 15, 81, 4, 100, 245, 253};


    public static int[] insertionSort(int[] array){
        for(int i = 1; i < array.length; i++){
            int current = array[i]; // 4
            int j = i - 1; // 1
            while (j >= 0 && current < array[j]){
                array[j+1] = array[j];
                j--;
            }
            array[j + 1] = current;
        }

        return array;
    }

    public static int binarySearch(int[] array, int elementToSearch)
    {
        int firstElem = 0;
        int lastElem = array.length - 1;
        while (firstElem <= lastElem)
        {
            int middle = (firstElem + lastElem) / 2;
            if(array[middle] == elementToSearch)
            {
                return middle;
            }
            else if (array[middle] < elementToSearch)
            {
                firstElem = middle + 1;
            }
            else if (array[middle] > elementToSearch)
            {
                lastElem = middle - 1;
            }
        }
        return -1;
    }


    //5 * 4 * 3 * 2 * 1
    public static int getFact(int toCalc)
    {
        if(toCalc == 1)
        {
            return 1;
        }
        return toCalc * getFact(toCalc-1);
    }

    public static void main(String[] args) {


        // создание, инициализация, вывод, поиск
        int a [] = new int[14];

        for(int i = 0; i < a.length; i++)
        {
            a[i] = i;
        }

        for (int i = 0; i < a.length; i++)
        {
            System.out.println(a[i]);
        }

        for (int i = 0; i < a.length; i++)
        {
           if(a[i] == 4)
           {
               System.out.println("a[" + i + "] = " + a[i] );
           }
        }






        //Поиск элемента в отсортированном массиве через алгоритм бинарного поиска

        //System.out.println(getFact(6));
        /*
        arr = insertionSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }

        int result = binarySearch(arr, 2);

        if(result != -1)
        {
            System.out.println("Elem was found! Indx " + result);
        }
        else
        {
            System.out.println("Elem was not found!");
        }

         */
    }
}
