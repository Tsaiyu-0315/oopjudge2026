import java.util.HashMap;
import java.util.Map;

/**
 * 處理卡片配對遊戲的各種指令。
 */
public class CardMatchingGame {

    /**
     * 依序執行卡片操作指令。
     *
     * @param commands 要執行的指令陣列
     * @return 所有輸出結果，
     */
    public static String process(String[] commands) {
        HashMap<Integer, Integer> cards = new HashMap<>();
        StringBuilder result = new StringBuilder();
        int totalCards = 0;

        for (String command : commands) {
            String[] parts = command.trim().split("\\s+");
            String operation = parts[0];

            if (operation.equals("add")) {
                int number = Integer.parseInt(parts[1]);

                cards.put(number, cards.getOrDefault(number, 0) + 1);
                totalCards++;

            } else if (operation.equals("remove")) {
                int number = Integer.parseInt(parts[1]);
                int amount = cards.getOrDefault(number, 0);

                if (amount == 0) {
                    appendResult(result, "Card not found");
                } else {
                    if (amount == 1) {
                        cards.remove(number);
                    } else {
                        cards.put(number, amount - 1);
                    }

                    totalCards--;
                }

            } else if (operation.equals("check")) {
                int number = Integer.parseInt(parts[1]);

                appendResult(
                    result,
                    String.valueOf(cards.containsKey(number))
                );

            } else if (operation.equals("count")) {
                appendResult(result, String.valueOf(totalCards));

            } else if (operation.equals("pair")) {
                int pairs = 0;

                for (Map.Entry<Integer, Integer> entry : cards.entrySet()) {
                    pairs += entry.getValue() / 2;
                }

                appendResult(result, String.valueOf(pairs));
            }
        }

        return result.toString();
    }

    /**
     * 將一筆結果加入輸出字串。
     *
     * @param result 輸出字串
     * @param text 要加入的內容
     */
    private static void appendResult(StringBuilder result, String text) {
        if (result.length() > 0) {
            result.append("\n");
        }

        result.append(text);
    }
}
