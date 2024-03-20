package org.stepit.io.hw.command.entity.impl;

import org.stepit.io.hw.command.entity.Command;
import org.stepit.io.hw.person.entity.Human;
import org.stepit.io.hw.person.persistence.HumanRepository;

public class FindHumanCommand implements Command {

    private final HumanRepository<Human> humanHumanRepository;

    public FindHumanCommand(HumanRepository<Human> humanHumanRepository) {
        this.humanHumanRepository = humanHumanRepository;
    }

    @Override
    public void execute(String... args) {
        long id = -1;
        Human human = humanHumanRepository.findHuman(id);
        String messageStart = human != null ? "Found" : "Can't find";
        System.out.println(messageStart + " human: " + human);
    }
}
