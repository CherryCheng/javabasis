package chapter4.practise.page66;

/**
 * 题目:写一个程序,打印从1到100的值
 *
 * @Author <a href='http://www.cherrycheng.com' target='_blank'>cherrycheng.com</a>
 * Created by ChengRu on 2017-12-04.
 */
public class exercise1 {
    public static void main(String[] args) {
        answer1();
        answer2();
        answer3();
    }

    public static void answer1() {
        System.out.println("----- answer1 -----");
        int i = 1;
        while (i <= 100) {
            System.out.println(i);
            i++;
        }
    }

    public static void answer2() {
        System.out.println("----- answer2 -----");
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= 100);
    }

    public static void answer3() {
        System.out.println("----- answer3 -----");
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }
    }
}
