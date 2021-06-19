package com.senla.dao;

import com.senla.api.dao.IMaintenanceDao;
import com.senla.model.Maintenance;
import com.senla.util.SortedAs;

import java.util.ArrayList;
import java.util.List;

public class MaintenanceDao extends AbstractDao <Maintenance> implements IMaintenanceDao {

List<Maintenance>maintenances = getRepository();
SortedAs sortedAs = new SortedAs();

    @Override
    public void save(Maintenance entity) {

    }

    @Override
    public void delete(Maintenance entity) {

    }

    @Override
    public Maintenance update(Maintenance entity) {
        return entity;
    }


    public void howPrice() {
        maintenances.sort(sortedAs.comparePriceMaintenance);
        for (int i=0; i<maintenances.size(); i++){

            System.out.println("Цены комнат " + maintenances.get(i).getPrice());
        }
    }



    @Override
    public List <Maintenance> sortAll() {
        List<Maintenance>maintenanceList = new ArrayList<>();
        SortedAs c = new SortedAs();

        maintenanceList.sort(c.compareDateMaintenance);
        maintenanceList.sort(c.comparePriceMaintenance);

        return maintenanceList;
    }
}
