package com.senla.dao;

import com.senla.api.dao.IRoomDao;
import com.senla.model.Guest;
import com.senla.model.Room;
import com.senla.model.RoomStatus;
import com.senla.util.SortedAs;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RoomDao extends AbstractDao<Room> implements IRoomDao {

    Room freeRoom = new Room();
    List<Room> roomArrayList = getRepository();
    SortedAs sortedAs = new SortedAs();

    {
        roomArrayList.add(new Room(0001, 2, RoomStatus.FREE, new Guest(null, 0), 15.5, 3));
        roomArrayList.add(new Room(0002, 4, RoomStatus.FREE, new Guest(null, 0), 25.5, 4));
        roomArrayList.add(new Room(0003, 2, RoomStatus.CLEANING, new Guest(null, 0), 20.5, 4));
        roomArrayList.add(new Room(0004, 1, RoomStatus.OCCUPIED, new Guest(null, 0), 10.5, 3));
        roomArrayList.add(new Room(0005, 3, RoomStatus.FREE, new Guest(null, 0), 23.5, 4));
    }

    public RoomDao() {
    }

    @Override

    public void save(Room entity) {
        roomArrayList.add(new Room());

    }

    @Override
    public List<Room> getAll() {

        return roomArrayList;
    }

    @Override
    public void delete(Room entity) {

    }

    @Override
    public Room update(Room entity) {
        return null;
    }

    @Override
    public void showAll() {

        for (int i = 0; i < roomArrayList.size(); i++) {
            System.out.println(roomArrayList.get(i).toString());
        }

    }
    public Room getFreeRoom() {
        return freeRoom;
    }
    public void setFreeRoom(Room freeRoom) {
        this.freeRoom = freeRoom;
    }
    public void showAllFree() { //показать только свободные комнаты

        ArrayList<Room> freeRooms = new ArrayList<>();
        for (int i = 0; i < roomArrayList.size(); i++) {

            if (roomArrayList.get(i).getStatus() == RoomStatus.FREE) {
                freeRooms.add(roomArrayList.get(i));
                setFreeRoom(roomArrayList.get(i));
            }
        }
        for (int i = 0; i < freeRooms.size(); i++) {

            System.out.println("Free rooms is number: " + freeRooms.get(i).getNumber());
        }
    }

    public Room freeRoom() {
        ArrayList<Room> freeRooms = new ArrayList<>();
        for (int i = 0; i < roomArrayList.size(); i++) {

            if (roomArrayList.get(i).getStatus() == RoomStatus.FREE) {
                freeRooms.add(roomArrayList.get(i));
                freeRoom = roomArrayList.get(i);
            }
        }
        return freeRoom;
    }

    public void sortAs() {

        roomArrayList.sort(sortedAs.compCapasity);
        for (int i = 0; i < roomArrayList.size(); i++) {
            System.out.println(roomArrayList.get(i));

        }
    }
    //сколько свободных номеров всего
    public void howMuchFreeRoom() {
        ArrayList<Room> freeRooms = new ArrayList<>();
        for (int i = 0; i < roomArrayList.size(); i++) {
            if (roomArrayList.get(i).getStatus() == RoomStatus.FREE) {
                freeRooms.add(roomArrayList.get(i));
            }
        }
        System.out.println("Всего свободных номеров " + freeRooms.stream().count());

    }
    //цены номеров
    public void howPrice(){
        roomArrayList.sort(sortedAs.compPrice);
        for (int i=0; i<roomArrayList.size(); i++){

            System.out.println("Цены комнат " + roomArrayList.get(i).getPriceRoom());
        }
    }


}






