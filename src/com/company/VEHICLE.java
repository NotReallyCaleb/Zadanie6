package com.company;

public class VEHICLE {
    String vehicle;
    ENGINE engine;
    SIZE size;
    COLOUR colour;

    public VEHICLE(String vehicle, ENGINE engine, SIZE size, COLOUR colour) {
        this.vehicle = vehicle;
        this.engine = engine;
        this.size = size;
        this.colour = colour;
    }
    @Override
    public String toString() {
        return "Brand: " + vehicle + "\nEngine: " + engine.engine + "\nSize: " + size.size + "\nColour: " + colour.colour;
    }

}
