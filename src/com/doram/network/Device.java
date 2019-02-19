package com.doram.network;

public abstract class Device {
    private int age;
    protected int totalBattery;
    protected int remainingPower;
    protected int consumption;

    Device() {
        age = 0;
        totalBattery = 100;

    }

    protected void consume() {
        this.remainingPower -= this.consumption;
        System.out.println("Total Battery was: " + this.totalBattery + ". Consumption is: " + consumption + ". New remainingPower is: " + this.remainingPower);
        this.age++;
    }
}
