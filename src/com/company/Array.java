package com.company;
import java.lang.System;
import java.util.*;

public class Array {
    protected int[] array;

    Array() {
        array = new int[0];
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    @Override
    public String toString() {
        System.out.println("Изначальный/нулевой массив");
        System.out.println("Количество элементов массива - " + array.length);
        return "Элементы массива: " + Arrays.toString(array);
    }
}
