package com.pcy.coding.pat;

import com.sun.org.apache.xerces.internal.impl.xs.SchemaNamespaceSupport;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class PAT1103IntegerFactorization {

    public static int n = 400;
    public static int k = 400;
    public static int p = 7;
    public static int maxFacSum = -1;

    public static Vector<Integer> fac = new Vector<>();
    public static Vector<Integer> tmp = new Vector<>();
    public static Vector<Integer> ans = new Vector<>();
    /**
     *
     * @param index 底数
     * @param sumK 底数个数 → k
     * @param sum 加和 → n
     * @param facSum 底数和，用于选优
     */
    public static void DFS(int index, int sumK, int sum, int facSum){

        if(sum == n && sumK == k){
            if (facSum > maxFacSum){
                ans = tmp;
                maxFacSum = facSum;
            }
        }

        if (sum > n || sumK > k){
            return;
        }
        if (index - 1 >= 0){
            tmp.add(index);
            DFS(index, sumK + 1 , sum + fac.get(index), facSum + index);
            tmp.remove(index);
            // 不选
            DFS(index - 1, sumK, sum, facSum);
        }


    }

    public static void init(){
        int num = 0;
        int initNum = 0;
        while (num < n){
            num = (int)Math.pow(initNum, p);
            fac.add(num);
            initNum++;
        }
    }

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        n = scanner.nextInt();
//        k = scanner.nextInt();
//        p = scanner.nextInt();
//
//        init();


        List<Integer> list = new ArrayList<>();
        list.add(-1);
        list.add(1);
        list.add(2);
        boolean contains = list.contains(-1);
        System.out.println(contains);


    }
}
