package ch7_inner_nesting_class.ex02_nested_class_활용;


/*
*
*  - NetworkMessage` 는 오직 `Network` 내부에서만 사용된다.
* */
public class Network {
    public void sendMessage(String text){
        NetworkMessage networkMessage = new NetworkMessage(text);
        networkMessage.print();
    }
    /*
    * - NetworkMessage` 의 접근 제어자를 `private` 설정했다. 따라서 외부에서 `NetworkMessage` 에 접근할 수 없다
    *
    * - 중첩 클래스(내부 클래스 포함)는 그 용도가 자신이 소속된 바깥 클래스 안에서 사용되는 것이다.
    *  따라서 자신이 소속된 바깥 클래스가 아닌 외부에서 생성하고 사용하고 있다면, 이미 중첩 클래스의 용도에 맞지 않을 수 있다.
    * */
    private static class NetworkMessage{
        private String content;

        public NetworkMessage(String content) {
            this.content = content;
        }

        public void print(){
            System.out.println(content);
        }
    }
}
