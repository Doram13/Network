package com.Doram;

import java.util.ArrayList;
import java.util.List;

public class Smart extends WithScreen {
    private String name;
    List<Normal> collectedNormals = new ArrayList<>();


    public Smart(String name, actualScreen actualScreen) {
        super();
        this.name = name;
        this.screen = actualScreen;
        remainingPower = totalBattery;
        System.out.println("I'm " + name + " .my total capacity is: " + totalBattery);
    }



    private void incrementConsumptionByScreen() {
        int incrementConsumptionBy;
        switch (this.screen) {
            case EDTV: incrementConsumptionBy = 4;
            break;
            case HD: incrementConsumptionBy = 10;
            break;
            case FULLHD: incrementConsumptionBy = 15;
            break;
            case UHD: incrementConsumptionBy = 20;
            break;
            default:
                incrementConsumptionBy = 0;
                System.out.println("This message should never be seen! Smart.incrementConsumptionByScreen() error");

        }
        this.consumption += incrementConsumptionBy;
    }

    public void connectNetwork(NormalDeviceLister getCollectedNormalDevices) {
        incrementConsumptionByScreen();
        int numberOfCollected = getCollectedNormalDevices.getCollectedNormalDevices(totalBattery-5, totalBattery+5);
        System.out.println("The number of collected Normal devices are: " + numberOfCollected);
    }


}
