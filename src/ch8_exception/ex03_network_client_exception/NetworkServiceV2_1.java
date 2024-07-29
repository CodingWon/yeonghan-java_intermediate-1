package ch8_exception.ex03_network_client_exception;

public class NetworkServiceV2_1 {

    public void sendMessage(String data) throws NetworkClientException2 {
        String address = "http://example.com";

        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data);

        client.connect();
        client.send(data);
        client.disconnect();

    }
}
