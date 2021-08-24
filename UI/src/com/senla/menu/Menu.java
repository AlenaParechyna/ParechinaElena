package com.senla.menu;



import java.util.ArrayList;
import java.util.List;

public class Menu {

    private String name;

    @Override
    public String toString() {
        return name+'\n' + menuItems + '\n'
                ;
    }

    private List <MenuItem> menuItems= new ArrayList<>();

    public Menu(String name, List<MenuItem> menuItems) {
        this.name = name;
        this.menuItems = menuItems;
    }

    public Menu() {

    }


    public List<MenuItem> getMenuItems() {

        return menuItems;
    }

    public void setMenuItem(List<MenuItem> menuItem) {
        this.menuItems = menuItem;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addMenuItem(MenuItem item){
        menuItems.add(item);
    }


}
