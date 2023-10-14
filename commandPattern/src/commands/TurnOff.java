package commands;

import devices.*;

public class TurnOff implements Command{
    @Override
    public String execute(Device device) {
        String output = "";

        switch (device.getClass().getSimpleName()){
            case "Aircon": output = (new Aircon()).turnOff(); break;
            case "Thermostat": output = (new Thermostat()).turnOff(); break;
            case "MusicPlayer": output = (new MusicPlayer()).turnOff(); break;
            case "Light": output = (new Light()).turnOff(); break;
        }
        return output;
    }
}
