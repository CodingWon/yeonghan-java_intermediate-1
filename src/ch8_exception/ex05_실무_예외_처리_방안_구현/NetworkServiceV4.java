package ch8_exception.ex05_실무_예외_처리_방안_구현;

public class NetworkServiceV4 {

    public void sendMessage(String data){
        String address = "https://example.com";

        NetworkClientV4 client = new NetworkClientV4(address);
        client.initError(data);

        /*
        *  - 언체크 예외이므로 `throws` 를 사용하지 않는다
        *  - NetworkServiceV4` 개발자 입장에서는 해당 예외들을 복구할 수 없다.
        *  - 해결할 수 없는 예외들은 다른 곳에서 공통으로 처리된다.
        * */
        try {
            client.connect();
            client.send(data);
        } finally {
            client.disconnect();
        }

    }
}
