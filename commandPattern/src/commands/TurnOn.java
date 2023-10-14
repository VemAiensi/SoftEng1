package commands;

import devices.*;

public class TurnOn implements Command{
    @Override
    public String execute(Device device) {
        String output = "";

        switch (device.getClass().getSimpleName()){
            case "Aircon": output = (new Aircon()).turnOn(); break;
            case "Thermostat": output = (new Thermostat()).turnOn(); break;
            case "MusicPlayer": output = (new MusicPlayer()).turnOn(); break;
            case "Light": output = (new Light()).turnOn(); break;
        }
        return output;
    }
}
