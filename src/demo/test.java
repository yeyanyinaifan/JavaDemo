package demo;

import java.util.Scanner;

/**
 * @author irv
 * @date 2021/7/26
 */
public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        if (s.length() == 0) {
            return;
        }
        //System.out.println(s);
        StringBuffer result = new StringBuffer();
        int count = 0;
        char key = s.charAt(0);
        for (int i = 0; i < s.length(); i++) {
            if (key == s.charAt(i)) {
                count++;
            }else{
                result.append(key);
                result.append(count);
                key = s.charAt(i);
                count = 1;
            }

        }
        System.out.println(result);
    }
}
