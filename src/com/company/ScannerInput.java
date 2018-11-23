package com.company;
import java.lang.System;
import java.util.*;

public class ScannerInput extends Array{

    public void inputByScanner() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество элементов массива");
        int num = sc.nextInt();
        array = new int[num];
        System.out.println("Введите " + num + " элементов массива");
        for (int i = 0; i < array.length; i++)
        {
            array[i] = sc.nextInt();
        }
    }

    @Override
    public String toString() {
        System.out.println("Массив, введенный пользователем");
        System.out.println("Количество элементов массива - " + array.length);
        return "Элементы массива: " + Arrays.toString(array);
    }
}
