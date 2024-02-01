package org.wecancodeit;

public class Car extends Vehicle {

    public Car(int maxSpeed, int currentMilage, Manufactor manufactor, String model, BodyType bodyType, String color,
            FuelType fuleType) {
        super(maxSpeed, currentMilage, manufactor, model, bodyType, color, fuleType);
        
    }

    public int getCurrentDistance(){
        return 0;
    }

    @Override
    public int maxDistance() {
       return 0;
    }

    @Override
    public String vehicleType() {
       return this.getClass().getName();
    }

    @Override
    public void vehicleMaintance() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'vehicleMaintance'");
    }
    
}
