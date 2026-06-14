/**
 * 提供簡易 ATM 提款服務。
 */
public class SimpleATMService implements ATMService {

    /**
     * 檢查帳戶餘額是否足夠。
     *
     * @param account 使用者帳戶
     * @param money 提款金額
     * @return 餘額足夠時回傳 true
     * @throws ATMException 餘額不足時拋出例外
     */
    @Override
    public boolean checkBalance(Account account, int money)
            throws ATMException {

        if (account.getBalance() < money) {
            throw new ATMException(
                    ATMException.ExceptionType.BALANCE_NOT_ENOUGH);
        }

        return true;
    }

    /**
     * 檢查提款金額是否為一千的倍數。
     *
     * @param money 提款金額
     * @return 金額合法時回傳 true
     * @throws ATMException 金額不合法時拋出例外
     */
    @Override
    public boolean isValidAmount(int money) throws ATMException {
        if (money % 1000 != 0) {
            throw new ATMException(
                    ATMException.ExceptionType.AMOUNT_INVALID);
        }

        return true;
    }

    /**
     * 執行提款並顯示更新後餘額。
     *
     * @param account 使用者帳戶
     * @param money 提款金額
     */
    @Override
    public void withdraw(Account account, int money) {
        try {
            checkBalance(account, money);
            isValidAmount(money);

            account.setBalance(account.getBalance() - money);
        } catch (ATMException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(
                "updated balance : " + account.getBalance());
    }
}
