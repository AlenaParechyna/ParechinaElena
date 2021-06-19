package com.senla.dao;

import com.senla.api.dao.IRoomDao;
import com.senla.model.Guest;
import com.senla.model.Room;
import com.senla.model.RoomStatus;
import com.senla.util.SortedAs;

import java.util.ArrayList;
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

    public Room getFreeRoom() {
        return freeRoom;
    }
    public void setFreeRoom(Room freeRoom) {
        this.freeRoom = freeRoom;
    }

    public List<Room> getAllFree() { //показать только свободные комнаты

        ArrayList<Room> freeRooms = new ArrayList<>();
        for (int i = 0; i < roomArrayList.size(); i++) {

            if (roomArrayList.get(i).getStatus() == RoomStatus.FREE) {
                freeRooms.add(roomArrayList.get(i));
                setFreeRoom(roomArrayList.get(i));
            }
        }

        return freeRooms;
    }


    public void sortAs() {

        roomArrayList.sort(sortedAs.compareCapacity);



        }

    //сколько свободных номеров всего
    public Long howMuchFreeRoom() {
        ArrayList<Room> freeRooms = new ArrayList<>();
        for (int i = 0; i < roomArrayList.size(); i++) {
            if (roomArrayList.get(i).getStatus() == RoomStatus.FREE) {
                freeRooms.add(roomArrayList.get(i));
            }
        }return freeRooms.stream().count();


    }
    //цены номеров
    public void howPrice(){
        roomArrayList.sort(sortedAs.comparePrice);
        for (int i=0; i<roomArrayList.size(); i++){

            System.out.println("Цены комнат " + roomArrayList.get(i).getPriceRoom());
        }
    }


}






