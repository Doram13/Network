package com.doram.network;

public class Normal extends WithScreen {
    private int manufactured;

    public Normal(int manufactured, actualScreen actualScreen) {
        super();
        this.manufactured = manufactured;
        this.screen = actualScreen;
        this.consumption = 3;
    }

    private void changeBatteryByManufactureYear() {
        if (this.manufactured >= 2000) {
            this.totalBattery *= 2;
        }
        else {
            this.totalBattery /= 2;
        }
        remainingPower = totalBattery;
    }

    public void connectNetwork() {
        changeBatteryByManufactureYear();
    }




}
