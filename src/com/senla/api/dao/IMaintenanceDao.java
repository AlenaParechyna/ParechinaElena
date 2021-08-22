package com.senla.api.dao;

import com.senla.model.Maintenance;

import java.util.List;

public interface IMaintenanceDao extends IGenericDao<Maintenance>{

    List<Maintenance> sortAll();
}
