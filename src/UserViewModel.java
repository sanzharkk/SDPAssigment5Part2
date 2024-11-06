package Part_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserViewModel {
    private List<UserModel> users;
    private Scanner scanner;

    public UserViewModel() {
        users = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void addUser(String name) {
        users.add(new UserModel(name));
    }

    public List<String> getUserNames() {
        List<String> userNames = new ArrayList<>();
        for (UserModel user : users) {
            userNames.add(user.getName());
        }
        return userNames;
    }

    public void run() {
        while (true) {
            int option = showMenuAndGetChoice();
            switch (option) {
                case 1:
                    String name = getUserInput();
                    addUser(name);
                    showMessage("User added!");
                    break;
                case 2:
                    displayUsers(getUserNames());
                    break;
                case 3:
                    showMessage("Exiting...");
                    close();
                    return;
                default:
                    showMessage("Invalid option. Please try again.");
                    break;
            }
        }
    }

    private int showMenuAndGetChoice() {
        System.out.println("1. Add user");
        System.out.println("2. Display users");
        System.out.println("3. Exit");
        System.out.print("Choose an option: ");
        return scanner.nextInt();
    }

    private String getUserInput() {
        System.out.print("Enter user name: ");
        scanner.nextLine(); // Consume newline
        return scanner.nextLine();
    }

    private void displayUsers(List<String> userNames) {
        System.out.println("User List:");
        for (String user : userNames) {
            System.out.println("- " + user);
        }
    }

    private void showMessage(String message) {
        System.out.println(message);
    }

    private void close() {
        scanner.close();
    }
}