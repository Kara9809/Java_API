package homework_22_11_2023;

import java.util.Objects;
import java.util.Scanner;

public class Ex_Menu {
    //        Console Menu with 3 option for your choice
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isMenuRunning = true;
        while (isMenuRunning) {
            System.out.println("\tI know all about You!\n\n\tPlease choose a question that You interested in: \n");
            System.out.println("1. How many years will I live?\n");
            System.out.println("2. What is my name?\n");
            System.out.println("3. To exit without answers\n");

            System.out.println("Please insert your choice from the menu: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1: {
                    int age = (int) (Math.random() * 20) + 100;
                    System.out.println("You will leave " + age + " years of happiness!\n");
                    break;
                }
                case 2: {
                    Scanner scanner1 = new Scanner(System.in);
                    System.out.println("Please insert first letter of Your name");
                    String firstLetter = scanner1.nextLine();
                    if (Objects.equals(firstLetter, "s")) {
                        System.out.println("Your name is Shaked!");
                    } else if (Objects.equals(firstLetter, "S")) {
                        System.out.println("Your name is Shaked!");
                    } else {
                        System.out.println("Your name is Karina!");
                    }
                    break;
                }
                case 3: {
                    System.out.println("Exit Menu");
                    isMenuRunning = false;
                    break;
                }
            }
        }


//      Create 2 Thread first thread is jumping and second thread is clapping (10 claps and 10 jumps)
//         I want you to synchronize between them aka jump, clap, jump, clap...

    }
}
