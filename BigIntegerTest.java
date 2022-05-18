import java.io.PrintStream;
import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegerTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        BigInteger a = new BigInteger(scanner.next());
        BigInteger b = new BigInteger(scanner.next());

        BigInteger plus = a.add(b);
        BigInteger multi = a.multiply(b);

        System.out.println(plus);
        System.out.println(multi);
    }

}

