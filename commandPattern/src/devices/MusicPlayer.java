package devices;

public class MusicPlayer implements Device{

    @Override
    public String turnOn() {
        return "Booting up";
    }

    @Override
    public String turnOff() {
        return "Shutting down";
    }

    @Override
    public String increase() {
        return "Volume going up";
    }

    @Override
    public String decrease() {
        return "Volume going down";
    }
}
