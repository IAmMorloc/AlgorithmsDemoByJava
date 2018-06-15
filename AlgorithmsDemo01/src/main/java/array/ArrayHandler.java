package main.java.array;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * 数组处理代码
 *
 * @author :liuqi
 * @date :2018-06-14 17:04.
 */
public class ArrayHandler {
    /**
     * 获取数组中最大的元素
     *
     * @param array
     * @return
     */
    private static double getMaxinum(double[] array) {
        double max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    /**
     * 获取数组中元素的平均值
     *
     * @param array
     * @return
     */
    private static double getAverage(double[] array) {
        int length = array.length;
        double sum = 0.0;
        for (int i = 0; i < length; i++) {
            sum += array[i];// sum = sum + array[i]
        }
        double average = sum / length;
        return average;
    }

    /**
     * 复制数组
     *
     * @param array
     * @return
     */
    private static double[] getCopyArray(double[] array) {
        int length = array.length;
        double[] bArray = new double[length];
        for (int i = 0; i < length; i++) {
            bArray[i] = array[i];
        }
        return bArray;
    }

    /**
     * 颠倒数组元素的顺序
     *
     * @param array
     * @return
     */
    private static String putUpsideDown(double[] array) {
        int length = array.length;
        // 对半交换
        for (int i = 0; i < length / 2; i++) {
            double temp = array[i];
            array[i] = array[length - 1 - i];
            array[length - i - 1] = temp;
        }
        return Arrays.toString(array);
    }

    /**
     * 矩阵相乘
     *
     * @param array1
     * @param array2
     * @return
     */
    private static double[][] matrixMultiply(double[][] array1, double[][] array2) {
        int length = array1.length;
        double[][] array3 = new double[length][length];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                // 计算行i和列j的点乘
                for (int k = 0; k < length; k++) {
                    array3[i][j] += array1[i][k] * array2[k][j];
                }
            }
        }
        return array3;
    }

    /**
     * 测试
     *
     * @param args
     */
    public static void main(String[] args) {
        // 声明一个数组的三种方式
        double[] array1 = new double[5];
        double[] array2 = new double[]{1.0, 2.0, 5.0, 3.0, 6.0};
        double[] array3 = {1.0, 2.0, 5.0, 3.0, 6.0};
        System.out.println("获取数组中最大的元素:" + getMaxinum(array3));
        System.out.println("获取数组中元素的平均值:" + getAverage(array3));
        System.out.println("复制数组方法: " + "原数组中元素为：" + Arrays.toString(array3) + " 新数组中元素为: " + Arrays.toString(getCopyArray(array3)));
        System.out.println("颠倒数组元素的顺序:" + putUpsideDown(array3));
        // 定义二维数组
        /*double[][] array4 = {{3.0, 2.0, 4.0}, {1.0, 5.0, 6.0}};
        double[][] array5 = {{1.0, 5.0, 6.0}, {3.0, 2.0, 4.0}};
        System.out.println("矩阵相乘:打印二维数组 ");
        double[][] array6 = matrixMultiply(array4, array5);
        for (int i = 0, j = 0; i < array6.length; ) {
            System.out.println(array6[i][j]);
            j++;
            if (j >= array6[i].length){
                i++;
                j = 0;
            }
        }*/

    }
}
