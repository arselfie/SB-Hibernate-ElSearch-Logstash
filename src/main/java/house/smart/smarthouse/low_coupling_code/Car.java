package house.smart.smarthouse.low_coupling_code;

public class Car {
    private Engine engine;//association

    public Car(Engine engine) {//aggregation
        this.engine = engine;
    }

    public Car() {
        this.engine = new Engine();//composition
    }
}

class Engine {

}

class TestCar {
    public static void main(String[] args) {
        Engine engine = new Engine();

        Car car = new Car(engine);
    }
}
