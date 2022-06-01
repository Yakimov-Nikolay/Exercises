import java.util.Scanner;

public class JavaStringReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String revers = new StringBuilder(input).reverse().toString();
        if (input.equals(revers)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
