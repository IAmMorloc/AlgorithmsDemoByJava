package main.java.chapter1_1;

/**
 * Java算法第四版练习第一章第一节:第二十题
 * 使用递归的静态方法计算ln(N!)的值
 *
 * @author :liuqi
 * @date :2018-06-15 17:33.
 */
public class Exercise20 {
    public static double ln(int N) {
        if (N == 0) {
            return 0;
        } else {
            // Java 的Math.log(double a) 函数是以e(2.71828...)为底来计算
            return Math.log(N) + ln(N - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(ln(10));
    }
}
