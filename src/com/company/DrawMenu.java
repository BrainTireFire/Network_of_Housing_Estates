package com.company;

import java.util.Scanner;

public class DrawMenu {
    private Menu menu;

    public DrawMenu(){
        Menu mainMenu = new Menu("Menu Głowne");
        Menu subMenu1 = new Menu("Pod menu");

        mainMenu.putAction("Dodawanie Kutasow", () -> activateMenu(subMenu1));
        mainMenu.putAction("Wyjscie", () -> System.exit(0));

        subMenu1.putAction("Szukanie klientow", () -> System.out.println("TEsty"));
        subMenu1.putAction("Szukanie Mieszkan", () -> System.out.println("Dupa"));
        subMenu1.putAction("Wyjscie", () -> System.exit(0));

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