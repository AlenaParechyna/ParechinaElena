package com.senla.dao;

import com.senla.api.dao.IGuestDao;
import com.senla.model.Guest;
import com.senla.util.SortedAs;

import java.util.List;
import java.util.Scanner;


public class GuestDao extends AbstractDao<Guest> implements IGuestDao {

    List<Guest> guestList = getRepository();
    SortedAs comp = new SortedAs();


    public GuestDao() {
    }


    @Override
    public void save(Guest entity) {
       super.save(entity);
    }

    //поменяла
    @Override
    public Guest getById(Long id) {
        return super.getById(id);
    }

    //поменяла
    @Override
    public List<Guest> getAll() {
        return super.getAll();
    }

//поменяла
    @Override
    public List<Guest> sortedAs() {
        Scanner scanner = new Scanner(System.in);

        int index = -1;
        index = scanner.nextInt();
        switch (index) {
            case (0):
                guestList.sort(comp.compareName);
        break;
            case (1):
                guestList.sort(comp.compareId);
                break;
            case (2):
                guestList.sort(comp.compareName.reversed());
        }
        return guestList;
    }

    public void howMuchGuest(){
        for (int i = 0; i < guestList.size(); i++) {

            System.out.println( "Всего гостей " + guestList.stream().count());
        }
    }



}



