package com.pcy.coding.leetcode;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode1002 {

    public List<String> commonChars(String[] A) {

        // 初始化一个最小频率的数组
        int[] minFrequency = new int[26];
        Arrays.fill(minFrequency, Integer.MAX_VALUE);

        // 遍历每个字符串并取最小值
        for (String s : A) {
            int[] frequency = new int[26];
            Arrays.fill(frequency, 0);
            for (int i = 0; i < s.length(); i++) {
                frequency[s.charAt(i) - 'a']++;
            }
            for (int i = 0; i < 26; i++) {
                minFrequency[i] = Math.min(minFrequency[i], frequency[i]);
            }
        }

        List<String> result = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < minFrequency[i]; j++) {
                result.add(String.valueOf((char) (i + 'a')));
            }
        }

        return result;
    }
}
