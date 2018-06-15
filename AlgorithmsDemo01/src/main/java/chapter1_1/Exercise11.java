package main.java.chapter1_1;

/**
 * Java算法第四版练习第一章第一节:第十一题
 * 打印一个二维数组的内容，其中使用*表示真，空格表示假，打印出行号和列号
 *
 * @author :liuqi
 * @date :2018-06-15 16:40.
 */
public class Exercise11 {
    public static void printBooleanMatrix(boolean[][] matrix) {
        // 列号
        System.out.print("列号");
        for (int i = 0; i < matrix[0].length; i++) {
            System.out.print(i+"列");
        }
        System.out.println();
        for (int i = 0; i < matrix.length; i++) {
            // 行号
            System.out.print(i+"行");
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] ? '*' : ' ');
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        boolean[][] a = { { true, false, true }, { false, true, false },
                { true, true, false } };
        printBooleanMatrix(a);
    }
}
