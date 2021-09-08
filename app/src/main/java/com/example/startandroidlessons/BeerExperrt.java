package com.example.startandroidlessons;

import java.util.ArrayList;
import java.util.List;

public class BeerExperrt {

    List<String> getBrands(String color) {
        List<String> brands = new ArrayList<>();
        if (color.equals("amber")) {
            brands.add("Jack Amber");
            brands.add("Red Moose");
        } else if (color.equals("light")){
            brands.add("Heeei heei");
            brands.add("Dummy");
        }
        return brands;
    }
}
