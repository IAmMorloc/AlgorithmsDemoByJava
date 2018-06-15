package main.java.chapter1_1;

/**
 * Java算法第四版练习第一章第一节:第九题
 * 将一个正整数N用二进制标识并转换为一个string类型的值s
 * java有一个内置方法Integer.toBinaryString(N),下面是使用其他方法实现
 *
 * @author :liuqi
 * @date :2018-06-15 15:34.
 */
public class Exercise09 {
    /**
     * 利用“移位”操作实现
     * 将最高位的数移至最低位（移31位），除过最低位其余位置清零，使用& 操作，
     * 可以使用和1相与（&），由于1在内存中除过最低位是1，其余31位都是零，然后把这个数按十进制输出；
     * 再移次高位，做相同的操作，直到最后一位 ，代码如下
     *
     * @param n
     */
    public static void binaryToDecimal(int n) {
        for (int i = 31; i >= 0; i--) {
            System.out.println(n >>> i & 1);
        }
    }

    /**
     * 以二进制（基数 2）无符号整数形式返回一个整数参数的字符串表示形式。
     *
     * @param N
     * @return
     */
    public static String toBinaryString(int N){
        String s="";
        for(int n=N;n>0;n/=2){
            s=(n%2)+s;
        }
        return s;
    }

    /**
     * 测试
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("十进制转二进制：" + toBinaryString(5));
    }
}
