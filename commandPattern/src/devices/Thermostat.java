package devices;

public class Thermostat implements Device{
    @Override
    public String turnOn() {
        return "Initializing heater";
    }

    @Override
    public String turnOff() {
        return "Thermostat turns off";
    }

    @Override
    public String increase() {
        return "Increasing Temperature";
    }

    @Override
    public String decrease() {
        return "Decreasing Temperature";
    }
}
