import java.text.Normalizer;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class VowelCounter {

    private String fullName;

    // Constructor
    public VowelCounter(String fullName) {
        this.fullName = normalize(fullName.toLowerCase()); // Normalize and convert to lowercase
    }

    // Method to normalize the string (remove accents)
    private String normalize(String input) {
        return Normalizer.normalize(input, Normalizer.Form.NFD)
                .replaceAll("\\p{M}", "");
    }

    // Method to count vowels and repeated vowels
    public Map<String, Object> countVowels() {
        String vowels = "aeiou";
        Map<Character, Integer> vowelCounts = new HashMap<>();

        int totalVowels = 0;
        for (char c : fullName.toCharArray()) {
            if (vowels.indexOf(c) >= 0) {
                totalVowels++;
                vowelCounts.put(c, vowelCounts.getOrDefault(c, 0) + 1);
            }
        }

        Map<String, Object> result = new HashMap<>();
        result.put("Total vowels", totalVowels);

        Map<Character, Integer> repeatedVowels = new HashMap<>();
        for (Map.Entry<Character, Integer> entry : vowelCounts.entrySet()) {
            if (entry.getValue() > 1) {
                repeatedVowels.put(entry.getKey(), entry.getValue());
            }
        }

        // If no repeated vowels, add a message instead of an empty map

        if (repeatedVowels.isEmpty()) {

            result.put("Repeated vowels", "No repeated vowels");

        } else {

            result.put("Repeated vowels", repeatedVowels);

        }

        result.put("Vowel counts", vowelCounts); // Add all vowel counts to the result

        return result;
    }
/*
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
            System.out.println("Vowel counts: " + result.get("Vowel counts")); // Print all vowel counts
        }

        scanner.close();
    }

    */
}
