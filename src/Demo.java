import builders.CarBuilder;
import builders.CarManualBuilder;
import cars.Car;
import cars.Manual;
import director.Director;

public class Demo {
    public static void main(String[] args) {
        //Client code

        // Director gets the concrete builder object from the client
        // (application code). That's because application knows better which
        // builder to use to get a specific product.
        Director director = new Director();
        CarBuilder builder = new CarBuilder();
        director.ConstructCityCar(builder);

        // The final product is often retrieved from a builder object, since
        // Director is not aware and not dependent on concrete builders and
        // products.
        Car car  = builder.buildCar();
        System.out.println("Car built:\n" + car.getCarType());

        CarManualBuilder manualBuilder = new CarManualBuilder();
        director.ConstructCityCar(manualBuilder);
        Manual carManual = manualBuilder.buildCar();

        System.out.println("\nCar manual built:\n" + carManual.print());
    }
}
