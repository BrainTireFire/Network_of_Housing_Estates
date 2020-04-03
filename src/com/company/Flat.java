package com.company;

import java.time.LocalDate;
import java.util.List;

public class Flat extends Block{

    private int NumberOfFlat;
    private int VolumeOfFlat;
    private LocalDate DateOfRent;
    private LocalDate DateOfEndOfRental;


    public Flat(String Name, String Street, String idBlock, String idFlat) {
        super(Name, Street, idBlock, idFlat);
    }


}
