public class Car {

    private String description;

    public Car(String description) {
        this.description = description;
    }

    public void startEngine() {
        System.out.println("Car -> Engine is started");
    }

    public void drive() {
        System.out.println("Car -> Driving type: " + getClass().getSimpleName() );
        runEngine();
    }
// protected = subclasses can override. classes not sharing package cannot
    protected void runEngine(){
        System.out.println("Car -> Engine is running");
    }
}

class GasCar extends Car {
    double avgKmPerLitre;
    int cylinders;

    public GasCar(String description, double avgKmPerLitre) {
        super(description);
    }

    public GasCar(String description, double avgKmPerLitre, int cylinders) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.printf("GasCar -> %d cylinders fired up and ready %n", cylinders);
    }

    @Override
    protected void runEngine() {
        System.out.printf("GasCar -> usage at %.2f km/l %n", avgKmPerLitre);
    }
}

class ElectricCar extends Car {
    double avgKmPerCharge;
    int batterySize;

    public ElectricCar(String description) {
        super(description);
    }
}

class HybridCar extends Car {
    double avgKmPerLitre;
    int cylinders;
    int batterySize;

    public HybridCar(String description) {
        super(description);
    }
}