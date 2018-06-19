package main.java.chapter1_2;

/**
 * Java算法第四版练习第一章第二节:第六题
 * 回环变位：ACTGACG就是TGACGAC的一个回环变位,编写程序检查两个给定的字符串s和t是否互为回环变位
 *
 * @author :liuqi
 * @date :2018-06-19 10:06.
 */
public class Exercise06 {
    public static void main(String[] args) {
        String s = "ACTGACG";
        String t = "TGACGAC";
        if (s.length() == t.length() && s.concat(s).indexOf(t) >= 0) {
            System.out.println(s + " is the circular rotation of " + t);
        } else {
            System.out.println(s + " is not the circular rotation of " + t);
        }
    }
}
