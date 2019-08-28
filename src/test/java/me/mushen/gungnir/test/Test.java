package me.mushen.gungnir.test;

/**
 * @Desc
 * @Author Mushen
 * @Create 2018-07-06
 */
public class Test {

    public static void main (String[] args) {
        int a = 1;
        int b = 2;
        swap(new Object[]{a, b});

        System.out.println(a);
        System.out.println(b);
    }

    private static void swap(Object[] objects) {
        System.out.println(
                Runtime.getRuntime().availableProcessors()
        );
    }
}
