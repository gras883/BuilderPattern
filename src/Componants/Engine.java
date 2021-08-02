package Componants;

public class Engine {
    private final double volume;
    private double mileage;
    private  boolean started;

    public Engine(double volume,double mileage) {
        this.volume = volume;
        this.mileage = mileage;
    }

    public void on(){
        this.started = true;
    }

    public void off(){
        this.started = false;
    }

    public void go(){
        if(started){
            this.mileage += mileage;
        }else {
            System.out.println("Cannot go(), you must start engine first!");
        }
    }

    public double getMileage() {
        return mileage;
    }

    public boolean isStarted() {
        return started;
    }

    public double getVolume() {
        return volume;
    }
}
