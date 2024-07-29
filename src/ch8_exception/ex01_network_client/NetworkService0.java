package ch8_exception.ex01_network_client;

public class NetworkService0 {
    public void sendMessage(String data){
        String address = "http://example.com";
        NetworkClientV0 client = new NetworkClientV0(address);

        client.connect();
        client.send(data);
        client.disconnect();
    }
}
