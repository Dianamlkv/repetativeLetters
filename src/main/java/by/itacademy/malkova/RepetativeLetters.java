package by.itacademy.malkova;

import java.util.Scanner;

public class RepetativeLetters {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter some text: ");
        String text = scanner.nextLine();
        System.out.println("Enter the letter: ");
        char letter = scanner.next().charAt(0);

        int count = 0;
        text = text.toLowerCase();
        text = text.replace(" ", "");

        for (int i = 0; i < text.length(); i++) {
            if (letter == text.charAt(i)) {
                count++;
            }
        }
        System.out.println("Letter '" + letter + "' repeats " + count + " times");
    }
}
