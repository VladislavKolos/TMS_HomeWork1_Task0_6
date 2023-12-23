package task_2_3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n ");
        int n = scanner.nextInt();
        int d = n / 10;
        int o = n % 10;
        int d2 = d / 10;
        int o2 = d % 10;
        int sum = o + d2 + o2;
        System.out.println("Sum = " + sum);


    }
}
