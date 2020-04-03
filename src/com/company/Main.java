package com.company;

import java.time.LocalDate;
import java.util.*;

public class Main {

    public static void main(String[] args) {
       // List<Person> test = new LinkedList<Person>();
        Person per1 = new Person(1, "Maciej", "Kowslaki", 1251255, LocalDate.of(2000,10,12), "Witus", "MAgiczna", 2, 25);
       // test.add(person);
        per1.add(per1);
        Person per2 = new Person(1, "Maciejasd", "Koafssafi", 11231455, LocalDate.of(2000,10,12), "Wiasfsafs", "MAgiczna", 2, 25);
        per2.add(per2);




        new DrawMenu();
    }
}
