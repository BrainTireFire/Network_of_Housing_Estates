package com.company;

import java.time.LocalDate;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Person implements MenuFunctions<Person>{

    DrawMenu menu;
    private int idPerson;
    private String Name;
    private String Lastname;
    private int Pesel;
    private LocalDate DateBirth;
    private String HousingEstatesName;
    private String Street;
    private int BlockNumber;
    private int HouseNumber;
    static List<Person> listper = new LinkedList<Person>();

    public Person(){

    }

    @Override
    public String toString() {
        return  idPerson + " "+
                Name + " " +
                Lastname + " " +
                Pesel + " " +
                DateBirth + " " +
                HousingEstatesName + " " +
                Street + " " +
                BlockNumber + " " +
                HouseNumber + " ";
    }

    public Person(int idPerson, String Name, String Lastname, int Pesel, LocalDate DateBirth, String HousingEstatesName, String Street, int BlockNumber, int HouseNumber){
        this.idPerson = idPerson;
        this.Name = Name;
        this.Lastname = Lastname;
        this.Pesel = Pesel;
        this.DateBirth = DateBirth;
        this.HousingEstatesName = HousingEstatesName;
        this.Street = Street;
        this.BlockNumber = BlockNumber;
        this.HouseNumber = HouseNumber;
    }

    @Override
    public void add(Person e){
        listper.add(e);
    }

    public static void show(){
        for (Person e: listper) {
            System.out.println(listper);
        }
        System.out.println("Aby wrocic nacisnij 2");
    }




/*
    @Override
    public void add(List<Person> per) {
        Person e;
        per.add();
    }

    @Override
    public void remove(List<Person> per) {

    }

    @Override
    public void search(List<Person> per) {

    }
    */

}
