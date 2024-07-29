package ch8_exception.ex02_nextwork_client_error_code;

public class NetworkServiceV1_3 {

    public void sendMessage(String data){
        NetworkClientV1 client = new NetworkClientV1("http://example.com");
        client.initError(data);

        String connectResult = client.connect();
        if(isError(connectResult)){
            System.out.println("[네트워크 오류 발생] 오류 코드 : " + connectResult);
        }else{
            String sendResult = client.send(data);
            if(isError(sendResult)){
                System.out.println("[네트워크 오류 발생] 오류 코드 : " + sendResult);
            }
        }

        client.disconnect();
    }

    public static boolean isError(String resultCode){
        return !resultCode.equals("success");
    }
}

/*
*   - 문제점
*       disconnect 로직을 무조건 태우나 else 문 가독성이 좋지 않다.
* */