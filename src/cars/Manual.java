package cars;

import Componants.Engine;
import Componants.GPSNavigator;
import Componants.Transmission;
import Componants.TripComputer;

public class Manual {
    private final CarType carType;
    private final int seats;
    private final Engine engine;
    private final GPSNavigator gpsNavigator;
    private final TripComputer tripComputer;
    private final Transmission transmission;

    public Manual(CarType carType, int seats, Engine engine, GPSNavigator gpsNavigator,
               TripComputer tripComputer, Transmission transmission) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.gpsNavigator = gpsNavigator;
        this.tripComputer = tripComputer;
        this.transmission = transmission;
    }

    public String print() {
        String info = "";
        info += "Type of car: " + carType + "\n";
        info += "Count of seats: " + seats + "\n";
        info += "Engine: volume - " + engine.getVolume() + "; mileage - " + engine.getMileage() + "\n";
        info += "Transmission: " + transmission + "\n";
        if (this.tripComputer != null) {
            info += "Trip Computer: Functional" + "\n";
        } else {
            info += "Trip Computer: N/A" + "\n";
        }
        if (this.gpsNavigator != null) {
            info += "GPS Navigator: Functional" + "\n";
        } else {
            info += "GPS Navigator: N/A" + "\n";
        }
        return info;
    }
}
