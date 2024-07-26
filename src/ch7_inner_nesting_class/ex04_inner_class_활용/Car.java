package ch7_inner_nesting_class.ex04_inner_class_활용;

/*
*  중첩 클래스는 언제 사용해야 하나?
*   - 특정 클래스가 다른 하나의 클래스 안에서만 사용되거나, 둘이 아주 긴밀하게 연결되어 있는 특별한 경우 사용해야 한다.
* 
*  중첩 클래스 사용 이유
*   - 논리적 그룹화
*   - 캡슐화
* */

public class Car {

    private String model;
    private int chargeLevel;
    private Engine engine;

    public Car(String model, int chargeLevel) {
        this.model = model;
        this.chargeLevel = chargeLevel;
        this.engine = new Engine();
    }

    public void start(){
        engine.start();
        System.out.println(model + " 시작 완료");
    }

    private class Engine {
        public void start(){
            System.out.println("충전 레벨 확인 : " + chargeLevel);
            System.out.println(model + " 의 엔진을 구동합니다.");
        }
    }


}
