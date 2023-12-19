package commands;

import receivers.Stereo;

public class StereoOnCommand implements Command{
    Stereo stereo;
    public StereoOnCommand(Stereo stereo) {
        this.stereo = stereo;
    }
    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(10);
    }
    @Override
    public void undo() {
        stereo.setVolume(0);
        stereo.setCD();
        stereo.off();
    }
}
