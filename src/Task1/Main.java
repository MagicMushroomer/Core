package Task1;

/*
 * Farit Zakirov
 * https://stepik.org/cert/1460835
 * Copyright (c) 2022.
 */

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Первый массив с макс, мин, ср.
        int[] first = new int[10];
        //Второй массив
        int[] second = {5,6,3,2,5,1,4,9};
        int temp;
        for (int i = 0; i < second.length; i++) {
            //Второй массив с сортировкой
            for (int j = second.length - 1; j > i; j--) {
                if (second[j-1] > second[j]) {
                    temp = second[j-1];
                    second[j-1] = second[j];
                    second[j] = temp;
                }
            }
        }
        for (int j : second) {
            System.out.print(j + " ");
        }
        System.out.println();
        for (int i = 0; i < first.length; i++) {
            first[i] = (int) (Math.random() * 1000);
            System.out.print(first[i] + " ");
        }
        System.out.println("\n" + Arrays.stream(first).max());
        System.out.println(Arrays.stream(first).min());
        System.out.println(Arrays.stream(first).average());


    }
}