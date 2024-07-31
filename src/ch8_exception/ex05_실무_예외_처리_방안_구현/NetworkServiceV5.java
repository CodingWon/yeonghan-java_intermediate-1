package ch8_exception.ex05_실무_예외_처리_방안_구현;

public class NetworkServiceV5 {

    public void sendMessage(String data){
        String address = "https://example.com";

        /*
        *   - `try` 블럭이 끝나면 자동으로 `AutoCloseable.close()` 를 호출해서 자원을 해제한다.
        *   - 여기서 `catch` 블럭 없이 `try` 블럭만 있어도 `close()` 는 호출된다.
        *   - catch` 블럭은 단순히 발생한 예외를 잡아서 예외 메시지를 출력하고, 잡은 예외를 `throw` 를 사용해서 다시 밖으로 던진다
        * */

        try (NetworkClientV5 client = new NetworkClientV5(address)){
            client.initError(data);
            client.connect();
            client.send(data);
        } catch (Exception e){
            System.out.println("[예외 확인] : " + e.getMessage());
            throw e;
        }

    }
}
/*
*   Try with resources 장점
*       @ 리소스 누수 방지
*           # 모든 리소스가 제대로 닫히도록 보장한다.
*           # 실수로 `finally` 블록을 적지 않거나, `finally` 블럭 안에서 자원 해제 코드를 누락하는 문제들을 예방할 수 있다
*
*       @ 코드 간결성 및 가독성 향상 :
*           # 명시적인 `close()` 호출이 필요 없어 코드가 더 간결하고 읽기 쉬워진다
*
*       @ 스코프 범위 한정
*           # 예를 들어 리소스로 사용되는 `client` 변수의 스코프가 `try` 블럭 안으로 한정된다.
*           # 코드 유지보수가 더 쉬워진다.
*
*       @ 조금 더 빠른 자원 해제
*           # try catch finally로 catch 이후에 자원을 반납했다.
*           # Try with resources 구분은 `try` 블럭이 끝나면 즉시 `close()` 를 호출한다
* */
