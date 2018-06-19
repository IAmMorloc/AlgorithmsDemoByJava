package main.java.chapter1_2;

/**
 * Java算法第四版练习第一章第二节:第七题
 * 输出以下递归程序结果
 *
 * @author :liuqi
 * @date :2018-06-19 10:34.
 */
public class Exercise07 {
    public static String mystery(String s) {
        int N = s.length();
        if (N <= 1) {
            return s;
        }
        String a = s.substring(0, N / 2);
        String b = s.substring(N / 2, N);
        return mystery(b) + mystery(a);
    }

    public static void main(String[] args) {
        System.out.println(mystery("abc"));
    }
}
