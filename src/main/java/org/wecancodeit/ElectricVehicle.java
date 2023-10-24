package org.wecancodeit;

public class ElectricVehicle extends Vehicle {

    public ElectricVehicle(int maxSpeed, int currentMilage, Manufactor manufactor, String model, BodyType bodyType,
            String color, FuelType fuleType) {
        super(maxSpeed, currentMilage, manufactor, model, bodyType, color, fuleType);
       
    }

    @Override
    public int maxDistance() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'maxDistance'");
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
