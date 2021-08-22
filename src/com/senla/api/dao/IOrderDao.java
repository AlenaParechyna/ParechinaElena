package com.senla.api.dao;

import com.senla.model.Guest;
import com.senla.model.Maintenance;
import com.senla.model.Order;
import com.senla.model.Room;

import java.time.LocalDate;
import java.util.List;

public interface IOrderDao extends IGenericDao<Order>{

    LocalDate dateOut();

    List <Room> showAllFree();

    Double howMuchMoney();

    List<Guest> whatGuest();

    List<Maintenance> whatMaintenance();

}
