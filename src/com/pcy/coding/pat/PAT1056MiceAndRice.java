package com.pcy.coding.pat;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

class Mouse {
    public int weight;
    public int rank;

    public Mouse(int weight, int rank) {
        this.weight = weight;
        this.rank = rank;
    }
}

public class PAT1056MiceAndRice {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int np = scanner.nextInt();
        int ng = scanner.nextInt();

        Mouse[] mice = new Mouse[np];
        for (int i = 0; i < np; i++) {
            mice[i] = new Mouse(scanner.nextInt(), 1);
        }

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < np; i++) {
            queue.offer(scanner.nextInt());
        }

        // 当前轮 老鼠总数temp，组数group
        int temp = np;
        int group;
        while (queue.size() > 1) {


            group = temp % ng == 0 ? temp / ng : temp / ng + 1;

            // 开始遍历每一组
            for (int i = 0; i < group; i++) {
                // 记录最重的
                int k = queue.peek();
                for (int j = 0; j < ng; j++) {
                    if ((i * ng + j) >= temp) {
                        //证明最后一组不足ng只
                        break;
                    }
                    int front = queue.peek();
                    if (mice[front].weight > mice[k].weight) {
                        k = front;
                    }
                    mice[front].rank = group + 1;
                    queue.poll();
                }
                queue.offer(k);
            }
            temp = group;
        }

        mice[queue.peek()].rank = 1;


        StringBuilder builder = new StringBuilder("");
        for (int i = 0; i < np; i++) {
            if (i != np - 1) {
                builder.append(mice[i].rank);
                builder.append(" ");
            } else {
                builder.append(mice[i].rank);
            }
        }

        System.out.println(builder.toString());
    }
}
