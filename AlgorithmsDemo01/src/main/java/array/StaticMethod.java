package main.java.array;

/**
 * 典型静态方法实现
 *
 * @author :liuqi
 * @date :2018-06-15 09:14.
 */
public class StaticMethod {
    /**
     * 计算一个整数的绝对值
     *
     * @param x
     * @return
     */
    public static int getAbsoluteValueByInteger(int x) {
        if (x < 0) {
            return -x;
        }
        return x;
    }

    /**
     * 计算一个浮点数的绝对值
     *
     * @param x
     * @return
     */
    public static double getAbsoluteValueByDouble(double x) {
        if (x < 0.0) {
            return -x;
        }
        return x;
    }

    /**
     * 判断一个数是否是素数
     * 大于1的自然数中，除了1和它本身以外不再有其他因数的数叫质数(>=2)。相反的叫合数，0和1既不是质数也不是合数
     *
     * @param n
     * @return
     */
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * 计算平方根（牛顿迭代法）
     *
     * @param c
     * @return
     */
    public static double sqrt(double c) {
        if (c < 0) {
            //NaN: not a number
            return Double.NaN;
        }
        // 极小值:10的负15次方
        double err = 1e-15;
        double t = c;
        // math.abs(double t)返回t的绝对值
        while (Math.abs(t - c / t) > err * t) {
            t = (c / t + t) / 2.0;
        }
        return t;
    }

    /**
     * 计算直角三角形斜边
     *
     * @param a
     * @param b
     * @return
     */
    public static double hypotenuse(double a,double b){
        return Math.sqrt(a*a + b*b);
    }

    /**
     * 计算调和级数：1+1/2+1/3+...+1/n
     *
     * @param n
     */
    public static double harmonicSeries(int n){
        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0/i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("计算一个整数的绝对值: " + getAbsoluteValueByInteger(-5));
        System.out.println("计算一个浮点数的绝对值: " + getAbsoluteValueByDouble(-6));
        System.out.println("判断一个数是否是素数: " + isPrime(9));
        System.out.println("计算平方根: " + sqrt(9));
        System.out.println("计算直角三角形斜边: " + hypotenuse(3,4));
        System.out.println("计算调和级数: " + harmonicSeries(4));
    }
}
