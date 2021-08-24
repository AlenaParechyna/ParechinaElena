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
    public Comparator<Room> comparePrice = Comparator.comparing(Room::getPriceRoom);
    // Сортировка по вместимости
    public Comparator<Room> compareCapacity = Comparator.comparing(Room::getCapacity);
    // Сортировка по количеству звезд
    public Comparator<Room> compareStars = Comparator.comparing(Room::getStars);
    // Сортировка по номеру комнаты
    public Comparator<Room> roomComparator = Comparator.comparing(Room::getNumber);
    // Сортировка по имени гостя
    public Comparator<Guest> compareName = Comparator.comparing(Guest::getName);

    public Comparator<Guest> compareId = Comparator.comparing(Guest::getId);
    // Сортировка по дате заселения
        public Comparator<Order> compareDate = Comparator.comparing(Order::getDateCheckIn);
    // Сортировка по цене услуг
    public Comparator<Maintenance> comparePriceMaintenance = Comparator.comparing(Maintenance::getPrice);
    // Сортировка по дате услуг
    public Comparator<Maintenance> compareDateMaintenance = Comparator.comparing(Maintenance::getDate);



    }


