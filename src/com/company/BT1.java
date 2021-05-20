package com.company;

import java.util.Scanner;

public class BT1 {

    static void BT1() {
        int n;  // bậc của ma trận vuông
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào bậc của ma trận: ");
        n = scanner.nextInt();

        int A[][] = new int[n][n];

        System.out.println("Nhập các phần tử cho ma trận: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("A[" + i + "]["+ j + "] = ");
                A[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Ma trận A vừa nhập:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(A[i][j] + "\t");
            }
            System.out.println("\n");
        }

        // các phần tử nằm trên đường chéo chính
        // là các phần tử có chỉ số dòng = chỉ số cột

        int count = 0;
        System.out.println("Các phần tử nằm trên đường chéo chính là : ");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    System.out.println(A[i][j]);
                    count = count + A[i][j];
                }
            }
        }

        System.out.println("Tổng các phần tử nằm trên đường chéo chính = " + count);
        System.out.println("\n");

//        Sắp xếp hàng thứ 2 của ma trận theo chiều tăng dần
        int temp;
        for (int m = 0 ; m < n - 1; m++) {
            for (int k = m + 1; k < n; k++) {
                if (A[1][m] > A[1][k]) {
                    temp = A[1][m];
                    A[1][m] = A[1][k];
                    A[1][k] = temp;
                }
            }
        }

        System.out.println("Ma trận A sau khi sắp xếp hàng thứ 2 theo chiều tăng dần là :");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(A[i][j] + "\t");
            }
            System.out.println("\n");
        }

    }
}
