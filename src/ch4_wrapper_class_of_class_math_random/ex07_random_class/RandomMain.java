package ch4_wrapper_class_of_class_math_random.ex07_random_class;

import java.util.Random;

public class RandomMain {
    public static void main(String[] args) {
        // Random random = new Random();
        Random random = new Random(1);  // Seed 가 같으면 실행 결과는 반복 실행해도 같다.

        int randomInt = random.nextInt();
        System.out.println("randomInt : " + randomInt);

        double randomDouble = random.nextDouble();
        System.out.println("randomDouble : " + randomDouble);

        boolean randomBoolean = random.nextBoolean();
        System.out.println("randomBoolean : " + randomBoolean);

        //범위 조회
        int randomRange1 = random.nextInt(10); // 0 ~ 9 까지 출력
        System.out.println(" 0 ~ 9 : " + randomRange1);

        int randomRange2 = random.nextInt(10) + 1;// 1 ~ 10 까지 출력
        System.out.println(" 1 ~ 10 : " + randomRange2);
    }
}