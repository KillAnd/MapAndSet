import java.util.*;

public class Main {

    private static final List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
    private static final List<String> words = new ArrayList<>(List.of("Один", "Два", "Два", "Три","Три","Три"));



    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();

    }

    public static void task1() {
        for (Integer i : nums) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    public static void task2() {
        Set<Integer> nums1 = new HashSet<>(nums);
        Collections.sort(nums);
        for (Integer i : nums1) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void task3() {
        Set<String> doubleWords = new HashSet<>(words);
        System.out.println(doubleWords);
    }

    public static void task4() {
        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                wordCount.put(word, 1);
            }
        }
        System.out.println(wordCount.values());
    }
}