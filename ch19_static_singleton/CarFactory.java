package ch19_static_singleton;

public class CarFactory {
    
    // private int serialNum = 10000;

    private static CarFactory instance = new CarFactory();

    private CarFactory() {

    }

    public static CarFactory getInstance() {
        if(instance == null) {
            instance = new CarFactory();
        }
        return instance;
    }

    public Car createCar() {
        Car car = new Car();
        return car;
    }
}
