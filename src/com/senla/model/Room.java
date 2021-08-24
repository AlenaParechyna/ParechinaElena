package com.senla.model;

import com.senla.util.IdGenerator;

import java.util.List;

public class Room extends AEntity {

    private Long id;
    private Integer number;
    private Integer capacity;
    private RoomStatus status;
    private Guest guest;
    private Double price;
    private Integer stars;
    private List<Maintenance>roomMaintenance;

    public Room() {

    }
    public Integer getStars() {
        return stars;
    }

    public  RoomStatus roomStatus(){
        return null;
    }


    @Override
    public String toString() {
        return "Room{" +
                "id="+ getId() +
                ", number=" + number +
                ", capacity=" + capacity +
                ", status=" + status +
                ", guests=" + guest +
                ", priceRoom=" + price +
                ", stars=" + stars +
                '}';
    }

    public Room(Long id, Integer number, Integer capacity, RoomStatus status, Guest guest, Double priceRoom, Integer stars) {
       this.id=id;
        this.number = number;
        this.capacity = capacity;
        this.status = status;
        this.guest =  guest;
        this.price=priceRoom;
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
        return guest;
    }

    public void setGuests(Guest guest) {
        this.guest = guest;
    }

    public Double getPriceRoom() {
         return price;
}




    @Override
    public void setId(Long id) {
       id = IdGenerator.generateRoomId();
       this.id = id;
    }

    @Override
    public Long getId() {
        return id;
    }
}
