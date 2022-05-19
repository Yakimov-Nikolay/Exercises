
import java.util.Scanner;

 class ValidatorUsername {
         public static final String regularExpression = "^[a-zA-Z]\\w{7,29}$";
}

public class ValidUsernameRegularExpression {

    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scanner.nextLine());

        while (n-- != 0){
            String username = scanner.nextLine();

            if (username.matches(ValidatorUsername.regularExpression)){
                System.out.println("Valid");
            }else{
                System.out.println("Invalid");
            }
        }


    }
}
