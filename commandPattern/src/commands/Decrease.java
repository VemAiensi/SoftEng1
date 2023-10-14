package commands;
import devices.*;

public class Decrease implements Command{
    @Override
    public String execute(Device device) {
        String output = "";

        switch (device.getClass().getSimpleName()){
            case "Aircon": output = (new Aircon()).decrease(); break;
            case "Thermostat": output = (new Thermostat()).decrease(); break;
            case "MusicPlayer": output = (new MusicPlayer()).decrease(); break;
            case "Light": output = (new Light()).decrease(); break;
        }
        return output;
    }
}
