package com.company;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;

public class Menu {
    private final String text;
    private LinkedHashMap<String, Runnable> actionsMap = new LinkedHashMap<>();

    public Menu(String text) {
        this.text = text;
    }

    //Menu do wyboru nazwa i
    public void putAction(String name, Runnable action){
        actionsMap.put(name, action);
    }

    // Generowanie tekstu czyli ustawienie w odzielnej lini funkcjonalnosci menu itp
    public String generateText(){
        StringBuilder sb = new StringBuilder();
        sb.append(text).append("\n");
        List<String> actionNames = new ArrayList<>(actionsMap.keySet());
        for (int i = 0;i < actionNames.size();i++){
            sb.append(String.format("%d: %s%n", i+1, actionNames.get(i))); //
        }
        return sb.toString();
    }

    public void executeAction(int actionNumber) {
        int OutOfRageActionNumber = actionNumber - 1;
        if (OutOfRageActionNumber < 0 || OutOfRageActionNumber >= actionsMap.size()) {
            System.out.println("Ignoring menu choice: " + actionNumber);
        } else {
            List<Runnable> actions = new ArrayList<>(actionsMap.values());
            actions.get(OutOfRageActionNumber).run();
        }
    }

}
