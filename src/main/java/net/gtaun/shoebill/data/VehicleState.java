package net.gtaun.shoebill.data;

/**
 * Created by marvin on 02.05.15 in project shoebill-api.
 * Copyright (c) 2015 Marvin Haschker. All rights reserved.
 */
public class VehicleState {

    public int driver, passenger, backLeft, backRight;

    public VehicleState() {
    }

    public VehicleState(int driver, int passenger, int backLeft, int backRight) {
        this.driver = driver;
        this.passenger = passenger;
        this.backLeft = backLeft;
        this.backRight = backRight;
    }

    public int getDriver() {
        return driver;
    }

    public void setDriver(int driver) {
        this.driver = driver;
    }

    public int getPassenger() {
        return passenger;
    }

    public void setPassenger(int passenger) {
        this.passenger = passenger;
    }

    public int getBackLeft() {
        return backLeft;
    }

    public void setBackLeft(int backLeft) {
        this.backLeft = backLeft;
    }

    public int getBackRight() {
        return backRight;
    }

    public void setBackRight(int backRight) {
        this.backRight = backRight;
    }
}
