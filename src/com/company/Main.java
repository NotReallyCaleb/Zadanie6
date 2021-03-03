package com.company;

public class Main {

    public static void main(String[] args) {
        VEHICLE VEH = new VEHICLE("Tesla Model S", new ENGINE("615 kW AC induction motor"), new SIZE(5), new COLOUR("White"));
        System.out.println(VEH);
    }
}
