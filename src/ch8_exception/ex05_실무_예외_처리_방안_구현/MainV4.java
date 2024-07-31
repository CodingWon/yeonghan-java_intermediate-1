package ch8_exception.ex05_실무_예외_처리_방안_구현;

import ch8_exception.ex05_실무_예외_처리_방안_구현.exception.ConnectExceptionV4;
import ch8_exception.ex05_실무_예외_처리_방안_구현.exception.SendExceptionV4;

import java.util.Scanner;

public class MainV4 {
    public static void main(String[] args) {
        NetworkServiceV4 networkService = new NetworkServiceV4();

        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.print("전송할 문자 : ");
            String input = sc.nextLine();
            if(input.equals("exit")){
                break;
            }

            try {
                networkService.sendMessage(input);
            }catch (Exception e){
                exceptionHandelr(e);
            }
            System.out.println();
        }
        System.out.println("프로그램을 정상 종료 합니다.");
    }

    /*
    *  - 해결할 수 없는 예외가 발생하면 사용자에게는 시스템 내에 알 수 없는 문제가 발생했다고 알리는 것이 좋다
    *
    * */



    private static void exceptionHandelr(Exception e){
        // 공통 처리
        System.out.println("사용자 메시지 : 죄송합니다. 알 수 없는 문제가 발생했습니다.");
        System.out.println("=== 개발자용 디버깅 메시지 ===");
        e.printStackTrace(System.out);
        //e.printStackTrace();

        if(e instanceof ConnectExceptionV4 connectEx){
            System.out.println("[연결 오류] " + connectEx.getAddress());
        }

        // 필요하면 예외 별로 별도의 추가 처리 가능
        if(e instanceof SendExceptionV4 sendEx){
            System.out.println("[전송 오류] 전송 데이터 : " + sendEx.getSendData());
        }

    }
}
