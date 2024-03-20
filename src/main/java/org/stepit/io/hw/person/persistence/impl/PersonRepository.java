package org.stepit.io.hw.person.persistence.impl;

import org.stepit.io.hw.person.persistence.HumanRepository;

import java.util.ArrayList;
import java.util.List;

public class PersonRepository<Human> implements HumanRepository<Human> {

    private List<Human> humanStorage = new ArrayList<>();

    public PersonRepository() {
        //TODO(): Вам потрібно реалізувати логіку завантаження списку людей із файлу у колекцію "humanStorage".
    }

    @Override
    public Human saveHuman(Human human) {
        //TODO(): Зберігати нові дані у ліст та файл.
        return null;
    }

    @Override
    public Human findHuman(long id) {
        //TODO():
        return null;
    }

    @Override
    public Human findAll() {
        //TODO():
        return null;
    }
}
