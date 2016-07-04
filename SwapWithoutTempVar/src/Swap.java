/**
 * Created by anatolii on 04.07.16.
 */
public class Swap {
    public static void main(String[] args) throws InterruptedException{
        int one = 40;
        int two = 55;
        swap(one, two);

    }
    public static void swap(int one, int two) throws InterruptedException{
        System.out.println(one + " " + two);
        System.out.println("magic begins!");
        Thread.sleep(1000);
        System.out.println("three...");
        Thread.sleep(2000);
        System.out.println("two...");
        Thread.sleep(1500);
        System.out.println("one...");
        Thread.sleep(500);
        one += two;
        two = one - two;
        one -= two;
        System.out.println(one + " " + two);
    }
}
