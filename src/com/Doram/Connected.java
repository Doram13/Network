package com.Doram;

import java.util.ArrayList;
import java.util.List;

public class Connected extends Device {


    public Connected() {
        super();
        this.consumption = 7;
    }

    protected void incrementPowerPerConnected(int numberOfConnected) {
        this.totalBattery += 20*numberOfConnected;
        remainingPower = totalBattery;
    }

    public void connectNetwork(ConnectedDeviceCounter connectedConnectedCounter) {
        int numberOfConnected = connectedConnectedCounter.getNumberOfConnectedDevices();
        incrementPowerPerConnected(numberOfConnected);
    }
}
