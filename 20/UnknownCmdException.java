/**
 * 表示無法辨識的指令。
 */
public class UnknownCmdException extends Exception {

    /**
     * 建立包含錯誤訊息的例外。
     *
     * @param errMessage 錯誤訊息
     */
    public UnknownCmdException(String errMessage) {
        super(errMessage);
    }
}