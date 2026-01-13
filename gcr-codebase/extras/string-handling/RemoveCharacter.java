import java.util.Scanner;
public class RemoveCharacter {
    public static String removeCharacter(String str, char ch) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ch) {
                result.append(str.charAt(i));
            }
        }

        return result.toString();
    }
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.print("Enter the character to remove: ");
        char ch = sc.next().charAt(0);

        String result = removeCharacter(str, ch);
        System.out.println("Resulting string: " + result);

    }
}
