package devices;
public class Aircon implements Device{
    @Override
    public String turnOn() {
        return "Initializing cooling system";
    }

    @Override
    public String turnOff() {
        return "The engine terminates";
    }

    @Override
    public String increase() {
        return "Increasing the cooler";
    }

    @Override
    public String decrease() {
        return "Cooler output decreasing.";
    }
}
