package ch8_exception.ex04_network_client_exception_step;

public class NetworkServiceV3_1 {

    public void sendMessage(String data){
        String address = "https://example.com";

        NetworkClientV3 client = new NetworkClientV3(address);
        client.initError(data);

        try {
            client.connect();
            client.send(data);
        }catch (ConnectExceptionV3 e){

        }catch (SendExceptionV3 e){

        }

    }
}
