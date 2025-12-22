import java.util.Arrays;

public class OTPGenerator {
	// Method to generate 6-digit OTP using Math.random()
    public static int generateOTP() {
        return (int)(Math.random() * 900000) + 100000;  // Range: 100000–999999
    }

    // Method to generate 10 OTPs and store in array
    public static int[] generateOTPs(int size) {
        int[] otps = new int[size];

        for (int i = 0; i < size; i++) {
            otps[i] = generateOTP();
        }

        return otps;
    }

    // Method to ensure OTP numbers are unique
    public static boolean areOTPsUnique(int[] otps) {

        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i] == otps[j]) {
                    return false;   // duplicate found
                }
            }
        }

        return true;  // all unique
    }

    public static void main(String[] args) {

        int[] otpArray = generateOTPs(10);

        System.out.println("Generated OTPs: " + Arrays.toString(otpArray));

        if (areOTPsUnique(otpArray)) {
            System.out.println("All OTPs are UNIQUE.");
        } else {
            System.out.println("OTPs are NOT unique (some repeated).");
        }
    }
}
