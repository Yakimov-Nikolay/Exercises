import java.util.Scanner;

public class JavaSubstringComparisons {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int n = scanner.nextInt();

        String minSubstring = input.substring(0, n);
        String maxSubstring = input.substring(0, n);

        for (int i = 1; i < input.length()-n+1; i++) {
            String currentSub = input.substring(i, i+n);

            if (currentSub.compareTo(minSubstring) < 0){
                minSubstring = currentSub;
            }

            if (currentSub.compareTo(maxSubstring) > 0){
                maxSubstring = currentSub;
            }
        }
        System.out.println(minSubstring);
        System.out.println(maxSubstring);
    }
}
