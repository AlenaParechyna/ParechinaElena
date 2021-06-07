package com.senla.util;

import com.senla.dao.GuestDao;
import com.senla.model.Guest;
import com.senla.model.Maintenance;
import com.senla.model.Order;
import com.senla.model.Room;

import java.util.Comparator;
import java.util.Date;

public class SortedAs{

    // Сортировка по цене
    public Comparator<Room> compPrice = Comparator.comparing(Room::getPriceRoom);
    // Сортировка по вместимости
    public Comparator<Room> compCapasity = Comparator.comparing(Room::getCapacity);
    // Сортировка по количеству звезд
    public Comparator<Room> compStars = Comparator.comparing(Room::getStars);
    // Сортировка по номеру комнаты
    public Comparator<Room> roomComparator = Comparator.comparing(Room::getNumber);
    // Сортировка по имени гостя
    public Comparator<Guest> compName = Comparator.comparing(Guest::getName);
    // Сортировка по дате освобождения
    public Comparator<Order> compDate = Comparator.comparing(Order::getDateCheckOut);
    // Сортировка по цене услуг
    public Comparator<Maintenance> compPriceM = Comparator.comparing(Maintenance::getPrice);
    // Сортировка по дате услуг
    public Comparator<Maintenance> compDateM = Comparator.comparing(Maintenance::getDate);


    }


