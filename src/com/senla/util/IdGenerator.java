package com.senla.util;

public class IdGenerator {

    private static Long guestId =1L;
    private static Long roomId = 1L;
    private static Long maintenanceId = 0L;
    private static Long orderId=0L;

    public static Long generateGuestId(){
        return guestId++;
    }

    public static Long generateRoomId(){
        return roomId++;
    }

    public static Long generateMaintenanceId (){
        return maintenanceId++;
    }

    public static Long generateOrderID(){
        return orderId+1;
    }
}
