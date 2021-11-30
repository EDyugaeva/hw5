package ru.skypro;

public class Main {

    public static void main(String[] args) {
        task1();
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
                System.out.print(first[i]);
            } else {
                System.out.print(first[i] + ", ");
            }
        }
        System.out.println(" ");
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
                System.out.print(third[i]);
            } else {
                System.out.print(third[i] + ", ");
            }
        }
        System.out.println(" ");
//        Третья задача

        for (int i = first.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(first[i]);
            } else {
                System.out.print(first[i] + ", ");
            }
        }
        System.out.println(" ");
        for (int i = second.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(second[i]);
            } else {
                System.out.print(second[i] + ", ");
            }
        }
        System.out.println(" ");
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
            if (first[i] % 2 == 1) {
                first[i] = first[i] + 1;
            }
            if (i == first.length - 1) {
                System.out.print(first[i]);
            } else {
                System.out.print(first[i] + ", ");
            }
        }
    }
}
