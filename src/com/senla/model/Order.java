package com.senla.model;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Order extends AEntity {

    Guest guest;
    Room room;
    LocalDate checkIn;
    LocalDate checkOut;


    List<Maintenance> maintenance = new ArrayList<Maintenance>() {
    };

    public List<Maintenance> getMaintenance() {
        return maintenance;
    }


    public Order() {

    }

    public Order(Guest guest, Room room, LocalDate checkIn, LocalDate checkOut, List<Maintenance> maintenance) {
        this.guest = guest;
        this.room = room;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.maintenance = maintenance;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public LocalDate getDateCheckIn() {
        return checkIn;
    }

    public Long howDays(){
        Long days = ChronoUnit.DAYS.between(checkIn, checkOut);
        return days;
    }


    @Override
    public String toString() {
        return "Order{" +
                "guest=" + guest +
                ", room=" + room +
                ", dateCheckIn=" + checkIn +
                ", howMuchDays=" + howDays()
                +
                '}';
    }
}
