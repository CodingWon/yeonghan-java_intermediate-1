package ch8_exception.ex05_실무_예외_처리_방안_구현;

import ch8_exception.ex05_실무_예외_처리_방안_구현.exception.ConnectExceptionV4;
import ch8_exception.ex05_실무_예외_처리_방안_구현.exception.SendExceptionV4;

public class NetworkClientV4 {

    private final String address;
    public boolean connectError;
    public boolean sendError;

    public NetworkClientV4(String address) {
        this.address = address;
    }

    public void connect(){
        if(connectError){
            throw new ConnectExceptionV4(address + " 서버 연결 실패" , address);
        }

        System.out.println(address + " 서버 연결 성공");
    }

    public void send(String data){
        if(sendError){
            throw new SendExceptionV4(data, address + " 서버에 데이터 전송 : " + data);
        }

        System.out.println(address + " 서버에 데이터 전송 : " + data);
    }

    public void disconnect(){
        System.out.println(address + " 서버 연결 해제");
    }

    public void initError(String data){
        if(data.contains("error1")){
            connectError = true;
        }

        if(data.contains("error2")){
            sendError = true;
        }
    }
}
