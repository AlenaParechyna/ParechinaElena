package com.senla.api.service;

import com.senla.api.dao.IGenericDao;
import com.senla.model.Guest;
import com.senla.model.Room;
import com.senla.model.RoomStatus;

public interface IRoomService extends IGenericDao<Room> {


    void checkIn(Long guestId, Long RoomId);

    void evictGuest(Long guestId);




}
