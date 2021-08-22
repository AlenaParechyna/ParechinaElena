package com.senla.service;

import com.senla.api.dao.IMaintenanceDao;
import com.senla.api.service.IMaintenanceService;
import com.senla.model.Guest;
import com.senla.model.Maintenance;

import java.util.ArrayList;
import java.util.List;

public class MaintenanceService implements IMaintenanceService {

    private final IMaintenanceDao maintenanceDao;

    public MaintenanceService(IMaintenanceDao maintenanceDao) {
        this.maintenanceDao = maintenanceDao;
    }

    @Override
    public List<Maintenance> addMaintenance() {

        Maintenance maintenance = new Maintenance();
    List<Maintenance> maintenanceList = new ArrayList<Maintenance>();
    maintenanceList.add(maintenance);
      return maintenanceList;
    }

    @Override
    public void save(Maintenance entity) {
        List<Maintenance> maintenances = maintenanceDao.getAll();
        for (int i = 0; i < maintenances.size(); i++) {
            if (maintenances.get(i).getId().equals(entity)) {
                maintenances.get(i).setPrice(15.5);
            }
        }

    }

    @Override
    public Maintenance getById(Long id) {
        return null;
    }

    @Override
    public List<Maintenance> getAll() {
        return null;
    }

    @Override
    public List<Maintenance> sortedAs() {
        return null;
    }

    @Override
    public void delete(Maintenance entity) {

    }

    @Override
    public Maintenance update(Maintenance entity) {
        return null;
    }
}
