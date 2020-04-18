package demo;

import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(10);
        System.out.println("随机数是" + num);
    }
}
