import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class JavaAnagrams2 {
    public static void main(String[] args) {
        listOfAnagrams(List.of("Бира", "Риба", "кавалер", "акварел", "пешо", "софтуни"));

    }

    public static void listOfAnagrams(List<String> stringList) {
        Set<Set<String>> allAnagrams = new HashSet<>();
        for (String aWords : stringList) {
            boolean found = false;

            for (Set<String> anagrams : allAnagrams) {
                if (anagrams.contains(aWords)) {
                    found = true;
                } else {
                    String randomWord = anagrams.iterator().next();
                    if (areAnagrams(aWords, randomWord)) {
                        anagrams.add(aWords);
                    }

                }
            }

            if (!found) {
                Set<String> newSetOfPossibleAnagrams = new HashSet<>();
                newSetOfPossibleAnagrams.add(aWords);
                allAnagrams.add(newSetOfPossibleAnagrams);

            }
        }
        allAnagrams
                .stream()
                .filter(s -> s.size() > 1)
                .forEach(System.out::println);

    }

    public static boolean areAnagrams(String word1, String word2) {
        if (word1.length() != word2.length() || word1.equalsIgnoreCase(word2)) {
            return false;
        }
        return sortByChar(word1.toLowerCase()).equals(sortByChar(word2.toLowerCase()));
    }

    private static String sortByChar(String word) {
        char[] chars = word.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}
