package ch7_inner_nesting_class.ex04_inner_class_활용;

public class Car {

    private String model;
    private int chargeLevel;
    private Engine engine;

    public Car(String model, int chargeLevel) {
        this.model = model;
        this.chargeLevel = chargeLevel;
        this.engine = new Engine(this);
    }

    public String getModel() {
        return model;
    }

    public int getChargeLevel() {
        return chargeLevel;
    }

    public void start(){
        engine.start();
        System.out.println(model + " 시작 완료");
    }
}
