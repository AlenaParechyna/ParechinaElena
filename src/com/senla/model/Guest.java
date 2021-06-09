package com.senla.model;

import com.senla.util.IdGenerator;

public class Guest extends AEntity {

    public String getName() {
        return name;
    }

    private String name;
    private Integer age;
    private Long id;

    public Guest(String name, Integer age) {
        this.name = name;
        this.age = age;
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


