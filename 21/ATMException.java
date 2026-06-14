/**
 * 表示 ATM 操作發生的例外。
 */
public class ATMException extends Exception {

    /**
     * ATM 例外種類。
     */
    public enum ExceptionType {
        BALANCE_NOT_ENOUGH,
        AMOUNT_INVALID
    }

    private ExceptionType exceptionCondition;

    /**
     * 建立指定種類的 ATM 例外。
     *
     * @param exceptionCondition 例外種類
     */
    public ATMException(ExceptionType exceptionCondition) {
        this.exceptionCondition = exceptionCondition;
    }

    /**
     * 取得例外訊息。
     *
     * @return 例外種類名稱
     */
    @Override
    public String getMessage() {
        return exceptionCondition.toString();
    }
}