import java.util.Scanner;

public class Parallelogram {
    static int B;
    static int H;
    static boolean flag = false;

    static {
        Scanner scanner = new Scanner(System.in);
        B = scanner.nextInt();
        H = scanner.nextInt();

        if (B <= 0 || H <=0){
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }else {
            flag = true;
        }
    }
    public static void main(String[] args) {

        if (flag) {
            int area = B * H;
            System.out.print(area);
        }

    }//end of main

}//end of class
