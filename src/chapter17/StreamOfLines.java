package chapter17;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class StreamOfLines {
    public static void main(String[] args) throws IOException {
        Pattern pattern = Pattern.compile("\\s+");

        Map<String, Long> wordCounts = Files.lines(Paths.get("Chapter2Paragraph.txt"))
                .flatMap(line -> pattern.splitAsStream(line))
                .collect(Collectors.groupingBy(String::toLowerCase, TreeMap::new, Collectors.counting()));
        wordCounts.entrySet()
                .stream()
                .collect(Collectors.groupingBy(entry -> entry.getKey().charAt(0), TreeMap::new, Collectors.toList()))

    }
}
,