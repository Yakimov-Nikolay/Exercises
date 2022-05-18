import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class PatternSyntaxChecker {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int forTest = Integer.parseInt(scanner.nextLine());
        while (forTest > 0) {
            String pattern = scanner.nextLine();
            try {
                Pattern.compile(pattern);
                System.out.println("Valid");
            } catch (PatternSyntaxException p) {
                System.out.println("Invalid");
            }
            forTest--;
        }
    }
}
