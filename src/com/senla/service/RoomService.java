package com.senla.service;

import com.senla.api.dao.IGuestDao;
import com.senla.api.dao.IOrderDao;
import com.senla.api.service.IOrderService;
import com.senla.api.dao.IRoomDao;
import com.senla.api.service.IRoomService;
import com.senla.model.Guest;
import com.senla.model.Room;
import com.senla.model.RoomStatus;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RoomService implements IRoomService {

    private final IRoomDao roomDao;
    private final IGuestDao guestDao;
    private static final Logger LOGGER = Logger.getLogger(RoomService.class.getName());
    Properties properties = new Properties();


    public RoomService(IRoomDao roomDao, IGuestDao guestDao) {


        this.roomDao = roomDao;
        this.guestDao = guestDao;
    }


    @Override
    public void checkIn(Long guestId, Long roomId) {

        try {

            LOGGER.log(Level.INFO, String.format("CheckIn guest %s, to room %s", guestId, roomId));

        Room room = roomDao.getById(roomId);
        Guest guest = guestDao.getById(guestId);
        room.getGuests();
    }
        catch (NumberFormatException e){
            System.out.println("Некорректный ввод");
        }
        catch (NullPointerException e){
            System.out.println("This is your bug!");
        }


    }

    @Override
    public void evictGuest(Long guestId) {
        try {
            LOGGER.log(Level.INFO, String.format("Enter guestID %s", guestId));
            List<Room> allRooms = roomDao.getAll();
            for (int i = 0; i < allRooms.size(); i++) {
                if (allRooms.get(i).getGuests().getId().equals(guestId)) {
                    allRooms.get(i).setStatus(RoomStatus.FREE);

                }
        }

        }catch (NumberFormatException e){
            System.out.println("Некорректный ввод");
        }

    }

    @Override
    public void save(Room entity) {
        List<Room> allRooms = roomDao.getAll();
        for (int i = 0; i < allRooms.size(); i++) {
            if (allRooms.get(i).getId().equals(entity)) {
                allRooms.get(i).setGuests(new Guest());
            }
        }

    }

    @Override
    public Room getById(Long id) {
        return roomDao.getById(id);
    }

    @Override
    public List<Room> getAll() {
        return roomDao.getAll();
    }

    @Override
    public List<Room> sortedAs() {
        return roomDao.sortedAs();
    }

    @Override
    public void delete(Room entity) {
        List<Room> allRooms = roomDao.getAll();
        for (int i = 0; i < allRooms.size(); i++) {
            if (entity.getId().equals(allRooms.get(i).getId())) {
                allRooms.remove(i);

            }
        }
    }

    @Override
    public Room update(Room entity) throws IOException {



            List<Room> allRooms = roomDao.getAll();
            for (int i = 0; i < allRooms.size(); i++) {
                if (entity.getId().equals(allRooms.get(i).getId())) {
                    allRooms.get(i).setStatus(RoomStatus.CLEANING);

                }

            }

        return entity;
    }
}

