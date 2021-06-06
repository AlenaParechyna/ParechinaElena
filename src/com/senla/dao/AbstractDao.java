package com.senla.dao;

import com.senla.api.dao.IGenericDao;
import com.senla.model.AEntity;
import com.senla.model.Room;


import java.util.*;
import java.util.Comparator;

public abstract class AbstractDao<T extends AEntity> implements IGenericDao<T> {

    private List<T> repository = new ArrayList<>();

    public void setRepository(List<T> repository) {
        this.repository = repository;
    }

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
        return null;
    }

    @Override
    public void delete(T entity) {

    }

    @Override
    public T update(T entity) {
        return null;
    }

    //показать весь репозиторий номера
    public void showAll() {
        for (T entity : repository
        ) {
            System.out.println(repository.toString());

        }
    }


}






