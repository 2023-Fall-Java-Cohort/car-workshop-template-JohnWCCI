package org.wecancodeit;

import java.util.HashMap;
import java.util.Map;

public  class Garage {
    private int carCounter = 1;
    private Map<Integer,Vehicle> cars = new HashMap<>();


    public void buyVehicle(Vehicle vehicle){
        cars.put(carCounter++, vehicle);
    }

    public void sellVehicle(int vehicleId){
        cars.remove(vehicleId);
    }
}
