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
            System.out.println("[연결 오류] 주소 : " + e.getAddress() + ", 메시지 : " + e.getMessage());
        } catch (SendExceptionV3 e){
            System.out.println("[전송 오류] 주소 : " + e.getSendData() + " , 메시지 : " + e.getMessage());
        }catch (Exception e){
            System.out.println("[알 수 없는 오류] 메시지 : " + e.getMessage());
        }finally {
            client.disconnect();
        }

    }
}
