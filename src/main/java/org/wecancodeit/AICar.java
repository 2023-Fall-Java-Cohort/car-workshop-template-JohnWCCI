package org.wecancodeit;

public class AICar extends Vehicle {

    public AICar(int maxSpeed, int currentMilage, Manufactor manufactor, String model, BodyType bodyType, String color,
            FuelType fuleType) {
        super(maxSpeed, currentMilage, manufactor, model, bodyType, color, fuleType);
        //TODO Auto-generated constructor stub
    }

    @Override
    public int maxDistance() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'maxDistance'");
    }

    @Override
    public String vehicleType() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'vehicleType'");
    }

    @Override
    public void vehicleMaintance() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'vehicleMaintance'");
    }
    
}
