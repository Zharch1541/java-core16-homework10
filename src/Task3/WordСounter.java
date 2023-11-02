package Task3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class WordСounter {
    public static void main(String[] args) throws IOException {
        File file = new File("src/Task3/words.txt");
        FileReader fileReader = new FileReader(file);

        Scanner scanner = new Scanner(fileReader);
        Map<String, Integer> wordCounter = new HashMap<>();

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] words = line.split("\\s+");

            for (String word: words) {
               if (wordCounter.containsKey(word)) {
                   wordCounter.put(word, wordCounter.get(word) + 1);
               } else wordCounter.put(word, 1);
            }
        }
        scanner.close();
        fileReader.close();

        List<Map.Entry<String, Integer>> sortedlist = wordCounter.entrySet()
                .stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .toList();

        for (Map.Entry<String, Integer> entry: sortedlist) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
