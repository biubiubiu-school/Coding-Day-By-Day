# 问题1 https://leetcode-cn.com/problems/two-sum/
"""给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。"""

nu = [2, 7, 1, 15, 9, 8]
ta = 9
def sum_two(nums, target):
    x = len(nums)
    for i in range(x):
        for j in range(i + 1, x):
            if (nums[i] + nums[j] == target):
                print(nums[i], "+", nums[j], "=", target, "角标分别为：", i, j)
sum_two(nu, ta)
