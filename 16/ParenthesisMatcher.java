import java.util.Stack;

/**
 * 檢查括號是否正確配對。
 */
public class ParenthesisMatcher {

    /**
     * 判斷字串中的括號是否有效。
     *
     * @param s 要檢查的括號字串
     * @return 配對正確回傳 true，否則回傳 false
     */
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }

                char open = stack.pop();

                if (ch == ')' && open != '(') {
                    return false;
                } else if (ch == '}' && open != '{') {
                    return false;
                } else if (ch == ']' && open != '[') {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
