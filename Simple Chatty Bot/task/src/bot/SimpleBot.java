package bot;

import java.util.Scanner;

public class SimpleBot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello! My name is Aid.");
        System.out.println("I was created in 2018.");
        System.out.println("Please, remind me your name.");

        String name = scanner.nextLine();

        System.out.printf("What a great name you have, %s!\n", name);
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");

        int three = scanner.nextInt();
        int five = scanner.nextInt();
        int seven = scanner.nextInt();
        int age = 0;
        for (int i = 0; i <= 12; i++) {
            age = i * 7 + seven;
            if (age % 3 == three && age % 5 == five) {
                break;
            }
        }

        System.out.printf("Your age is %d; that's a good time to start programming!", age);
    }
}
