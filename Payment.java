import java.io.*;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.*;

public class Payment {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double currency = scanner.nextDouble();
        scanner.close();

        Locale indiaLocale = new Locale("en", "IN");

        DecimalFormat formatter = new DecimalFormat("###,###.00");

        String us = NumberFormat.getCurrencyInstance().format(currency);
        String india = "Rs." + formatter.format(currency);
        String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(currency);
        String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(currency);


        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);

    }
}
