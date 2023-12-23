package task_2_3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n ");
        int n = scanner.nextInt();
        int d = n / 10;
        int o = n % 10;
        int sum = d + o;
        System.out.println("Sum = " + sum);
    }
}
