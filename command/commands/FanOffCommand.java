package commands;

import receivers.Fan;
import receivers.Fan.Speed;

public class FanOffCommand implements Command{
    Fan fan;
    Speed prevSpeed;
    public FanOffCommand(Fan fan) {
        this.fan = fan;
    }
    
    @Override
    public void execute() {
        prevSpeed = fan.getSpeed();
        fan.off();
    }

    @Override
    public void undo() {
        switch(prevSpeed) {
            case HIGH:
                fan.high();
                break;
            case MEDIUM:
                fan.medium();
                break;
            case LOW:
                fan.low();
                break;
            case OFF:
                fan.off();
                break;
        }
    }
}
