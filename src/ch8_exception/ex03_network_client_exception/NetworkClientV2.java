package ch8_exception.ex03_network_client_exception;

public class NetworkClientV2 {
    private final String address;
    public boolean connectError;
    public boolean sendError;

    public NetworkClientV2(String address) {
        this.address = address;
    }

    public void connect() throws NetworkClientException2{
        if(connectError)
            throw new NetworkClientException2("connectError", address+" 서버 연결 실패");
    
        // 연결 성공
        System.out.println(address + " 서버 연결 성공");
    }

    public void send(String data) throws NetworkClientException2{
        if(sendError){
            throw new NetworkClientException2("sendError", address + " 서버 데이터 전송 실패 : " + data);
        }

        //전송 성공
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
            connectError = true;
        }
    }
        
}
