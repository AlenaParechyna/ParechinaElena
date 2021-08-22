package com.senla.dao;

import com.senla.api.dao.IGenericDao;
import com.senla.model.AEntity;


import java.util.*;

public abstract class AbstractDao<T extends AEntity> implements IGenericDao<T> {

    private List<T> repository = new ArrayList<>();



    public List<T> getRepository() {
        return repository;
    }


    @Override
    public void save(T entity) {
        repository.add(entity);
    }

    @Override
    public T getById(Long id) {
        for (T entity : repository
        ) {
            if (id.equals(entity.getId())) {
                return entity;
            }
        }
        return null;
    }

    @Override

    public List<T> getAll() {

        for (int i =0; i<repository.size(); i++){



        }
        return repository;

    }

    @Override

    public List<T> sortedAs() {

        return repository;
    }

    //поменяла
    @Override
    public void delete(T entity) {
        for (int i = 0; i < repository.size(); i++) {
            if (entity.getId().equals(repository.get(i).getId())) {
                repository.remove(i);

            }
        }
    }

    @Override
    public T update(T entity) {
        return entity;
            }
}















