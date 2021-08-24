package com.senla.menu;

import com.senla.actions.CheckIn;
import com.senla.actions.IAction;


import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Navigator {

    private static Logger logger = Logger.getLogger(Navigator.class.getName());


    private static Navigator instance;

    private Navigator(){};


    private Menu currentMenu;

    public static Navigator getInstance() {
        if (instance == null) {
            instance = new Navigator();
        }
            return instance;
        }

    public void setCurrentMenu(Menu currentMenu) {
        this.currentMenu = currentMenu;
    }

    public void printMenu() {

              System.out.println(currentMenu.toString());

            }

    public void navigate(Integer index){


            if (currentMenu != null) {
                MenuItem menuItem = currentMenu.getMenuItems().get(index);
                menuItem.doAction();
                currentMenu = menuItem.getNextMenu();

            }


}



}
