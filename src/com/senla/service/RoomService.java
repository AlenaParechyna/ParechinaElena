package com.senla.service;

import com.senla.api.dao.IGuestDao;
import com.senla.api.dao.IRoomDao;
import com.senla.api.service.IRoomService;
import com.senla.model.Guest;
import com.senla.model.Room;

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

    }

    @Override
    public void save(Room entity) {

    }

    @Override
    public Room getById(Long id) {
        return null;
    }

    @Override
    public List<Room> getAll() {
        return null;
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

    }
}
