import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Processes words in a sentence.
 */
public class SentenceProcessor {

    /**
     * Removes duplicate words, keeping only the first occurrence.
     *
     * @param sentence the sentence to be processed
     * @return the sentence with duplicate words removed
     */
    public String removeDuplicatedWords(String sentence) {
        String[] words = sentence.trim().split("\\s+");
        Set<String> uniqueWords = new LinkedHashSet<>();

        for (String word : words) {
            uniqueWords.add(word);
        }

        return String.join(" ", uniqueWords);
    }

    /**
     * 將句子中所有符合的單字替換成新的單字。
     *
     * @param target 要被替換的單字
     * @param replacement 替換後的單字
     * @param sentence 要處理的句子
     * @return 完成替換後的句子
     */
    public String replaceWord(
            String target,
            String replacement,
            String sentence) {

        String[] words = sentence.trim().split("\\s+");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (word.equals(target)) {
                word = replacement;
            }

            if (result.length() > 0) {
                result.append(" ");
            }

            result.append(word);
        }

        return result.toString();
    }
}