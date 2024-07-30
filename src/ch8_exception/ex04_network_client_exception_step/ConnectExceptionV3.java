package ch8_exception.ex04_network_client_exception_step;

public class ConnectExceptionV3 extends NetworkClientException3 {

    private final String address;

    ConnectExceptionV3( String address, String message) {
        super(message);
        this.address = address;
    }

    public String getAddress(){
        return address;
    }
}
