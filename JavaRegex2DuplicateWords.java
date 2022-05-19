import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaRegex2DuplicateWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String pattern = "\\b(\\w+)(?:\\W+\\1\\b)+";
        Pattern pat = Pattern.compile(pattern, Pattern.CASE_INSENSITIVE);

        int n = Integer.parseInt(scanner.nextLine());
        while (n > 0){
            String input = scanner.nextLine();
            Matcher matcher = pat.matcher(input);

            while (matcher.find()){
                input = input.replaceAll(matcher.group(), matcher.group(1));
            }
            System.out.println(input);
            n--;
        }
    }
}
