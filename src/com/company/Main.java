package com.company;

import java.util.Random;

public class Main {


    public static int[] bubbleSort(int[] array) {
        boolean sorted = false;
        int temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    sorted = false;
                }
            }
        }
        return array;
    }

    //                  0  1  2   3   4  5   6   7   8    9
    static int[] arr = {6, 2, 15, 5, 15, 81, 4, 100, 245, 253};


    public static int[] insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int current = array[i]; // 4
            int j = i - 1; // 1
            while (j >= 0 && current < array[j]) {
                array[j + 1] = array[j];
                j--;

            }
            array[j + 1] = current;
        }

        return array;
    }

    // {0,1,12312,0}

    public static int binarySearch(int[] array, int elementToSearch) {
        int firstElem = 0;
        int lastElem = array.length - 1;
        while (firstElem <= lastElem) {
            int middle = (firstElem + lastElem) / 2;
            if (array[middle] == elementToSearch) {
                return middle;
            } else if (array[middle] < elementToSearch) {
                firstElem = middle + 1;
            } else if (array[middle] > elementToSearch) {
                lastElem = middle - 1;
            }
        }
        return -1;
    }

    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int minId = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minId = j;
                }
            }
            // замена
            int temp = array[i];
            array[i] = min;
            array[minId] = temp;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    //5 * 4 * 3 * 2 * 1
    public static int getFact(int toCalc) {
        if (toCalc == 1) {
            return 1;
        }
        return toCalc * getFact(toCalc - 1);
    }

    public static void main(String[] args) {

        int salaries[] = new int[4];

        Random random = new Random();
        int min = 15;
        int max = 1000;
        int createSalary = 0;

        for (int i = 0; i < 4; i++) {
            createSalary = min + random.nextInt(max - min);
            System.out.println(createSalary);
            salaries[i] = createSalary;
        }
        System.out.println("Before: ");
        for (int a = 0; a < salaries.length; a++) {
            System.out.println(salaries[a]);
        }

        int minIndx = getElemIndx(salaries, SORT_ORDER.GET_MIN);
        int maxIndx = getElemIndx(salaries, SORT_ORDER.GET_MAX);


        int temp = salaries[minIndx];
        salaries[minIndx] = salaries[maxIndx];
        salaries[maxIndx] = temp;

        System.out.println("Now: ");
        for (int a = 0; a < salaries.length; a++) {
            System.out.println(salaries[a]);
        }
    }

    enum SORT_ORDER {
        GET_MIN,
        GET_MAX
    }


    /**
     * This function returns min/max array's element id
     *
     * @param array
     * @param sortOder (1 - get min array's, other values - max)
     * @return Array's index depending on input sortOrder
     */
    public static int getElemIndx(int array[], SORT_ORDER sortOder) {
        int requiredIndex = 0;

        for (int i = 0; i < array.length; i++) {
            int elementToSearch = array[0];

            if (sortOder == SORT_ORDER.GET_MIN) {
                if (array[i] < elementToSearch) {
                    elementToSearch = array[i];
                    requiredIndex = i;
                }
            } else if (sortOder == SORT_ORDER.GET_MAX){
                if (array[i] > elementToSearch) {
                    elementToSearch = array[i];
                    requiredIndex = i;
                }
            }
            else {
                System.out.println("Wrong sort order!");
                return -1;
            }
        }

        return requiredIndex;
    }
}
