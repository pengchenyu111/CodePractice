package com.pcy.coding.pat;

import java.util.Scanner;
import java.util.Stack;
import java.util.Vector;

/**
 * 未完成
 * 有些bug
 */
public class PAT1051PopSequence {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        Vector<String> ans = new Vector<>();
        Stack<Integer> stack = new Stack<>();
        int[] arr = new int[1001];

        for (int i = 0; i < k; i++) {
            while (!stack.empty()){
                stack.pop();
            }
            for (int j = 1; j <= n; j++) {
                arr[j] = scanner.nextInt();
            }

            boolean flag = true;
            int current = 1;

            for (int p = 0; p < n; p++) {
                while (!stack.empty()) {
                    stack.pop();
                }

                for (int q = 1; q <= n; q++) {
                    if (stack.size() > m) {
                        flag = false;
                        break;
                    }
                    stack.push(q);

                    while (!stack.empty() && stack.peek() == arr[current] ) {
                        stack.pop();
                        current++;
                    }
                }

            }
            if (stack.empty() && flag) {
                ans.add("YES");
            } else {
                ans.add("NO");
            }

        }

        for (int i = 0; i < k; i++) {
            System.out.println(ans.get(i));
        }

    }
}
