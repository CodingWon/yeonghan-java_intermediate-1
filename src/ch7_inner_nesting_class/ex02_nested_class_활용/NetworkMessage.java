package ch7_inner_nesting_class.ex02_nested_class_활용;



public class NetworkMessage {
    private  String content;
    public NetworkMessage(String content) {
        this.content = content;
    }
    public void print(){
        System.out.println(content);
    }
}
