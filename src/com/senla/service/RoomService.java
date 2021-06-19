package com.senla.service;

import com.senla.api.dao.IGuestDao;
import com.senla.api.dao.IRoomDao;
import com.senla.api.service.IRoomService;
import com.senla.dao.RoomDao;
import com.senla.model.Guest;
import com.senla.model.Room;
import com.senla.model.RoomStatus;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RoomService implements IRoomService {

    private final IRoomDao roomDao;
    private final IGuestDao guestDao;

    public RoomService(IRoomDao roomDao, IGuestDao guestDao) {
        this.roomDao = roomDao;
        this.guestDao = guestDao;
    }


    @Override
    public void checkIn(Long guestId, Long roomId) {

        Room room = roomDao.getById(roomId);
        Guest guest = guestDao.getById(guestId);
        room.getGuests();

    }

    @Override
    public void evictGuest(Long guestId) {
        List<Room> allRooms = roomDao.getAll();
        for (int i = 0; i < allRooms.size(); i++) {
            if (allRooms.get(i).getGuests().getId().equals(guestId)) {
                allRooms.get(i).setStatus(RoomStatus.FREE);

            }

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
    public Room update(Room entity) {
        List<Room> allRooms = roomDao.getAll();
        for (int i = 0; i < allRooms.size(); i++) {
            if (entity.getId().equals(allRooms.get(i).getId())) {
                allRooms.get(i).setStatus(RoomStatus.CLEANING);

            }

        }
        return entity;
    }
}

