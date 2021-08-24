package com.senla.actions;

import com.senla.dao.RoomDao;
import com.senla.model.Guest;
import com.senla.model.Room;
import com.senla.model.RoomStatus;
import com.senla.Starter;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.*;


public class CheckIn  {

    private static Logger logger = Logger.getLogger(CheckIn.class.getName());
    FileHandler fileHandler;

    public void chekInNewGuest() {

        try {

            Scanner input = new Scanner(System.in);
            Guest guest = new Guest();
            System.out.println("Enter Guest name");
            String guestName = input.nextLine();
            guest.setName(guestName);
            System.out.println("Enter Guest age");
            Integer guestAge = input.nextInt();
            guest.setAge(guestAge);


            RoomDao roomDao = new RoomDao();

            Room room = roomDao.getFreeRoom();
            room.setGuests(guest);
            room.setStatus(RoomStatus.OCCUPIED);


            System.out.println("Guest chek-in successfully in room " + room.getNumber());


        }

        catch (InputMismatchException e) {
            try {
                fileHandler = new FileHandler("C:/Users/user/IdeaProjects/Hotel/src/com/senla/logging/myLogger.txt");
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
            System.err.println("Enter correct age");
            logger.setUseParentHandlers(false);
            logger.addHandler(fileHandler);
            logger.setLevel(Level.ALL);
            SimpleFormatter simpleFormatter = new SimpleFormatter();
            fileHandler.setFormatter(simpleFormatter);

            logger.log(Level.WARNING, "User entering incorrect data");

            System.out.println("---------");
        }

    }

}
