package org.stepit.io.hw.command.entity.impl;

import org.stepit.io.hw.command.entity.Command;
import org.stepit.io.hw.command.enums.Commands;

public class ExitCommand implements Command {
    @Override
    public void execute(String... args) {
        if (args[0].trim().toLowerCase().equals(Commands.EXIT.getName()))
            System.exit(0);
    }
}
