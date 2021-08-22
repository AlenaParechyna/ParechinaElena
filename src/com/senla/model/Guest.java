package com.senla.model;

import com.senla.util.IdGenerator;

import java.util.List;

public class Guest extends AEntity {

    private Long id;
    private String name;
    private Integer age;

    public Guest() {

    }


    private List<Maintenance> guestMaintenance;


    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Guest{" + "id=" + getId() +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public void setId(Long id) {
        id = IdGenerator.generateGuestId();
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}


