package com.stack;

/**
 * 给定一个非负整数数组，a1, a2, ..., an, 和一个目标数，S。现在你有两个符号 + 和 -。对于数组中的任意一个整数，你都可以从 + 或 -中选择一个符号添加在前面。
 *
 * 返回可以使最终数组和为目标数 S 的所有添加符号的方法数。
 */

/**
 * DFS递归做法
 */
public class FindTargetSumWays {

    public int findTargetSumWays(int[] nums, int S) {
        return findTargetSumHelper(nums, S, 0);

    }
    private int findTargetSumHelper(int[] nums, int S, int index)
    {
        if(nums.length == index)
            return S == 0 ? 1 : 0;
        return findTargetSumHelper(nums,S + nums[index],index + 1)
                +findTargetSumHelper(nums, S - nums[index], index + 1);
    }

    /**
     * 动态规划做法
     * @param nums
     * @param target
     * @return
     */
    public int findTargetSumWaysDP(int[] nums, int target) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        if(sum < target || (sum+target)%2 == 1){
            return 0;
        }
        target = (target + sum) / 2;
        int[] dp = new int[target + 1];
        dp[0] = 1;
        for (int num : nums) {
            for (int i = target; i >= num; i--) {
                dp[i] += dp[i - num];

            }
        }
        return dp[target];
    }

}
