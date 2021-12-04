package ru.skypro;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        task1();
        task6();
        task7();
        task8();
        task9();
        // write your code here
    }

    //    Первая задача
    public static void task1() {
        int[] first = new int[3];
        first[0] = 1;
        first[1] = 2;
        first[2] = 3;
        float[] second = {1.57f, 7.654f, 9.986f};
        int[] third = {33, 49, 10_000, -100, 60, -900, 101, 19};
//       Вторая задача
        for (int i = 0; i < first.length; i++) {
            if (i == first.length - 1) {
                System.out.println(first[i]);
            } else {
                System.out.print(first[i] + ", ");
            }
        }
        for (int i = 0; i < second.length; i++) {
            if (i == second.length - 1) {
                System.out.print(second[i]);
            } else {
                System.out.print(second[i] + ", ");
            }
        }
        System.out.println(" ");
        for (int i = 0; i < third.length; i++) {
            if (i == third.length - 1) {
                System.out.println(third[i]);
            } else {
                System.out.print(third[i] + ", ");
            }
        }
//        Третья задача

        for (int i = first.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(first[i]);
            } else {
                System.out.print(first[i] + ", ");
            }
        }
        for (int i = second.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(second[i]);
            } else {
                System.out.print(second[i] + ", ");
            }
        }
        for (int i = third.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(third[i]);
            } else {
                System.out.print(third[i] + ", ");
            }
        }
        System.out.println(" ");

//        Четвертая задача
        for (int i = 0; i < first.length; i++) {
            if (first[i] % 2 != 0) {
                first[i] = first[i] + 1;
            }
            if (i == first.length - 1) {
                System.out.print(first[i]);
            } else {
                System.out.print(first[i] + ", ");
            }
        }

//        Пятая задача (повышенная сложность)
        int[][] matrix = new int[3][3];
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(" ");
            for (int j = 0; j < matrix[i].length; j++) {
                if ((i + j) % 2 == 0) {
                    matrix[i][j] = 1;
                }
                System.out.print(matrix[i][j]);
            }
        }
        System.out.println(" ");
    }

    public static void task6() {
//        Шестая задача (повышенная сложность)
        int[] arr = {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(arr));
        int[] arr1 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = arr[arr.length - 1 - i];
        }
        arr = arr1;
        System.out.println(Arrays.toString(arr));
    }

    public static void task7() {
//        //        Седьмая задача (Повышенная сложность)
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr));
        int arr0 = arr[4];
        arr[4] = arr[0];
        arr[0]=arr0;
        arr0 = arr[3];
        arr[3] = arr[1];
        arr[1]=arr0;
        System.out.println(Arrays.toString(arr));
    }


    public static void task8() {
        int[] arr = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        int a;
        int b;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] + arr[j] == -2) {
                    System.out.println("Эти числа: " + arr[i] + " и "+ arr[j]);
                } break;
            }
        }
    }

    public static void task9() {
        int[] arr = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        int a;
        int b;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] + arr[j] == -2) {
                    System.out.println("Пары чисел, которые в сумме дают 2: " + arr[i] + " и "+ arr[j]);
                }
            }
        }
    }


}

