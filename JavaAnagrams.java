
import java.util.Arrays;
import java.util.Scanner;

public class JavaAnagrams {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String first = scanner.nextLine();
        String second = scanner.nextLine();

        boolean anagram = isAnagram(first, second);
        if (anagram){
            System.out.println("Anagrams");
        }else{
            System.out.println("Not Anagrams");
        }
    }

    static boolean isAnagram(String first, String second) {
        if (first == null || second == null) {
            if (first != null || second != null) {
                return false;
            }
            return true;
        }
        first = first.toLowerCase();
        second = second.toLowerCase();

        char[] fArr = first.toCharArray();
        char[] sArr = second.toCharArray();
        Arrays.sort(fArr);
        Arrays.sort(sArr);

        String fSort = new String(fArr);
        String sSort = new String(sArr);

        return fSort.equals(sSort);
    }

}
