package user_exception.exception;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please insert Your User name, Password and copy of Password.");
        String userName = s.nextLine();
        String userPass = s.nextLine();
        String userPassCopy = s.nextLine();
        try {
            NewUser MyUser = new NewUser(userName, userPass, userPassCopy);
        } catch (ShortException | LongException | PasswordMismatchException e) {
            System.out.println(e.getMessage());;
        }

    }
}
