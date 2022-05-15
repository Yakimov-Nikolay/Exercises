import java.io.*;
import java.util.*;

public class JavaIntToString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        String s = Integer.toString(num);

        if(num == Integer.parseInt(s)){
            System.out.println("Good job");
        }else {
            System.out.println("Wrong answer");
        }
    }
}

