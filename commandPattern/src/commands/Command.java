package commands;

import devices.*;

public interface Command {
    public String execute(Device device);
}
