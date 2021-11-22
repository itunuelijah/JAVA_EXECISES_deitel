package chapter14;

import java.security.SecureRandom;

public class SentenceGenerator {
    private String[] article = {"a", "the", "some", "one", " any"};
    private String[] noun ={ "dog", "cat","boy", "girl", "town"};
    private String[] verb = {"drove", "jump", "ran", "walked", "skipped"};
    private String[] preposition = {"to", "from", "over", "under", "on"};

    public static  String createSentence(){
        SecureRandom randomIndex = new SecureRandom();
        int index = randomIndex.nextInt(5);
        String firstWord = new String(article[index]);

        char firstLetter = firstWord.charAt(0);
        firstLetter = Character.toUpperCase(firstLetter);
        firstWord = firstWord.replace(firstWord.charAt(0), firstLetter)

        StringBuilder sentence = new StringBuilder(firstWord);
        sentence.append(" ");
        index = randomIndex.nextInt(5);
        sentence.append(noun[index]);
        sentence.append(" ");
        index = randomIndex.nextInt(5);
        sentence.append(verb[index]);
        sentence.append(" ");
        index = randomIndex.nextInt(5);
        sentence.append(preposition[index]);
        sentence.append(" ");
        index = randomIndex.nextInt(5);
        sentence.append(article[index]);
        sentence.append(".");


        return sentence.toString();
    }
}
