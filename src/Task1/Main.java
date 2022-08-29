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
        int[][] first = new int[10][10];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        double sum = 0;
        System.out.println();
        for (int i = 0; i < first.length; i++) {
            if (i >= first.length) {
                throw new ArrayIndexOutOfBoundsException("Вышли за пределы индекса массива: i=" + i);
            }
            for (int j = 0; j < first.length; j++) {
                if (j >= first.length) {
                    throw new ArrayIndexOutOfBoundsException("Вышли за пределы индекса массива: j=" + j);
                }
                first[i][j] = (int) (Math.random() * 100);
                System.out.print(first[i][j] + " ");

                if (min > first[i][j]) {
                    min = first[i][j];
                }

                if (max < first[i][j]) {
                    max = first[i][j];
                }
                sum += first[i][j];
            }
            System.out.println();
        }
        System.out.println("\nMin: " + min + "\nMax: " + max + "\nAvg: " + sum/ (first.length* first.length));
    }
}