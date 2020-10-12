package com.pcy.coding.leetcode;


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}


/**
 * 输入：
 *
 * 1
 * \
 * 3
 * /
 * 2
 *
 * 输出：
 * 1
 *
 * 解释：
 * 最小绝对差为 1，其中 2 和 1 的差的绝对值为 1（或者 2 和 3）。
 */
public class LeetCode530 {
    // 前一个结点的值
    int pre = -1;
    // 用来保存差值
    int ans = Integer.MAX_VALUE;

    public int getMinimumDifference(TreeNode root) {

        dfs(root);
        return ans;

    }

    void dfs(TreeNode root) {
        if (root == null) {
            return;
        }
        // 左
        dfs(root.left);

        if (pre == -1) {
            pre = root.val;
        } else {
            ans = Math.min(ans, root.val - pre);
            pre = root.val;
        }

        // 右
        dfs(root.right);
    }
}
