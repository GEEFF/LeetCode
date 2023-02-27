package com.ychen.leetcode.commom._0001_0100;

import jdk.internal.vm.annotation.ForceInline;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ChenY@itheima.com
 * @date 2023/2/27 23:31
 */
public class TwoSum {
    public static void main(String[] args) {
        Solution solution = new TwoSum().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            //  定义一个hashtable 因为数组中同一个元素在答案里不能重复出现
            Map<Integer,Integer> hashtable = new HashMap<Integer, Integer>();
            // 对数组进行遍历
            for (int i = 0; i < nums.length; i++) {
                // 如果 数组中包含要寻址到的目的值
                if (hashtable.containsKey(target - nums[i])){
                    return new int[]{hashtable.get(target - nums[i]),i};
                }
                hashtable.put(nums[i],i);
            }
            // 找不到 就返回 数组中的第一个元素
            return new int[0];
        }
    }
}
