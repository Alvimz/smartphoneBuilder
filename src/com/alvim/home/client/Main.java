package com.alvim.home.client;

import com.alvim.home.builder.Builder;
import com.alvim.home.builder.Director;
import com.alvim.home.builder.SmartphoneBuilder;
import com.alvim.home.products.Smartphone;

public class Main {
    public static void main(String[] args) {
        SmartphoneBuilder smartphoneBuilder = new SmartphoneBuilder();
        Director director = new Director();

        director.buildGalaxyS23Ultra(smartphoneBuilder);
        Smartphone galaxyS23 = smartphoneBuilder.getResult();
        director.buildPoco14Pro(smartphoneBuilder);
        Smartphone poco14PRO = smartphoneBuilder.getResult();
        System.out.println(galaxyS23);
        System.out.println(poco14PRO);
    }
}
