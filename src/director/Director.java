package director;

import Componants.Engine;
import Componants.GPSNavigator;
import Componants.Transmission;
import Componants.TripComputer;
import builders.Builder;
import cars.CarType;

public class Director {
    public void ConstructSportCar(Builder builder){
        builder.setCarType(CarType.SPORTS_CAR);
        builder.setEngine(new Engine(3.0, 0));
        builder.setSeats(2);
        builder.setGPSNavigator(new GPSNavigator());
        builder.setTransmission(Transmission.SEMI_AUTOMATIC);
        builder.setTripComputer(new TripComputer());
    }

    public void ConstructCityCar(Builder builder){
        builder.setCarType(CarType.CITY_CAR);
        builder.setEngine(new Engine(1.2, 0));
        builder.setSeats(4);
        builder.setGPSNavigator(new GPSNavigator());
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setTripComputer(new TripComputer());
    }

    public void ConstructSUV(Builder builder){
        builder.setCarType(CarType.SUV);
        builder.setEngine(new Engine(2.5, 0));
        builder.setSeats(4);
        builder.setGPSNavigator(new GPSNavigator());
        builder.setTransmission(Transmission.MANUAL);
        builder.setTripComputer(new TripComputer());
    }



}
