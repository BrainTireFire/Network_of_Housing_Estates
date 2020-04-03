package com.company;

import java.util.Scanner;

public class DrawMenu {
    private Menu menu;
    private Person person;

    public DrawMenu(){
        Menu mainMenu = new Menu("Menu Głowne");
        Menu subMenu1 = new Menu("Pod menu");
        Menu subMenu2 = new Menu("Wyswielt PErson");

        mainMenu.putAction("Dodawanie Kutasow", () -> activateMenu(subMenu1));
        mainMenu.putAction("Wyjscie", () -> System.exit(0));

        subMenu1.putAction("Szukanie klientow", () ->  Person.show());
        subMenu1.putAction("step back menu", () -> activateMenu(subMenu1));
        subMenu1.putAction("Szukanie Mieszkan", () -> System.out.println("Dupa"));
        subMenu1.putAction("Wyjscie", () -> System.exit(0));

        subMenu2.putAction("", () -> activateMenu(mainMenu));

        activateMenu(mainMenu);
    }

    private void activateMenu(Menu newMenu){
        menu = newMenu;
        System.out.println(newMenu.generateText());
        Scanner scanner = new Scanner(System.in);
        while (true){
            int actionNumber = scanner.nextInt();
            menu.executeAction(actionNumber);
        }
    }
}