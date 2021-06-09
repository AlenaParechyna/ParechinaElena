package com.senla.dao;

import com.senla.api.dao.IGuestDao;
import com.senla.model.Guest;
import com.senla.util.SortedAs;

import java.util.ArrayList;
import java.util.List;


public class GuestDao extends AbstractDao<Guest> implements IGuestDao {

    List<Guest> guestList = getRepository();


    public GuestDao() {
    }

    @Override
    public void setRepository(List<Guest> repository) {
        super.setRepository(repository);
    }

    @Override
    public void save(Guest entity) {
       guestList.add(entity);
    }

    @Override
    public Guest getById(Long id) {
        return null;
    }

    @Override
    public List<Guest> getAll() {
        for (int i = 0; i < guestList.size(); i++) {
            System.out.println(guestList.get(i));
        }
        return super.getAll();
    }

    @Override
    public void howPrice() {

    }


    @Override
    public void sortedAs() {

    }

    public void howMuchGuest(){
        for (int i = 0; i < guestList.size(); i++) {

            System.out.println( "Всего гостей " + guestList.stream().count());
        }
    }



}



