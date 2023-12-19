import commands.Command;
import commands.FanHighCommand;
import commands.FanMediumCommand;
import commands.FanOffCommand;
import commands.LightOffCommand;
import commands.LightOnCommand;
import commands.MacroCommand;
import invokers.RemoteControl;
import receivers.Fan;
import receivers.Light;
// import receivers.Stereo;

public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl control = new RemoteControl();
        Light livingRoomLight = new Light("Living room");
        // Light kitchenLight = new Light("Kitchen");
        // Stereo stereo = new Stereo();
        // control.setCommand(0, () -> livingRoomLight.on(), () -> livingRoomLight.off());
        // control.setCommand(1, () -> kitchenLight.on(), () -> kitchenLight.off());
        // control.setCommand(2, () -> stereo.on(), () -> stereo.off());
        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        control.setCommand(0, livingRoomLightOn, livingRoomLightOff);

        control.onBtnPressed(0);
        control.offBtnPressed(0);
        control.undoBtnPressed();
        // control.onBtnPressed(2);
        // control.offBtnPressed();

        Fan fan = new Fan("Bedroom");
        FanHighCommand fanHigh = new FanHighCommand(fan);
        FanMediumCommand fanMedium = new FanMediumCommand(fan);
        FanOffCommand fanOff = new FanOffCommand(fan);
        control.setCommand(3, fanMedium, fanOff);
        control.setCommand(4, fanHigh, fanOff);
        control.onBtnPressed(3);
        control.onBtnPressed(4);
        control.undoBtnPressed();

        Command[] partyDevicesOn = {livingRoomLightOn, fanHigh};
        Command[] partyDevicesOff = {livingRoomLightOff, fanOff};
        MacroCommand partyOn = new MacroCommand(partyDevicesOn);
        MacroCommand partyOff = new MacroCommand(partyDevicesOff);
        control.setCommand(5, partyOn, partyOff);
        control.onBtnPressed(5);
        control.undoBtnPressed();
    }
}
