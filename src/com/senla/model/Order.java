package com.senla.model;

import com.senla.dao.RoomDao;

import java.time.Instant;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.stream.Stream;

public class Order extends AEntity {

    Calendar c = Calendar.getInstance();
    Guest guest;
    Room room;
    LocalDate dateCheckIn;
    Long howMuchDays;
    LocalDate dateCheckOut;
    Maintenance[] maintenance = new Maintenance[10];

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
        return dateCheckIn;
    }

    public void setDateCheckIn(LocalDate dateCheckIn) {
        this.dateCheckIn = dateCheckIn;
    }

    public Long getHowMuchDays() {
        return howMuchDays;
    }

    public void setHowMuchDays(Long howMuchDays) {
        this.howMuchDays = howMuchDays;
    }

    public LocalDate getDateCheckOut() {

        return dateCheckOut;
    }

    public void setDateCheckOut(LocalDate dateCheckOut) {
        dateCheckOut = dateCheckIn.plusDays(howMuchDays);
        this.dateCheckOut = dateCheckOut;
    }

    public Maintenance[] getMaintenance() {
        return maintenance;
    }

    public void setMaintenance(Maintenance[] maintenance) {
        this.maintenance = maintenance;
    }

    public Order(Guest guest, Room room, LocalDate dateCheckIn, Long howMuchDays, LocalDate dateCheckOut, Maintenance[] maintenance) {
        this.guest = guest;
        this.room = room;
        this.dateCheckIn = dateCheckIn;
        this.howMuchDays = howMuchDays;
        this.dateCheckOut = dateCheckOut;
        this.maintenance = maintenance;
    }

    @Override
    public String toString() {
        return "Order{" +
                "guest=" + guest +
                ", room=" + room +
                ", dateCheckIn=" + dateCheckIn +
                ", howMuchDays=" + howMuchDays +
                ", dateCheckOut=" + dateCheckOut +
                '}';
    }
}
