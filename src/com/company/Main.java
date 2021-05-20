package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        BT1 bt1 = new BT1();
        BT2 bt2 = new BT2();

        System.out.println("**-----------------------------------------**");

        System.out.println("Nhập số 1 - Bài tập 1: Ma trận vuông");
        System.out.println("Nhập số 2 - Bài tập 2: Phần tử của mảng");

        System.out.println("\nNhập -1 để thoát chương trình");

        int number = -1;
        do {
            System.out.print("\nBạn muốn giải bài tập số: ");
            number = scanner.nextInt();
            if (number != -1) {
                switch (number) {
                    case 1:
                        bt1.BT1();
                        break;
                    case 2:
                        bt2.BT2();
                        break;
                    default:
                        System.out.println("Không có bài tập này. Hãy chọn từ 1 -> 4");
                        System.out.println("Nhập -1 để thoát chương trình");
                        break;
                }
            }
        } while (number >= 0);
    }
}