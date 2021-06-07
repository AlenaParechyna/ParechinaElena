package com.senla.dao;

import com.senla.api.dao.IOrderDao;
import com.senla.api.dao.IRoomDao;
import com.senla.model.*;
import com.senla.dao.RoomDao;
import com.senla.util.SortedAs;
import com.sun.org.apache.xpath.internal.operations.Or;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class OrderDao extends AbstractDao<Order> implements IOrderDao {

    List<Order> orderList = getRepository();

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

    @Override
    public void howPrice() {

    }

    public void dateOut() {
        Order order = new Order();
        order.getDateCheckOut();

    }

    @Override
    public void showAllFree() {
        ArrayList<Room> freeToDate = new ArrayList<>();
        LocalDate freeTo = null;
        for (int i = 0; i < orderList.size(); i++) {

            if (freeTo.isAfter(orderList.get(i).getDateCheckOut())) {
            }
        }
        for (Room r : freeToDate
        ) {
            System.out.println("Свободные комнаты " + r);
        }
    }

    @Override
    public void howMuchMoney() {
        Guest changeGuest = null;
        for (int i = 0; i < orderList.size(); i++) {
            if (orderList.get(i).getGuest().getId().equals(changeGuest.getId())) {
                Double totalCost = orderList.get(i).getRoom().getPriceRoom() * orderList.get(i).getHowMuchDays();
                System.out.println("Всего за номер " + totalCost);
            }
        }
    }

    @Override
    public void whatGuest() {
        Room changeRoom = null;
        for (int i = orderList.size(); i > 3; i--) {
            if (orderList.get(i).getRoom().equals(changeRoom)) {
                Guest guest = orderList.get(i).getGuest();
                ArrayList<Guest> lastGuestArray = new ArrayList<>(3);
                lastGuestArray.add(guest);
                System.out.println("Последние 3 гостя " + guest);

            }
        }

    }

    public void whatMaintenance() {
        Guest changedGuest = null;
        SortedAs c = new SortedAs();
        for (int i = 0; i < orderList.size(); i++) {
            if (orderList.get(i).getGuest().getId().equals(changedGuest.getId())) {
                ArrayList<Maintenance> whatMaint = new ArrayList<>();
                whatMaint.add(orderList.get(i).getMaintenance().get(i));
                for (int j = 0; j < whatMaint.size(); j++) {
                    whatMaint.get(i).getPrice();
                }
                Double totalCost = whatMaint.get(i).getPrice();

                totalCost = totalCost++;

                whatMaint.sort(c.compPriceM);
                whatMaint.sort(c.compDateM);
            }
        }

    }

}




