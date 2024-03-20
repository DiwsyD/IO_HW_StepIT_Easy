package org.stepit.io.hw;

import org.stepit.io.hw.person.controller.PersonController;
import org.stepit.io.hw.util.Initializer;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Initializer initializer = new Initializer(scanner);
        PersonController personController = initializer.buildCreator();
        personController.run();
    }


}
