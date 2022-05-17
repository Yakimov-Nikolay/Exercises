import java.util.Scanner;


public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        if (isPalindrome(text)){
            System.out.println("TRUE");
        }else{
            System.out.println("FALSE");
        }
    }

    public static boolean isPalindrome(String text) {
        String clean = text.replaceAll("\\s+", "").toLowerCase();
        int length = clean.length();
        int forward = 0;
        int backward = length - 1;
        while (backward > forward) {
            char forwardChar = clean.charAt(forward++);
            char backwardChar = clean.charAt(backward--);

            if (forwardChar != backwardChar){
                return false;
            }
        }
        return true;
    }
}
