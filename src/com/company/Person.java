package com.company;

import java.time.LocalDate;
import java.util.List;

public class Person implements MenuFunctions{

    private int idPerson;
    private String Name;
    private String Lastname;
    private int Pesel;
    private LocalDate DateBirth;
    private String HousingEstatesName;
    private String Street;
    private int BlockNumber;
    private int HouseNumber;

    public Person(){

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
    public void add(List li) {

    }

    @Override
    public void remove(List li) {

    }

    @Override
    public void search(List li) {

    }
}
