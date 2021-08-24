package com.senla.menu;

import java.util.Scanner;

public class MenuController {

    private static MenuController instance;
    private Builder builder = Builder.getInstance();
    private Navigator navigator = Navigator.getInstance();

    private MenuController() {
    }

    public static MenuController getInstance() {
        if (instance == null) {
            instance = new MenuController();
        }
        return instance;

    }

    public void run(){
        Scanner scanner = new Scanner(System.in);
        Integer index = -1;
        navigator.setCurrentMenu(builder.getRootMenu());
        navigator.printMenu();
        System.out.println("____________");

        while (index!=null){
           index = scanner.nextInt();
            navigator.navigate(index);

            navigator.printMenu();

        }
    }
}
