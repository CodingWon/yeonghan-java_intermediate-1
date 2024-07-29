package ch8_exception.ex03_network_client_exception;

import java.util.Scanner;

public class MainV2 {
    public static void main(String[] args) throws NetworkClientException2 {
        NetworkServiceV2_1 networkService = new NetworkServiceV2_1();
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.print("전송할 문자 : " );
            String input = scanner.nextLine();
            if(input.equals("exit")){
                break;
            }
            networkService.sendMessage(input);
            System.out.println();
        }

        System.out.println("프로그램을 정상 종료 합니다.");
    }
}
