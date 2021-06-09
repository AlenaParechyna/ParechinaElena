package com.senla.api.dao;

import com.senla.model.Order;

public interface IOrderDao extends IGenericDao<Order>{

    void dateOut();

    void showAllFree();

    void howMuchMoney();

    void whatGuest();

    void whatMaintenance();

}
