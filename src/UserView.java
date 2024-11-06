package Part_2;

import java.util.List;
import java.util.Scanner;

public class UserView {
    private Scanner scanner;

    public UserView() {
        scanner = new Scanner(System.in);
    }

    public int showMenuAndGetChoice() {
        System.out.println("1. Add user");
        System.out.println("2. Display users");
        System.out.println("3. Exit");
        System.out.print("Choose an option: ");
        return scanner.nextInt();
    }

    public String getUserInput() {
        System.out.print("Enter user name: ");
        scanner.nextLine(); // Consume newline
        return scanner.nextLine();
    }

    public void displayUsers(List<String> userNames) {
        System.out.println("User List:");
        for (String user : userNames) {
            System.out.println("- " + user);
        }
    }

    public void showMessage(String message) {
        System.out.println(message);
    }

    public void close() {
        scanner.close();
    }
}