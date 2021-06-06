package com.senla.dao;

import com.senla.api.dao.IOrderDao;
import com.senla.api.dao.IRoomDao;
import com.senla.model.*;
import com.senla.dao.RoomDao;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class OrderDao extends AbstractDao<Order> implements IOrderDao {
    @Override
    public void setRepository(List repository) {
        super.setRepository(repository);
    }

    @Override
    public List getRepository() {
        return super.getRepository();
    }

    @Override
    public void save(Order order) {

    }

    @Override
    public Order getById(Long id) {
        return super.getById(id);
    }

    @Override
    public List getAll() {
       Order order = new Order(null, null, LocalDate.now(), 5L, null, null);
        order.setGuest(new Guest("Саня", 38));
        RoomDao roomDao = new RoomDao();
        order.setRoom((roomDao.freeRoom()));
        order.setDateCheckOut(LocalDate.now().plusDays(5L));
        System.out.println(order.toString());

        super.save(order);

        return super.getAll();
    }

    @Override
    public void delete(Order entity) {
        super.delete(entity);
    }

    @Override
    public Order update(Order entity) {
        return super.update(entity);
    }

    @Override
    public void showAll() {
        super.showAll();
    }
}
