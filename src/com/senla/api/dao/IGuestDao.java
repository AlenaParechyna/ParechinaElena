package com.senla.api.dao;

import com.senla.model.Guest;

import java.util.List;


public interface IGuestDao extends IGenericDao<Guest> {

     List<Guest> sortedAs();



}
