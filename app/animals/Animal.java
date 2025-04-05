package app.animals;

import java.util.ArrayList;
import java.util.List;

class Command {
    private String name;

    public Command(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public abstract class Animal {
    private String name;
    private ArrayList<Command> commands;
    private String birthDate;

    public Animal(String name, String birhDate) {
        this.name = name;
        this.commands = new ArrayList<>();
        this.birthDate = birhDate;
    }

    public String getName() {
        return name;
    }

    public List<Command> getCommands() {
        return commands;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void learnNewCommand(String newCommand) {
        Command command = new Command(newCommand);
        this.commands.add(command);
    }

    public void showCommands() {
        System.out.println("Commands for " + name + ":");
        for (Command command : commands) {
            System.out.println("- " + command.getName());
        }
    }
}