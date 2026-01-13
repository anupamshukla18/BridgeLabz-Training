import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a number: ");
        long number = input.nextLong();

        // Handle negative number
        if (number < 0) {
            number = -number;
        }

        // ---------- Step 1: Count Digits ----------
        long temp = number;
        int count = 0;

        if (temp == 0) {
            count = 1;
        } else {
            while (temp != 0) {
                temp = temp / 10;
                count++;
            }
        }

        // ---------- Step 2: Store Digits in Array ----------
        int[] digits = new int[count];
        temp = number;
        int index = count - 1;

        if (number == 0) {
            digits[0] = 0;
        } else {
            while (temp != 0) {
                digits[index] = (int)(temp % 10);
                temp = temp / 10;
                index--;
            }
        }

        // ---------- Step 3: Frequency Array ----------
        int[] freq = new int[10];     // index 0–9 → digit frequency

        for (int i = 0; i < count; i++) {
            freq[digits[i]]++;
        }

        // ---------- Step 4: Display Digits ----------
        System.out.print("\nDigits in the number: ");
        for (int i = 0; i < count; i++) {
            System.out.print(digits[i] + " ");
        }

        // ---------- Step 5: Display Frequency ----------
        System.out.println("\n\nFrequency of each digit:");
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                System.out.println("Digit " + i + " occurs " + freq[i] + " time(s)");
            }
        }
    }
}
