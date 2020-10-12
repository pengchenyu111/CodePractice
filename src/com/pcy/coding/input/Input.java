package com.pcy.coding.input;

import java.util.Arrays;
import java.util.Scanner;

public class Input {

    public static void main(String[] args) {
        //func1();
        //func2();
        func3();

    }

    /**
     * 输入二维数组
     */
    private static void func3() {
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int column = scanner.nextInt();

        System.out.println(row+ "," + column);
        int[][] nums = new int[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                nums[i][j] = scanner.nextInt();
                System.out.println(nums[i][j] + "haha");
            }
        }

        System.out.println(Arrays.deepToString(nums));
        scanner.close();
    }

    /**
     * 数字型：int
     * 未知输入个数
     */
    private static void func2() {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] strs = str.split(" ");
        int[] nums = new int[strs.length];
        for (int i = 0; i < strs.length; i++) {
            nums[i] = Integer.parseInt(strs[i]);
        }
        System.out.println(Arrays.toString(nums));
        scanner.close();
    }

    /**
     * 数字型：int
     * 已知输入个数
     */
    private static void func1() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a);
        System.out.println(b);
        scanner.close();
    }

    /**
     * 3
     * wqwe 2
     * qwe2 2
     * 2131 4
     */
    private static void func4() {
        Scanner sc = new Scanner(System.in);

        int opsCount = sc.nextInt();
        sc.nextLine();
        String[] ops = new String[opsCount];

        for (int i = 0; i < opsCount; i++) {
            ops[i] = sc.nextLine();
        }

        for (int i = 0; i < ops.length; i++) {
            System.out.println(ops[i]);
        }
    }

}
