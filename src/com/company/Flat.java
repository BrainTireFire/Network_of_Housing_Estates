package com.company;

import java.time.LocalDate;
import java.util.List;

public class Flat extends Block implements MenuFunctions{

    private int NumberOfFlat;
    private int VolumeOfFlat;
    private LocalDate DateOfRent;
    private LocalDate DateOfEndOfRental;


    public Flat(String Name, String Street, String idBlock, String idFlat) {
        super(Name, Street, idBlock, idFlat);
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
