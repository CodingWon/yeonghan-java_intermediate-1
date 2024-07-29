package ch8_exception.ex02_nextwork_client_error_code;

public class NetworkServiceV1_2 {

    /*
    * connect()` , `send()` 호출에 오류가 있어도 `disconnect()` 는 반드시 호출해야 한다
    * */

    public void sendMessage(String data){
        NetworkClientV1 client = new NetworkClientV1("http://example.com");
        client.initError(data);

        String connectResult = client.connect();
        if(isError(connectResult)){
            System.out.println("[네트워크 오류 발생] 오류 코드 : " + connectResult);
            return;
        }

        String sendResult = client.send(data);
        if(isError(sendResult)){
            System.out.println("[네트워크 오류 발생] 오류 코드 : " + sendResult);
            return;
        }
        client.disconnect();
    }

    private static boolean isError(String resultCode){
        return !resultCode.equals("success");
    }
}
