package builders;

import Componants.Engine;
import Componants.GPSNavigator;
import Componants.Transmission;
import Componants.TripComputer;
import cars.CarType;

public interface Builder {
    void setCarType(CarType carType);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}