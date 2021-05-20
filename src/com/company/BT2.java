package com.company;

import java.util.Scanner;

public class BT2 {

    static void BT2() {
        int n;  // bậc của ma trận vuông
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào số phần tử của mảng: ");
        n = scanner.nextInt();

        int A[] = new int[n];

        System.out.println("Nhập các phần tử cho mảng: ");
        for (int i = 0; i < n; i++) {
                A[i] = scanner.nextInt();
        }

        System.out.println("Mảng A vừa nhập:");
        for (int j = 0; j < n; j++) {
            System.out.print(A[j] + "\t");
        }
        System.out.println("\n");

        printPrimeNumberForLoop(A , n);
    }

    //Kiểm tra số nguyên tố
    static boolean checkPrimeNumberForLoop(int n) {
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    static void printPrimeNumberForLoop(int A[], int n) {
        int sum = 0;
        System.out.println("Các phần tử là số nguyên tố: ");
        for(int i = 0; i<n ; i++) {
            if (checkPrimeNumberForLoop(A[i])) {
                System.out.println(A[i]);
                sum = sum + A[i];
            }
        }
        System.out.println("Tổng các phần tử là số nguyên tố: " +  sum);
    }

}
