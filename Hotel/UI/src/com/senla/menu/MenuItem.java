package com.senla.menu;

import com.senla.actions.ChangeStatus;
import com.senla.actions.CheckIn;
import com.senla.actions.IAction;
import com.senla.dao.GuestDao;
import com.senla.dao.RoomDao;
import com.senla.model.Guest;
import com.senla.model.Room;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MenuItem {

    private String title;
    private IAction iAction;
    private Menu nextMenu;

    private static Logger logger = Logger.getLogger(MenuItem.class.getName());
    FileHandler fileHandler;

    public MenuItem(String title, IAction iAction, Menu nextMenu) {
        this.title = title;
        this.iAction = iAction;
        this.nextMenu = nextMenu;
    }

    public void doAction() {

        try {


            if (title.equals("0.SHOW ALL ROOM")) {
                RoomDao rd = new RoomDao();
                for (Room r : rd.getAll()) {
                    System.out.println(r);
                }
            }

            if (title.equals("1.SHOW ONLY FREE")) {
                try {
                    RoomDao rd = new RoomDao();
                    for (Room r : rd.getAllFree()) {
                        System.out.println(r);

                    }
                    System.out.println('\n' + "TOTAL FREE ROOMS: " + rd.howMuchFreeRoom());
                } catch (NullPointerException e) {
                    System.out.println("NO FREE ROOMS");
                }
            }

            if (title.equals("2.SORTED AS")) {
                RoomDao rd = new RoomDao();
                rd.sortAs();
                for (Room r : rd.sortedAs()) {
                    System.out.println(r);
                }

            }

            if (title.equals("4.CHANGE ROOM STATUS")) {

                ChangeStatus changeStatus = new ChangeStatus();
                changeStatus.changeRoom();
            }


            if (title.equals("0.SHOW ALL GUESTS")) {
                GuestDao gd = new GuestDao();
                for (Guest g : gd.getAll()) {
                    System.out.println(g);
                }
            }

            if (title.equals("1.CHECK-IN NEW GUEST")) {
                CheckIn checkIn = new CheckIn();
                checkIn.chekInNewGuest();

            }

        }catch (IndexOutOfBoundsException | FileNotFoundException e){
           logger.log(Level.WARNING, "Incorrect value");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

public Menu getNextMenu(){
    return nextMenu;
}

    @Override
    public String toString() {
        return title;
    }
}

