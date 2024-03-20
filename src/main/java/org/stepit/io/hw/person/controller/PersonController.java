package org.stepit.io.hw.person.controller;

import org.stepit.io.hw.command.controller.CommandController;
import org.stepit.io.hw.command.entity.Command;
import org.stepit.io.hw.command.enums.Commands;

import java.util.Scanner;

public class PersonController {

    private final Scanner scanner;
    private final CommandController commands;

    public PersonController(Scanner scanner, CommandController commands) {
        this.scanner = scanner;
        this.commands = commands;
    }

    public void run() {
        System.out.println("Welcome to \"Person Creator\" program!\nType 'help' to see al commands.");
        while (true) {
            String[] input = scanner.nextLine().split(" ");
            Command command = commands.getCommand(input[0]);
            if (command != null) {
                command.execute(input);
            } else {
                commands.getCommand(Commands.UNKNOWN.getName()).execute(input);
            }
        }
    }

}
