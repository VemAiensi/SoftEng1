import commands.*;
import devices.*;

public class DeviceController {
    private TurnOn on = new TurnOn();
    private TurnOff off = new TurnOff();
    private Increase plus = new Increase();
    private Decrease minus = new Decrease();


    public String clickOn(Device device) {return on.execute(device);}
    public String clickOff(Device device) {return off.execute(device);}
    public String clickPlus(Device device) {return plus.execute(device);}
    public String clickMinus(Device device)
    {
        return minus.execute(device);
    }



}
