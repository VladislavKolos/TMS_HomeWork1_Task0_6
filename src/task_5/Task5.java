package task_5;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter q and w");
        int q = scanner.nextInt();
        int w = scanner.nextInt();
        int result1 = q / w;
        int result2 = q % w;
        System.out.println("Result = " + result1 + " ost " + result2);
    }
}
