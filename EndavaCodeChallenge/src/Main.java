import java.util.Map;
import java.util.Scanner;

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter names to count vowels (type 'exit' to quit):");

    while (true) {
        System.out.print("Enter full name: ");
        String input = scanner.nextLine();

        if (input.equalsIgnoreCase("exit")) {
            System.out.println("Exiting the program. Goodbye!");
            break;
        }

        VowelCounter vowelCounter = new VowelCounter(input);
        Map<String, Object> result = vowelCounter.countVowels();

        System.out.println("Total vowels: " + result.get("Total vowels"));
        System.out.println("Repeated vowels: " + result.get("Repeated vowels"));
        System.out.println("Vowel counts: " + result.get("Vowel counts"));
    }

    scanner.close();
}