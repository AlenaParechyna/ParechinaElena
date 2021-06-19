package com.senla.dao;

import com.senla.api.dao.IOrderDao;
import com.senla.model.*;
import com.senla.util.SortedAs;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class OrderDao extends AbstractDao<Order> implements IOrderDao {

    List<Order> orderList = getRepository();


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
//        Order order = new Order(null, null, LocalDate.now(), 5L, null, null);
//        order.setGuest(new Guest("Саня", 38));
//        RoomDao roomDao = new RoomDao();
//        order.setRoom((roomDao.freeRoom()));
//        order.setDateCheckOut(LocalDate.now().plusDays(5L));
//        System.out.println(order.toString())
//
//        super.save(order);
//
        return super.getAll();
    }

    @Override
    public void delete(Order entity) {
        super.delete(entity);
    }

    @Override
    public Order update(Order entity) {
        for (int i = 0; i < orderList.size(); i++) {
            if (orderList.get(i).getId().equals(orderList.get(i).getId())) {
                orderList.get(i).setRoom(new Room());

            }

        }
        return super.update(entity);
    }

    @Override
    public LocalDate dateOut() {

    return dateOut();
    }

    public List <Room> showAllFree(){

            ArrayList<Room> freeToDate = new ArrayList<>();
            LocalDate freeTo = null;
            for (int i = 0; i < orderList.size(); i++) {

                if (freeTo.isAfter(orderList.get(i).getDateCheckIn().plusDays(orderList.get(i).getHowMuchDays()))) {
                }
            }
            for (Room r : freeToDate
            ) {
                System.out.println("Свободные комнаты " + r);
            }
            return freeToDate;
        }


        public Double howMuchMoney () {
            Guest changeGuest = null;
            for (int i = 0; i < orderList.size(); i++) {
                if (orderList.get(i).getGuest().getId().equals(changeGuest.getId())) {
                    Double totalCost = orderList.get(i).getRoom().getPriceRoom() * orderList.get(i).getHowMuchDays();
                    System.out.println("Всего за номер " + totalCost);
                }
            }
            return null;
        }

        @Override
        public List<Guest> whatGuest () {
            Room changeRoom = null;
            for (int i = orderList.size(); i > 3; i--) {
                if (orderList.get(i).getRoom().equals(changeRoom)) {
                    Guest guest = orderList.get(i).getGuest();
                    ArrayList<Guest> lastGuestArray = new ArrayList<>(3);
                    lastGuestArray.add(guest);
                    System.out.println("Последние 3 гостя " + guest);

                }
            }

            return null;
        }

        public List<Maintenance> whatMaintenance () {
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

                    whatMaint.sort(c.comparePriceMaintenance);
                    whatMaint.sort(c.compareDateMaintenance);
                }
            }

       return whatMaintenance();
        }

    }








