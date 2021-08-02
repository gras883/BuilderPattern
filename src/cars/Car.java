package cars;

import Componants.*;

public class Car {
    private final CarType carType;
    private final int seats;
    private final Engine engine;
    private final GPSNavigator gpsNavigator;
    private final TripComputer tripComputer;
    private final Transmission transmission;
    private double fuel = 0;

    public Car(CarType carType, int seats, Engine engine, GPSNavigator gpsNavigator,
               TripComputer tripComputer, Transmission transmission) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.gpsNavigator = gpsNavigator;
        this.tripComputer = tripComputer;
        if(this.tripComputer != null){
            this.tripComputer.setCar(this);
        }
        this.transmission = transmission;
    }

    public CarType getCarType() {
        return carType;
    }

    public int getSeats() {
        return seats;
    }

    public Engine getEngine() {
        return engine;
    }

    public GPSNavigator getGpsNavigator() {
        return gpsNavigator;
    }

    public TripComputer getTripComputer() {
        return tripComputer;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }
}
