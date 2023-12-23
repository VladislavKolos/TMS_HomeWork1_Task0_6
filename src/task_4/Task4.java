package task_4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n");
        double n = scanner.nextDouble();
        double ost = n % 1;
        if (ost == 0) {
            System.out.println("Enter real number");
        } else {
            int result = (int) Math.round(n);
            System.out.println("Result = " + result);
        }
    }
}
