import java.io.*;
import java.util.Objects;

import static java.util.stream.Collectors.joining;

class Result {

    public static class Solution {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            String message = bufferedReader.readLine();

            String result = Result.compressedString(message);

            bufferedWriter.write(result);
            bufferedWriter.newLine();

            bufferedReader.close();
            bufferedWriter.close();
        }

    }

    private static String compressedString(String message) {
        int length = message.length();
        String current = "";
        String next = "";
        int counter = 0;
        String result = "";
        for (int i = 0; i < length; i++) {
            current = String.valueOf(current.charAt(i));
            next = String.valueOf(current.charAt(i + 1));
            if (current.equals(next)) {
                counter++;
                result += current;
            }
            if (!current.equals(next)) {
                result += current;
            }

        }

        return result;
    }

}
