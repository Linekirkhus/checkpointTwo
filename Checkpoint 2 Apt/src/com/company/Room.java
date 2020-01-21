package com.company;

public class Room {

    private String name;
    private int width;
    private int length;


    public Room(String name, int width, int length) {
        this.name = name;
        this.width = width;
        this.length = length;
    }

    public void printDescription() {
        System.out.println("\nRoom: " + this.name);
        System.out.println("Width and Length: " + this.width + "m" + " x " + this.length + "m");
        System.out.println("Area: " + this.width * this.length + "m2 ");

    }
}
