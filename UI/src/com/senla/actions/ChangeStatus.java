package com.senla.actions;

import com.senla.dao.RoomDao;
import com.senla.model.Room;
import com.senla.model.RoomStatus;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Properties;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class ChangeStatus  {

    private static Logger logger = Logger.getLogger(ChangeStatus.class.getName());
    FileHandler fileHandler;
    Properties properties = new Properties();
    FileInputStream fileInputStream = new FileInputStream("C:/Users/user/IdeaProjects/Hotel/resources/config.properties");
    FileOutputStream fileOutputStream = new FileOutputStream("C:/Users/user/IdeaProjects/Hotel/resources/config.properties");

    public ChangeStatus() throws FileNotFoundException {
    }


    public void changeRoom() throws IOException {

        FileInputStream fileInputStream = new FileInputStream("C:/Users/user/IdeaProjects/Hotel/resources/config.properties");
        FileOutputStream fileOutputStream = new FileOutputStream("C:/Users/user/IdeaProjects/Hotel/resources/config.properties");
        properties.setProperty("com.senla.service.room.update.enable", "1");
        properties.store(fileOutputStream, "Root privileges. Set possible to change room status.");
        properties.load(fileInputStream);
        fileOutputStream.close();

        if (properties.getProperty("com.senla.service.room.update.enable").equals("1")) {

            Scanner input = new Scanner(System.in);
            System.out.println("Enter room ID");

            try {
                Integer id = input.nextInt();
                RoomDao roomDao = new RoomDao();
                Room changeRoom = roomDao.getById(id.longValue());
                System.out.println("Change room status: ");

                System.out.println("" +
                        "1. FREE" + '\n' +
                        "2. OCCUPIED" + '\n' +
                        "3. CLEANING" + '\n');

                Integer status = input.nextInt();

                while (status != 1 && status != 2 && status != 3) {

                    System.out.println("Make your choice");
                    status = input.nextInt();
                }

                if (status == 1) {
                    changeRoom.setStatus(RoomStatus.FREE);
                }
                if (status == 2) {
                    changeRoom.setStatus(RoomStatus.OCCUPIED);
                }
                if (status == 3) {
                    changeRoom.setStatus(RoomStatus.CLEANING);
                }

            } catch (NullPointerException e) {
                try {
                    fileHandler = new FileHandler("C:/Users/user/IdeaProjects/Hotel/src/com/senla/logging/myLogger.txt");
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
                System.err.println("That id not found");
                logger.setUseParentHandlers(false);
                logger.addHandler(fileHandler);
                logger.setLevel(Level.ALL);
                SimpleFormatter simpleFormatter = new SimpleFormatter();
                fileHandler.setFormatter(simpleFormatter);

                logger.log(Level.WARNING, "ID NOT FOUND");
                System.out.println("-----------");
            } catch (InputMismatchException i) {
                logger.log(Level.WARNING, "Incorrect data");
            }

        }
        else {
            System.out.println("Change of roomstatus is impossible");
        }
    }


}
