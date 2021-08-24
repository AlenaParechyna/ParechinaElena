package com.senla.menu;

import static com.senla.Hotel.roomDao;

public class Builder {

    private static Builder instance;
    private Menu rootMenu;
    public Menu printAction;

    private Builder(){

    }
    public static  Builder getInstance(){
      if (instance==null){
          instance = new Builder();
     }
        return instance;
    }

    public void buildMenu(){

    }


    public Menu getRootMenu(){
        rootMenu = new Menu();
        rootMenu.setName("ROOT");
        rootMenu.getMenuItems().add(0, new MenuItem("0.GUEST MENU", ()-> {}, getGuestMenu()));
        rootMenu.getMenuItems().add(1, new MenuItem("1.ROOM MENU", ()-> {}, getRoomMenu()));
        rootMenu.getMenuItems().add(2, new MenuItem("2.MAINTENANCE MENU", ()->{}, null));
        rootMenu.getMenuItems().add(3, new MenuItem("3.EXIT", ()->{},null));

        return rootMenu;
    }

    public Menu getRoomMenu(){
        Menu roomMenu = new Menu();
        roomMenu.setName("ROOM MENU");
        roomMenu.getMenuItems().add(0, new MenuItem("0.SHOW ALL ROOM", ()->{}, rootMenu));
        roomMenu.getMenuItems().add(1, new MenuItem("1.SHOW ONLY FREE", ()->{}, rootMenu));
        roomMenu.getMenuItems().add(2, new MenuItem("2.SORTED AS", ()->{},rootMenu ));
        roomMenu.getMenuItems().add(3, new MenuItem("3.RETURN TO MAIN MENU", ()->{}, rootMenu));
        roomMenu.getMenuItems().add(4, new MenuItem("4.CHANGE ROOM STATUS", ()->{}, rootMenu));

        return roomMenu;
    }

    public Menu getGuestMenu(){
        Menu guestMenu = new Menu();
        guestMenu.setName("GUEST MENU");
        guestMenu.getMenuItems().add(0, new MenuItem("0.SHOW ALL GUESTS", ()->{}, rootMenu));
        guestMenu.getMenuItems().add(1, new MenuItem("1.CHECK-IN NEW GUEST", ()->{}, rootMenu));
        guestMenu.getMenuItems().add(2, new MenuItem("2.RETURN TO MAIN MENU", ()->{}, rootMenu));


        return guestMenu;
    }



    }