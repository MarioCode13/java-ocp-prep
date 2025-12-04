import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Car car = new Car("2019 Blue ferrari");
        runRace(car);
    }
    public static void runRace(Car car){
        car.startEngine();
        car.drive();
    }
}
