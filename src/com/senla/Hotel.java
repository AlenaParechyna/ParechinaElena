package com.senla;

import com.senla.api.dao.IGuestDao;
import com.senla.api.dao.IRoomDao;
import com.senla.api.service.IGuestService;
import com.senla.api.service.IRoomService;
import com.senla.dao.GuestDao;
import com.senla.dao.OrderDao;
import com.senla.dao.RoomDao;
import com.senla.model.Guest;
import com.senla.model.Order;
import com.senla.model.Room;
import com.senla.model.RoomStatus;
import com.senla.service.GuestService;
import com.senla.service.RoomService;
import com.senla.util.SortedAs;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.logging.Logger;

public class Hotel {

    private static Logger logger = Logger.getLogger(Hotel.class.getName());




    private static final IGuestDao guestDao = new GuestDao();
    private static final IGuestService guestService = new GuestService(guestDao);


    public static final IRoomDao roomDao = new RoomDao();
    private static final IRoomService roomService = new RoomService(roomDao, guestDao);


    public static void main(String[] args) {


        System.out.println(guestDao.getAll());
        System.out.println(roomDao.getAll());



/*
        Room r = roomDao.getAllFree().stream().findFirst().get();
            r.setGuests(guest1);
            r.setStatus(RoomStatus.OCCUPIED);
            System.out.println(r.getId());
            System.out.println(r.toString());*/

            roomService.checkIn(4L, 2L);

        }




    }

