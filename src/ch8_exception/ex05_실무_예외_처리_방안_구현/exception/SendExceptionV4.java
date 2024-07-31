package ch8_exception.ex05_실무_예외_처리_방안_구현.exception;

public class SendExceptionV4 extends NetworkClientExceptionV4{

    private final String sendData;

    public SendExceptionV4(String message, String sendData) {
        super(message);
        this.sendData = sendData;
    }

    public String getSendData() {
        return sendData;
    }
}
