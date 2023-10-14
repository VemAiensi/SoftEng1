package devices;

public class Light implements Device{
    @Override
    public String turnOn() {
        return "Lights on!";
    }

    @Override
    public String turnOff() {
        return "Lights off...";
    }

    @Override
    public String increase() {
        return "Increasing brightness";
    }

    @Override
    public String decrease() {
        return "Decreasing brightness";
    }
}
