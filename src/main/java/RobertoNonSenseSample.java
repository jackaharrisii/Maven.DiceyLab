class Car {

    private String engine;
    private int doors;

    public void drive() {
        System.out.println("vroom!");
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }
}

public class RobertoNonSenseSample {

    public static void main(String[] args) {
        generateCar();
    }

    public static Car generateCar() {
        Car car = new Car();
        car.setDoors(3);
        System.out.println(car.getDoors());
        return car;
    }

}
