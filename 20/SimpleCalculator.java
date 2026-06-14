import java.text.DecimalFormat;

/**
 * 執行簡單四則運算。
 */
public class SimpleCalculator {

    private double result = 0.0;
    private int count = 0;
    private String operator;
    private double value;
    private boolean finished = false;

    /**
     * 執行計算指令。
     *
     * @param cmd 計算指令
     * @throws UnknownCmdException 指令錯誤時拋出
     */
    public void calResult(String cmd) throws UnknownCmdException {
        String[] parts = cmd.split(" ", -1);

        if (parts.length != 2
                || parts[0].isEmpty()
                || parts[1].isEmpty()) {
            throw new UnknownCmdException(
                    "Please enter 1 operator and 1 value separated by 1 space");
        }

        String inputOperator = parts[0];
        String inputValue = parts[1];

        boolean operatorValid =
                inputOperator.equals("+")
                || inputOperator.equals("-")
                || inputOperator.equals("*")
                || inputOperator.equals("/");

        boolean valueValid = true;
        double parsedValue = 0.0;

        try {
            parsedValue = Double.parseDouble(inputValue);
        } catch (NumberFormatException e) {
            valueValid = false;
        }

        if (!operatorValid && !valueValid) {
            throw new UnknownCmdException(
                    inputOperator + " is an unknown operator and "
                    + inputValue + " is an unknown value");
        }

        if (!operatorValid) {
            throw new UnknownCmdException(
                    inputOperator + " is an unknown operator");
        }

        if (!valueValid) {
            throw new UnknownCmdException(
                    inputValue + " is an unknown value");
        }

        if (inputOperator.equals("/") && parsedValue == 0.0) {
            throw new UnknownCmdException("Can not divide by 0");
        }

        operator = inputOperator;
        value = parsedValue;

        switch (operator) {
            case "+":
                result += value;
                break;
            case "-":
                result -= value;
                break;
            case "*":
                result *= value;
                break;
            case "/":
                result /= value;
                break;
        }

        count++;
    }

    /**
     * 取得目前訊息。
     *
     * @return 計算結果訊息
     */
    public String getMsg() {
        DecimalFormat df = new DecimalFormat("0.00");

        if (finished) {
            return "Final result = " + df.format(result);
        }

        if (count == 0) {
            return "Calculator is on. Result = " + df.format(result);
        }

        String message = "Result " + operator + " "
                + df.format(value) + " = "
                + df.format(result) + ". ";

        if (count == 1) {
            message += "New result = " + df.format(result);
        } else {
            message += "Updated result = " + df.format(result);
        }

        return message;
    }

    /**
     * 判斷是否結束計算。
     *
     * @param cmd 指令
     * @return 是 r 或 R 時回傳 true
     */
    public boolean endCalc(String cmd) {
        if (cmd.equals("r") || cmd.equals("R")) {
            finished = true;
            return true;
        }

        return false;
    }
}
