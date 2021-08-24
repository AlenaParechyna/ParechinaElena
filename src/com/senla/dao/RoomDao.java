package com.senla.dao;

import com.senla.api.dao.IRoomDao;
import com.senla.model.Guest;
import com.senla.model.Room;
import com.senla.model.RoomStatus;
import com.senla.service.GuestService;
import com.senla.util.SortedAs;
import com.senla.dao.GuestDao;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.senla.util.IdGenerator;


public class RoomDao extends AbstractDao<Room> implements IRoomDao {

    GuestDao guestDao = new GuestDao();
    GuestService guestService = new GuestService(guestDao);
   Room freeRoom = new Room();
    List<Room> roomArrayList = getRepository();
    SortedAs sortedAs = new SortedAs();


    {
        roomArrayList.add(new Room(IdGenerator.generateRoomId(), 0001, 2, RoomStatus.FREE, null, 15.5, 3));
        roomArrayList.add(new Room(IdGenerator.generateRoomId(), 0002, 4, RoomStatus.FREE,null, 25.5, 4));
        roomArrayList.add(new Room(IdGenerator.generateRoomId(), 0003, 2, RoomStatus.CLEANING, null, 20.5, 4));
        roomArrayList.add(new Room(IdGenerator.generateRoomId(), 0004, 1, RoomStatus.OCCUPIED, null, 10.5, 3));
        roomArrayList.add(new Room(IdGenerator.generateRoomId(), 0005, 3, RoomStatus.FREE, null, 23.5, 4));

    }

    public RoomDao() {
    }



    public void setFreeRoom(Room freeRoom) {


    }

    public Room getFreeRoom() {

        freeRoom = getAllFree().get(0);
        return freeRoom;

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
        System.out.println("Select a sort option:" + '\n' +
                "1. Price" +'\n' +
                "2. Capacity" +'\n' +
                "3. Stars");
        Scanner input = new Scanner(System.in);

        int i = input.nextInt();

        while (i!=1&&i!=2&&i!=3){

            System.out.println("Incorrect sort option, repeat");
            i = input.nextInt();
        }

        if (i==1){
            roomArrayList.sort(sortedAs.comparePrice);
        }
        if (i==2){
            roomArrayList.sort(sortedAs.compareCapacity);
        }
        if (i==3){
            roomArrayList.sort(sortedAs.compareStars);
        }

    }

    //сколько свободных номеров всего
    public Long howMuchFreeRoom() {
        ArrayList<Room> freeRooms = new ArrayList<>();
        for (int i = 0; i < roomArrayList.size(); i++) {
            if (roomArrayList.get(i).getStatus() == RoomStatus.FREE) {
                freeRooms.add(roomArrayList.get(i));
            }
        }
        return freeRooms.stream().count();


    }

    //цены номеров
    public void howPrice() {
        roomArrayList.sort(sortedAs.comparePrice);
        for (int i = 0; i < roomArrayList.size(); i++) {

            System.out.println("Цены комнат " + roomArrayList.get(i).getPriceRoom());
        }
    }




}






