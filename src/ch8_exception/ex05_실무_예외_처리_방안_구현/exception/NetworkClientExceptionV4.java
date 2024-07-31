package ch8_exception.ex05_실무_예외_처리_방안_구현.exception;

public class NetworkClientExceptionV4 extends RuntimeException{

    public NetworkClientExceptionV4(String message){
        super(message);
    }
}
