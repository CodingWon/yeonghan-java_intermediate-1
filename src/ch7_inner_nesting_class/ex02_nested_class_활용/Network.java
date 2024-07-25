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
}
