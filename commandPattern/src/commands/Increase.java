package commands;

import devices.*;

public class Increase implements Command{
    @Override
    public String execute(Device device) {
        String output = "";

        switch (device.getClass().getSimpleName()){
            case "Aircon": output = (new Aircon()).increase(); break;
            case "Thermostat": output = (new Thermostat()).increase(); break;
            case "MusicPlayer": output = (new MusicPlayer()).increase(); break;
            case "Light": output = (new Light()).increase(); break;
        }
        return output;
    }
}
