package invokers;
import commands.Command;

public class SimpleRemoteControl {
    Command slot;
    public SimpleRemoteControl() {}

    public void setCommand(Command command) {
        slot = command;
    }

    public void onBtnPressed() {
        slot.execute();
    }
}
