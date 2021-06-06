package com.senla.util;

import com.senla.model.Guest;
import com.senla.model.Room;

import java.util.Comparator;

public class SortedAs{

    //Сортировка по цене
    public Comparator<Room> compPrice = Comparator.comparing(Room::getPriceRoom);
    //    Сортировка по вместимости
    public Comparator<Room> compCapasity = Comparator.comparing(Room::getCapacity);
    // Сортировка по количеству звезд
    public Comparator<Room> compStars = Comparator.comparing(Room::getStars);
    //сортировка по номеру комнаты
    public Comparator<Room> roomComparator = Comparator.comparing(Room::getNumber);

    public Comparator<Guest> compName = Comparator.comparing(Guest::getName);

    }


