package ch8_exception.ex03_network_client_exception;

public class NetworkClientException2 extends Exception{

    private String errorCode;

    NetworkClientException2(String errorCode, String message){
        super(message);
        this.errorCode = errorCode;
    }

    public String getErrorCode(){
        return errorCode;
    }
}
