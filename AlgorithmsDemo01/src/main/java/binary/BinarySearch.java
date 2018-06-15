package main.java.binary;

import java.util.Arrays;

/**
 * 二分查找相关方法
 *
 * @author :liuqi
 * @date :2018-06-15 13:40.
 */
public class BinarySearch {
    /**
     * 递归方式实现二分查找
     *
     * @param key
     * @param a
     * @return
     */
    public static int rank(int key, int[] a) {
        return rank(key, a, 0, a.length - 1);
    }

    /**
     * 递归方式实现二分查找
     *
     * @param key              要找的数
     * @param a
     * @param lo:查找范围的第一个数的索引
     * @param hi:查找范围的最后一个数的索引
     * @return mid:中间的也就是要找的数的索引
     */
    public static int rank(int key, int[] a, int lo, int hi) {
        // 如果key存在于a[]中，他的索引不会小于lo且不会大于hi
        if (lo > hi) {
            return -1;
        }
        int mid = lo + (hi - lo) / 2;
        if (key < a[mid]) {
            return rank(key, a, lo, mid - 1);
        } else if (key > a[mid]) {
            return rank(key, a, mid + 1, hi);
        } else {
            return mid;
        }
    }

    public static void main(String[] args) {
        int[] whiteList = new int[]{13, 12, 44, 34, 33};
        // 二分查找数组必须有序
        Arrays.sort(whiteList);
        int mid = rank(34, whiteList);
        if (mid < 0) {
            System.out.println("不存在");
        } else {
            System.out.println("存在，位置为： " + mid);
        }
    }
}
