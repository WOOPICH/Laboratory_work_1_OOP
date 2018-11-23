package com.company;
import java.lang.System;
import java.util.*;

public class RandomInput extends Array{

    public void inputByRandom() {
        Random random = new Random();
        int num = random.nextInt(10) + 1;
        array = new int[num];
        for (int i = 0; i < array.length; i++)
        {
            array[i] = random.nextInt(10) + 1;
        }
    }

    @Override
    public String toString() {
        System.out.println("Массив, созданный классом Random");
        System.out.println("Количество элементов массива - " + array.length);
        return "Элементы массива: " + Arrays.toString(array);
    }
}
