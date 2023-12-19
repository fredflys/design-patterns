package commands;

public class MacroCommand implements Command{
    Command[] commands;
    public MacroCommand(Command[] commands) {
        this.commands = commands;
    }
    
    @Override
    public void execute() {
        for (int i = 0; i < this.commands.length; i++) {
            this.commands[i].execute();
        }
    }

    @Override
    public void undo() {
        for (int i = 0; i < this.commands.length; i++) {
            this.commands[i].undo();
        }
    }
}
