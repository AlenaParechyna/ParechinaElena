package com.senla;

import com.senla.menu.MenuController;
import org.apache.log4j.Appender;
import org.apache.log4j.PropertyConfigurator;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.FileHandler;
import java.util.logging.*;


public class Starter {

    private static Logger logger = Logger.getLogger(Starter.class.getName());



    public static void main(String[] args) throws IOException {

        Properties properties = new Properties();

        FileHandler fileHandler = new FileHandler("C:/Users/user/IdeaProjects/Hotel/src/com/senla/logging/myLogger.txt");

        SimpleFormatter formatter = new SimpleFormatter();
        fileHandler.setFormatter(formatter);

        System.out.println(" Welcome to Hotel ");
        System.out.println("------------------");


        MenuController.getInstance().run();



    }
}
