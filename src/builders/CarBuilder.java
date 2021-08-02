package builders;

import Componants.Engine;
import Componants.GPSNavigator;
import Componants.Transmission;
import Componants.TripComputer;
import cars.Car;
import cars.CarType;

public class CarBuilder implements Builder{
    private CarType carType;
    private int seats;
    private Engine engine;
    private GPSNavigator gpsNavigator;
    private Transmission transmission;
    private TripComputer tripComputer;

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    public Car buildCar(){
        return new Car(carType, seats, engine, gpsNavigator, tripComputer, transmission);
    }
}
