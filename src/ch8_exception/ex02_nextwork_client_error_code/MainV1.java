package ch8_exception.ex02_nextwork_client_error_code;

import java.util.Scanner;

public class MainV1 {
    public static void main(String[] args) {
        NetworkServiceV1_1 networkService = new NetworkServiceV1_1();
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.print("전송할 문자 : " );
            String input = sc.nextLine();
            if(input.equals("exit")){
                break;
            }
            networkService.sendMessage(input);
            System.out.println();
        }
        System.out.println("프로그램을 정상 종료 합니다.");
    }
}

/*
    전송할 문자: hello
    http://example.com 서버 연결 성공
    http://example.com 서버에 데이터 전송: hello
    http://example.com 서버 연결 해제
    전송할 문자: error1
    http://example.com 서버 연결 실패
    http://example.com 서버에 데이터 전송: error1
    http://example.com 서버 연결 해제
*/