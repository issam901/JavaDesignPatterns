package tn.smartdev.java.command;

public class Trainer {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void issueCommand() {
        command.execute();
    }
}
