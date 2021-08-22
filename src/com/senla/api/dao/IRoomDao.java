package com.senla.api.dao;

import com.senla.model.Room;

import java.util.List;

public interface IRoomDao extends IGenericDao<Room> {

     List<Room> getAllFree();

     void sortAs();

     Long howMuchFreeRoom();




}
