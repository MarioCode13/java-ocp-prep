import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Car car = new Car("2019 Blue ferrari");
        runRace(car);

        GasCar gasCar = new GasCar("Polo GTI", 15, 6);
        runRace(gasCar);

        ElectricCar elecCar = new ElectricCar("Tesla", 15, 6);
        runRace(elecCar);

        HybridCar hybridCar = new HybridCar("Toyota", 15, 6, 4);
        runRace(hybridCar);
    }
    public static void runRace(Car car){
        car.startEngine();
        car.drive();
    }
}
