package org.stepit.io.hw.command.enums;

public enum Commands {

    EXIT("exit"),
    CREATE("create"),
    FIND("find"),
    UNKNOWN("unknown"),
    HELP("help");

    private final String name;

    Commands(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
