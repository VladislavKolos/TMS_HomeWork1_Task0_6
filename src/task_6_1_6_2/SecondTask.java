package task_6_1_6_2;

import java.util.Scanner;

public class SecondTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a and b");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        a += b;
        b = a - b;
        a -= b;
        System.out.println(a);
        System.out.println(b);
    }
}
