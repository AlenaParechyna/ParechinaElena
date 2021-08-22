package com.senla.api.service;

import com.senla.api.dao.IGenericDao;
import com.senla.model.Maintenance;

import java.util.List;

public interface IMaintenanceService extends IGenericDao<Maintenance> {

    List<Maintenance> addMaintenance();





}
