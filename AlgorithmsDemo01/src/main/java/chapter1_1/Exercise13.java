package main.java.chapter1_1;

/**
 * Java算法第四版练习第一章第一节:第十三题
 * 打印一个M行N列的二维数组的转置（交换行和列）
 *
 * @author :liuqi
 * @date :2018-06-15 16:49.
 */
public class Exercise13 {
    public static void printTransposedMatrix(int[][] matrix) {
        for (int i = 0; i < matrix[0].length; i++) {// matrix[0].length=3
            for (int j = 0; j < matrix.length; j++) {// matrix.length=2
                System.out.printf("%4d", matrix[j][i]);// %4d是printf的格式化参数，表示输出一个整型数值，输出宽度为4，且右对齐printf( "%4d", 1 );输出1的前边有3个空格，补齐4位的宽度
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] a = { { 100, 200, 300 }, { 400, 500, 600 } };
        printTransposedMatrix(a);
    }
}
