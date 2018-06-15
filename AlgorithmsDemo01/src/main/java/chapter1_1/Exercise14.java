package main.java.chapter1_1;

/**
 * Java算法第四版练习第一章第一节:第十四题
 * 一个静态方法lg(),接收一个整型参数N，返回不大于log2N的最大整数，不要使用math库
 * 待研究
 *
 * @author :liuqi
 * @date :2018-06-15 17:01.
 */
public class Exercise14 {
    private static int lg(int n) {
        int shiftRightCount = 0;
        do {
            n >>= 1;
            shiftRightCount++;
        } while (n != 0);
        return shiftRightCount - 1;
    }

    public static void main(String[] args) {
        int value = 1025;
        System.out.printf("the result of method log is :%s\r\n", lg(value));
    }
}
