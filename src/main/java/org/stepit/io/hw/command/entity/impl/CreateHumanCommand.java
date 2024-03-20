package org.stepit.io.hw.command.entity.impl;

import org.stepit.io.hw.command.entity.Command;
import org.stepit.io.hw.person.entity.Human;
import org.stepit.io.hw.person.entity.impl.Person;
import org.stepit.io.hw.person.persistence.HumanRepository;

public class CreateHumanCommand implements Command {

    private final HumanRepository<Human> humanHumanRepository;

    public CreateHumanCommand(HumanRepository<Human> humanHumanRepository) {
        this.humanHumanRepository = humanHumanRepository;
    }

    @Override
    public void execute(String... args) {
        //TODO(): Це приклад коду, Ваша задача переробити команди у відповідності до вашого домену.
        Human person = new Person();
        Human human = humanHumanRepository.saveHuman(person);
        System.out.println("Saved human: " + human);
    }
}
