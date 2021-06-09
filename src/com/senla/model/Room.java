package com.senla.model;

import java.util.List;

public class Room extends AEntity {

    private Integer number;
    private Integer capacity;
    private RoomStatus status;
    private Guest guests;
    private Double priceRoom;

    public Room() {

    }
    public Integer getStars() {
        return stars;
    }
    private Integer stars;
    public  RoomStatus roomStatus(){
        return null;
    }


    @Override
    public String toString() {
        return "Room{" +
                "number=" + number +
                ", capacity=" + capacity +
                ", status=" + status +
                ", guests=" + guests +
                ", priceRoom=" + priceRoom +
                ", stars=" + stars +
                '}';
    }

    public Room(Integer number, Integer capacity, RoomStatus status, Guest guests, Double priceRoom, Integer stars) {
        this.number = number;
        this.capacity = capacity;
        this.status = status;
        this.guests =  guests;
        this.priceRoom=priceRoom;
        this.stars=stars;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public RoomStatus getStatus() {
        return status;
    }

    public void setStatus(RoomStatus status) {
        this.status = status;
    }

    public Guest getGuests() {
        return guests;
    }

    public void setGuests(Guest guests) {
        this.guests = guests;
    }

    public Double getPriceRoom() {
         return priceRoom;
}


    }
