package org.stepit.io.hw.command.controller;

import org.stepit.io.hw.command.entity.Command;
import org.stepit.io.hw.command.enums.Commands;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CommandController {

    private final Map<String, Command> commands;

    public CommandController() {
        commands = new HashMap<>();
    }

    public Command getCommand(String command) {
        Command requestedCommand = commands.get(command);
        return requestedCommand == null ? commands.get("unknownCommand") : requestedCommand;
    }

    public List<String> getAllCommandNames() {
        return commands.keySet().stream().toList();
    }

    public void addCommand(String name, Command commandObject) {
        commands.put(name, commandObject);
    }

    public void addCommand(Commands name, Command commandObject) {
        commands.put(name.getName(), commandObject);
    }


}
