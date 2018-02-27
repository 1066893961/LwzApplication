package application.app.mytest.util;

/**
 * Created by lwz on 2018/1/23.
 */

public class HomeWork {


    public static void main(String args[]) {

        System.out.println("打印100-1000之间所以的水仙花数：");
        for (int ss = 100; ss < 1000; ss++) {
            int j = ss % 10;
            int k = ss / 10 % 10;
            int l = ss / 100 % 10;

            if (ss == (j * j * j) + (k * k * k) + (l * l * l)) {
                System.out.println(ss);
            }

        }

    }
}
