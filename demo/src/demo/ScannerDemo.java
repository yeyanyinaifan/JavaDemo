package demo;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入int数字");
        int number = scanner.nextInt();
        System.out.println("输入的int数字是" + number);
        System.out.println("请输入字符串");
        String str = scanner.next();
        System.out.println("输入的字符串是" + str);
    }
}
