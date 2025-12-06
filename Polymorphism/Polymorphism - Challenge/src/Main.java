import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Car car = new Car("2019 Blue ferrari");
        runRace(car);

        GasCar gasCar = new GasCar("Polo GTI", 15, 6);
        runRace(gasCar);
    }
    public static void runRace(Car car){
        car.startEngine();
        car.drive();
    }
}
