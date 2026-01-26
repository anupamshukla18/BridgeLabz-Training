package com.iostreams;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Base64;

public class EncryptDecryptCSV {

    private static final String SECRET_KEY = "1234567890123456"; // 16 chars = AES-128

    public static void main(String[] args) {

        String inputFile = "employees_plain.csv";
        String encryptedFile = "employees_encrypted.csv";

        writeEncryptedCSV(inputFile, encryptedFile);
        readDecryptedCSV(encryptedFile);
    }

    // 🔐 Encrypt sensitive fields & write CSV
    private static void writeEncryptedCSV(String inputFile, String outputFile) {

        try (
                BufferedReader reader = new BufferedReader(new FileReader(inputFile));
                BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))
        ) {

            String line;

            // Write header as-is
            writer.write(reader.readLine());
            writer.newLine();

            while ((line = reader.readLine()) != null) {

                String[] data = line.split(",");

                String encryptedEmail = encrypt(data[2]);
                String encryptedSalary = encrypt(data[3]);

                writer.write(
                        data[0] + "," +
                        data[1] + "," +
                        encryptedEmail + "," +
                        encryptedSalary
                );
                writer.newLine();
            }

            System.out.println("CSV written with encrypted fields.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 🔓 Read CSV & decrypt sensitive fields
    private static void readDecryptedCSV(String encryptedFile) {

        try (BufferedReader reader = new BufferedReader(new FileReader(encryptedFile))) {

            String line;

            // Skip header
            reader.readLine();

            System.out.println("\nDecrypted Records:");
            System.out.println("------------------");

            while ((line = reader.readLine()) != null) {

                String[] data = line.split(",");

                String decryptedEmail = decrypt(data[2]);
                String decryptedSalary = decrypt(data[3]);

                System.out.println(
                        "ID: " + data[0] +
                        ", Name: " + data[1] +
                        ", Email: " + decryptedEmail +
                        ", Salary: " + decryptedSalary
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 🔐 Encrypt method
    private static String encrypt(String value) throws Exception {

        Cipher cipher = Cipher.getInstance("AES");
        SecretKeySpec key = new SecretKeySpec(SECRET_KEY.getBytes(), "AES");
        cipher.init(Cipher.ENCRYPT_MODE, key);

        byte[] encryptedBytes = cipher.doFinal(value.getBytes());
        return Base64.getEncoder().encodeToString(encryptedBytes);
    }

    // 🔓 Decrypt method
    private static String decrypt(String encryptedValue) throws Exception {

        Cipher cipher = Cipher.getInstance("AES");
        SecretKeySpec key = new SecretKeySpec(SECRET_KEY.getBytes(), "AES");
        cipher.init(Cipher.DECRYPT_MODE, key);

        byte[] decodedBytes = Base64.getDecoder().decode(encryptedValue);
        byte[] decryptedBytes = cipher.doFinal(decodedBytes);

        return new String(decryptedBytes);
    }
}
