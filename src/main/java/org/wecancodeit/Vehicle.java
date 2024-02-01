package org.wecancodeit;

import java.util.Random;

public abstract class Vehicle {
    private Random random = new Random(10);
    private int numberOfTires = 4;
    private int maxSpeed;
    private int currentMilage = 0;
    private Manufactor manufactor;
    private String model;
    private int price = 0;
    private BodyType bodyType = BodyType.SEDAN;
    private String color;
    private int currentDistance=0;


    
    
    public Vehicle(int maxSpeed, int currentMilage, Manufactor manufactor, String model,
            BodyType bodyType, String color, FuelType fuleType) {
        
        this.maxSpeed = maxSpeed;
        this.currentMilage = currentMilage;
        this.manufactor = manufactor;
        this.model = model;
        this.bodyType = bodyType;
        this.color = color;
        this.fuleType = fuleType;
        this.price = randomCost();
    }

    public int getCurrentDistance() {
        return currentDistance;
    }

    public void setCurrentDistance(int currentDistance) {
        this.currentDistance = currentDistance;
    }

    public void setNumberOfTires(int numberOfTires) {
        this.numberOfTires = numberOfTires;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }

    public void setDriving(boolean driving) {
        this.driving = driving;
    }

    public int getNumberOfTires() {
        return numberOfTires;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getCurrentMilage() {
        return currentMilage;
    }

    public Manufactor getManufactor() {
        return manufactor;
    }

    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public String getColor() {
        return color;
    }

    public boolean isRunning() {
        return running;
    }

    public FuelType getFuleType() {
        return fuleType;
    }

    public boolean isDriving() {
        return driving;
    }

    private boolean running = false;

    private FuelType fuleType;

    private boolean driving;

    public abstract int maxDistance();
    public abstract String vehicleType();
    public abstract void vehicleMaintance();

    private int randomCost() {
        int min = 3000;
        int max = 30000;
        int randomNumber = min + random.nextInt(max - min + 1);
        return randomNumber;
    }

}
