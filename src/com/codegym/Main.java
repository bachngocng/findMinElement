package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;

        do{
            System.out.println("nhập số phần tử của mảng: ");
            size = scanner.nextInt();
            if (size > 5)
                System.out.println("số phần tử không quá 10");
        }
        while (size >5);
        int arr[] = new int[size];
        for (int i = 0; i <size; i++){
            System.out.println("nhập phần tử vị trí thứ " + i + "trong mảng");
            arr[i] = scanner.nextInt();
        }
        int min = minElement(arr);
        System.out.println("Phần tử nhỏ nhất trong mảng là: " +  min);
    }

    public static int minElement(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i])
                min = array[i];
        }
        return min;
    }
}
