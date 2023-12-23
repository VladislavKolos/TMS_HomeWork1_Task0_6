package task_0;

import java.util.Locale;
import java.util.Scanner;

public class Task0 {
    public static void main(String[] args) {
        System.out.println("Enter username");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();
        if (userName.equals("")) {
            System.out.println("Error! Please re-enter");
        } else {
            String UpperUserName = userName.substring(0, 1).toUpperCase() + userName.substring(1).toLowerCase(Locale.ROOT).trim();
            System.out.println("Hello " + UpperUserName);

        }

    }
}
