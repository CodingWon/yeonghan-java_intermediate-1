package ch8_exception.ex03_network_client_exception;

public class NetworkServiceV2_2 {

    public void sendMessage(String data){
        String address = "http://example.com";

        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data);

        try {
            client.connect();
            client.send(data);
        }catch (NetworkClientException2 e){
            System.out.println("[오류] 코드 : " + e.getErrorCode() + ", 메시지 : " + e.getMessage());
        }finally {
            client.disconnect();    // finally 는 반드시 호출
        }
    }
}
