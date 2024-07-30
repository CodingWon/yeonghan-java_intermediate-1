package ch8_exception.ex04_network_client_exception_step;

public class SendExceptionV3 extends NetworkClientException3{

    private final String sendData;

    SendExceptionV3(String sendMessage, String message) {
        super(message);
        this.sendData = sendMessage;
    }

    public String getSendData() {
        return sendData;
    }
}
