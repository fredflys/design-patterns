import commands.LightOnCommand;
import invokers.SimpleRemoteControl;
import receivers.Light;

// client
public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl control = new SimpleRemoteControl();
        Light light = new Light("Living ");
        LightOnCommand lightOn = new LightOnCommand(light);

        control.setCommand(lightOn);
        control.onBtnPressed();
    }
}
