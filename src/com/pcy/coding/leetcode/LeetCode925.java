package com.pcy.coding.leetcode;

/**
 * 长按键入
 *
 * 注意其中几个边界条件：
 * i < name.length()  ===》 防止匹配完后越界，而且注意要写在所有条件前面
 * j > 0  ===》 防止第一个字符失配，出现 j - 1 ==  -1 的情况
 *
 */
public class LeetCode925 {

    public boolean isLongPressedName(String name, String typed) {
        if (name.isEmpty() || typed.isEmpty()) {
            return false;
        }
        if (name.equals(typed)) {
            return true;
        }


        int i = 0;
        int j = 0;

        while (j < typed.length()) {
            if (i < name.length() && name.charAt(i) == typed.charAt(j)) {
                i++;
                j++;
            } else if (j > 0 && typed.charAt(j) == typed.charAt(j - 1)) {
                j++;
            } else {
                return false;
            }
        }

        return i == name.length();
    }

    public static void main(String[] args) {
        String name = "alex";
        String typed = "aaleex";
        LeetCode925 leetCode925 = new LeetCode925();
        System.out.println(leetCode925.isLongPressedName(name, typed));
    }


}
