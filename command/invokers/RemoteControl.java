package invokers;

import commands.Command;
import commands.NoCommand;

public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;
    int slotNum = 7;
    Command undoCommand = new NoCommand();

    public RemoteControl() {
        onCommands = new Command[slotNum];
        offCommands = new Command[slotNum];
        for (int i = 0; i < slotNum; i++) {
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }

    public void setCommand(int slot, Command on, Command off) {
        onCommands[slot] = on;
        offCommands[slot] = off;
    }

    public void onBtnPressed(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offBtnPressed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoBtnPressed() {
        undoCommand.undo();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Remote Control\n");
        for (int i = 0; i < slotNum; i++) {
            sb.append(String.format(
        "[slot %d] on: %s, off: %s\n", 
                onCommands[i].getClass().getName(), 
                offCommands[i].getClass().getName())
            );
        }

        return sb.toString();
    }
}
