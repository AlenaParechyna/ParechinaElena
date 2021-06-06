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

import java.lang.reflect.Array;

public class Hotel {

    private static final IGuestDao guestDao = new GuestDao();
    private static final IGuestService guestService = new GuestService(guestDao);


    private static final IRoomDao roomDao = new RoomDao();
    private static final IRoomService roomService = new RoomService(roomDao, guestDao);


    public static void main(String[] args) {

        SortedAs sortedAs = new SortedAs();

        Guest guest1 = guestService.addGuest("Вася", 30);
        Guest guest2 = guestService.addGuest("Игорь", 20);
        Guest guest3 = guestService.addGuest("Коля", 22);
        Guest guest4 = guestService.addGuest("Света", 25);

        OrderDao orderDao = new OrderDao();


        //guestDao.getAll();
        //System.out.println(  );
        //roomDao.showAll();
        //System.out.println();
        roomDao.showAllFree();
        System.out.println();
        //orderDao.getAll();
        roomDao.sortAs();





    }
}
