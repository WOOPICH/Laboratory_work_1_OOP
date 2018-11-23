package com.company;
import java.lang.System;
import java.util.*;

public class MathRandInput extends Array{

    public void inputByMathRand(){
        int num = (int)(Math.random() * 10);
        array = new int[num];
        for (int i = 0; i < array.length; i++)
        {
            array[i] = (int)(Math.random() * 10);
        }
    }

    @Override
    public String toString() {
        System.out.println("Массив, созданный методом Math.random()");
        System.out.println("Количество элементов массива - " + array.length);
        return "Элементы массива: " + Arrays.toString(array);
    }
}
