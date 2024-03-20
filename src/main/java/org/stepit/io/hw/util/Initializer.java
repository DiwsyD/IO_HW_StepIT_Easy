package org.stepit.io.hw.util;

import org.stepit.io.hw.command.controller.CommandController;
import org.stepit.io.hw.command.entity.impl.CreateHumanCommand;
import org.stepit.io.hw.command.entity.impl.ExitCommand;
import org.stepit.io.hw.command.entity.impl.FindHumanCommand;
import org.stepit.io.hw.command.enums.Commands;
import org.stepit.io.hw.person.controller.PersonController;
import org.stepit.io.hw.person.entity.Human;
import org.stepit.io.hw.person.persistence.HumanRepository;
import org.stepit.io.hw.person.persistence.impl.PersonRepository;

import java.util.List;
import java.util.Scanner;

public class Initializer {
    private final Scanner scanner;

    public Initializer(Scanner scanner) {
        this.scanner = scanner;
    }

    public PersonController buildCreator() {
        HumanRepository<Human> humanHumanRepository = new PersonRepository<>();

        CommandController cc = new CommandController();
        cc.addCommand(Commands.EXIT, new ExitCommand());
        cc.addCommand(Commands.CREATE, new CreateHumanCommand(humanHumanRepository));
        cc.addCommand(Commands.FIND, new FindHumanCommand(humanHumanRepository));
        cc.addCommand(Commands.UNKNOWN, (args) -> System.out.println("Unknown command, please, choose another one."));
        cc.addCommand(Commands.HELP, (args) -> {
            List<String> allCommandNames = cc.getAllCommandNames();
            for (int i = 0; i < allCommandNames.size(); i++) {
                System.out.printf("%d) %s%n", (i + 1), allCommandNames.get(i).toUpperCase());
            }
        });
        return new PersonController(scanner, cc);
    }
}
