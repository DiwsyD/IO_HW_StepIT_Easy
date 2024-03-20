package org.stepit.io.hw.person.persistence;

public interface HumanRepository<T> {

    T saveHuman(T human);

    T findHuman(long id);

    T findAll();

}
