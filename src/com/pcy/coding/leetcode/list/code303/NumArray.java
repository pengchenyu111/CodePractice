package com.pcy.coding.leetcode.list.code303;

class NumArray {

    // 定义一个前缀和数组
    private int[] preNum;

    public NumArray(int[] nums) {
        // 注意preNum要比nums的长度多1
        // 直接new会初始化为全0
        preNum = new int[nums.length + 1];
        // 从index 1 开始赋值
        for (int i = 1; i < preNum.length; i++) {
            preNum[i] = preNum[i - 1] + nums[i - 1];
        }
    }

    public int sumRange(int left, int right) {
        return preNum[right + 1] - preNum[left];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */