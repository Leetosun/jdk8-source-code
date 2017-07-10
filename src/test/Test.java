package test;

/**
 * Created by LeeToSun on 2017/7/10 0010
 */
public class Test {

    @org.junit.Test
    public void testOfString() {
        char[] c = { '我', '就', '是', '爱', '音', '乐' };
        String s = new String(c, 3, 3);
        System.out.println(s);
        System.out.println(-1 >>> 1);
        System.out.println(Integer.toBinaryString(-1 >>> 1));
        System.out.println(Integer.toBinaryString(2147483647));
        System.out.println(Integer.toBinaryString(Integer.MAX_VALUE));
        System.out.println(Integer.toBinaryString(-1));
        System.out.println(Integer.toBinaryString(-1).length());
        System.out.println(Integer.toBinaryString(1));
    }

}
