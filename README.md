# Vowel Counter

## 📖 Description

The **Vowel Counter** program is a Java-based solution designed to count vowels in a given full name. It provides the following features:

1. **Counts the total number of vowels** in the name.
2. **Identifies repeated vowels** and their respective counts.
3. Handles both **uppercase and lowercase characters** (case-insensitive).
4. Considers **vowels with accents** (e.g., `á`, `é`, `í`, `ó`, `ú`) by treating them as their base vowels (`a`, `e`, `i`, `o`, `u`).
5. Provides a **detailed breakdown** of all vowels and their counts.

---

## ✨ Features

- **Interactive Console Input**: Enter names continuously until typing `exit` to quit.
- **Accent Normalization**: Removes accents to ensure accurate counting.
- **Detailed Analysis**: Outputs total vowels, repeated vowels, and a detailed count of all vowels.
- **Reusable Object-Oriented Design**: Implements a class-based structure for extensibility and readability.

---

## 🛠 Requirements

- **Java Version**: Any Java version (Java 8 or higher recommended).

---

## 🚀 How to Use

### Clone the Repository

```bash
git clone https://github.com/your-username/vowel-counter.git
cd vowel-counter
```

### Compile and Run the Program

The program is divided into two files:
1. **`Main.java`**: Contains the main method to interact with the user via console.
2. **`VowelCounter.java`**: Contains the methods and logic for counting vowels.

To compile and run:

1. **Compile both Java files**:
   ```bash
   javac Main.java VowelCounter.java
   ```
2. **Run the program**:
   ```bash
   java Main
   ```

---

### Example Usage

1. **Start the program**:
   ```
   Enter names to count vowels (type 'exit' to quit):
   ```
2. **Enter a name**:
   ```
   Enter full name: Carolina Mello
   Total vowels: 6
   Repeated vowels: {a=2, o=2}
   Vowel counts: {a=2, e=1, i=1, o=2}
   ```
3. **Type `exit` to quit**:
   ```
   Enter full name: exit
   Exiting the program. Goodbye!
   ```

---

## 📂 Code Overview

### **Class: `VowelCounter`**

#### 🏷 Attributes

- **`fullName`**: Stores the normalized version of the user's full name (lowercase, no accents).

#### 🔧 Methods

1. **`VowelCounter(String fullName)`**:
   - Constructor that initializes the `fullName` attribute after normalization.
2. **`normalize(String input)`**:
   - Removes accents from characters in the string using `Normalizer`.
3. **`countVowels()`**:
   - Counts the total vowels, identifies repeated vowels, and provides a detailed breakdown of all vowels found.
   - Returns a `Map<String, Object>` containing:
     - `"Total vowels"`: Total number of vowels.
     - `"Repeated vowels"`: Map of vowels with counts > 1.
     - `"Vowel counts"`: Detailed count of all vowels.

### **Class: `Main`**

1. **Uses `Scanner`** to accept user input.
2. **Continuously prompts** for names and processes them until `exit` is typed.
3. **Displays results** in a user-friendly format.

---

## ⚙ Customization

- To add additional functionality (e.g., support for consonants or special characters), extend the `normalize` method and adjust the vowel logic in `countVowels`.

---

## 🤝 Contribution

Contributions are welcome! Feel free to open issues or submit pull requests.

### Steps to Contribute

1. **Fork the repository**.
2. **Create a new branch** for your feature or bug fix.
3. **Submit a pull request** with detailed information on your changes.

