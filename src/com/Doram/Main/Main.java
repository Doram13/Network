package com.Doram.Main;

import com.Doram.*;

public class Main {

    public static void main(String[] args) {
        Network network = createNetwork();
        for (int i = 0; i < 12 ; i++) {
            network.consumeForAMonth();
        }
    }



    private static Network createNetwork() {
        Network network = new Network();
        Normal normal1 = new Normal(1999, WithScreen.actualScreen.EDTV);
        Normal normal2 = new Normal(2005, WithScreen.actualScreen.UHD);
        Smart smart1 = new Smart("okos1", WithScreen.actualScreen.HD);
        Smart smart2 = new Smart("okos2", WithScreen.actualScreen.FULLHD);
        Connected connected1 = new Connected();
        Connected connected2 = new Connected();
        Connected connected3 = new Connected();
        Connected connected4 = new Connected();
        network.registerDevice(normal1);
        network.registerDevice(normal2);
        network.registerDevice(smart1);
        network.registerDevice(smart2);
        network.registerDevice(connected1);
        network.registerDevice(connected2);
        network.registerDevice(connected3);
        network.registerDevice(connected4);
        return network;
    }


}

// In a home Network there are multiple Device with multiple attributes and capabilities.
//There are 3 types of Device: Connected, Normal and Smart. There have to be at least 4 Connected Device on the Network at all times!
//The Network knows about all Device.
//Every Device has an age and a battery life which is set when they are manufactured.
//Smart and Normal Device have an actual screen size as well, while Connected Device know all other Connected Device on the Network.
//Smart has an additional name attribute which have to be unique (just dont write the same for 2), also they are able to collect the Normal Device which remainding power differs from theirs only by a given amount.
//Normal have an additional attribute as well, we know the year when they were manufactured.
//Also, all of them are able to calculate their own remainding power.
//This differs based on the Device:
//	Connected - loses 7 for every age, have 20 more for each Connected Device on the Network
//	Smart - loses 15 for every age, also loses a fix amount based on their screen size (EDTV - 5, HD - 10, FULL HD - 15, UHD - 20)
//	Normal - loses 3 for every age, if it was manufactored in 2000 or later it's power is doubled, if earlier it is halved
//Implement these classes and their methods using the OOP principles!


