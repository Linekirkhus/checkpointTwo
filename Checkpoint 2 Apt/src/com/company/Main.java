package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter rooms in the apartment: ");
        String rooms = scanner.nextLine();

        String[] mixStr = rooms.trim().split("&");

        Room[] aptRooms = new Room[mixStr.length];

        for (int i = 0; i < mixStr.length; i++) {
            String r = mixStr[i].trim();
            String[] roomNames = r.split(" ");

            Room aRoom = new Room(roomNames[0], Integer.parseInt(roomNames[1]), Integer.parseInt((roomNames[2])));
            aptRooms[i] = aRoom;
        }

        System.out.println("\nThis is the overview of your apartment: ");

        for (Room room : aptRooms) {
            room.printDescription();
        }
    }
}