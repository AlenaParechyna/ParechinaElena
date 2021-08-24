package com.senla.service;

import com.senla.api.dao.IGuestDao;
import com.senla.api.service.IGuestService;
import com.senla.model.Guest;
import com.senla.util.IdGenerator;

public class GuestService implements IGuestService {

    private final IGuestDao guestDao;

    public GuestService(IGuestDao guestDao) {
        this.guestDao = guestDao;
    }


    @Override
    public Guest addGuest(Long id, String name, Integer age) {
        Guest guest = new Guest(id, name, age);
        guest.setId(IdGenerator.generateGuestId());
        guestDao.save(guest);
        return guest;
    }
}
