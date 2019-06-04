package andrew.solution;

/**
 * @author Andrew Tse
 * @date 2019-06-04
 */
public class MergeSortArray {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int m = 3;
        int n = 3;
        merge(nums1, m, nums2, n);
        for (int value : nums1) {
            System.out.println(value);
        }
    }

    /**
     * 合并两个有序数组
     * 思路：从尾部开始归并排序
     *
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     */
    private static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m + n - 1;
        int p1 = m - 1;
        int p2 = n - 1;

        while (p1 >= 0 && p2 >= 0) {
            nums1[i--] = nums1[p1] > nums2[p2] ? nums1[p1--] : nums2[p2--];
        }

        while (p2 >= 0) {
            nums1[i--] = nums2[p2--];
        }
    }
}
