package com.senla.dao;

import com.senla.api.dao.IGuestDao;
import com.senla.model.Guest;
import com.senla.util.SortedAs;

import java.util.ArrayList;
import java.util.List;


public class GuestDao extends AbstractDao<Guest> implements IGuestDao {


    public GuestDao() {
    }

    @Override
    public void setRepository(List<Guest> repository) {
        super.setRepository(repository);
    }

    @Override
    public void save(Guest entity) {
        getRepository().add(entity);
    }

    @Override
    public Guest getById(Long id) {
        return null;
    }

    @Override
    public List<Guest> getAll() {
        for (int i = 0; i < getRepository().size(); i++) {
            System.out.println(getRepository().get(i));
        }
        return super.getAll();
    }


    @Override
    public void sortedAs() {
        SortedAs sortedAs = new SortedAs();
        //sortedAs.compName;
    }
}



