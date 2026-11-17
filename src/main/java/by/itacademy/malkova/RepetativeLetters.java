package by.itacademy.malkova;

import java.util.Scanner;

public class RepetativeLetters {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter some text: ");
        String testedString = scanner.nextLine();
        System.out.println("Enter the letter: ");
        char findLetter = scanner.next().charAt(0);

        int count = 0;
        testedString = testedString.toLowerCase();
        testedString = testedString.replace(" ", "");

        for (int i = 0; i < testedString.length(); i++) {
            if (findLetter == testedString.charAt(i)) {
                count++;
            }
        }
        System.out.println("Letter '" + findLetter + "' repeats " + count + " times");
    }
}
