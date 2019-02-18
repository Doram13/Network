package com.Doram;

import java.util.ArrayList;
import java.util.List;

public class Network implements ConnectedDeviceCounter, NormalDeviceLister {
    List<Normal> normalList = new ArrayList<>();
    List<Connected> connectedList = new ArrayList<>();
    List<Smart> smartList = new ArrayList<>();

    @Override
    public int getNumberOfConnectedDevices() {
        return connectedList.size();
    }

    public void consumeForAMonth() {
        for (Normal normal: normalList) {
            normal.consume();
        }
        for (Smart smart: smartList) {
            smart.consume();
        }
        for (Connected connected: connectedList) {
            connected.consume();
        }
    }

    @Override
    public int getCollectedNormalDevices(int min, int max) {
        int numberOfCollectedNormals = 0;
        for (Normal oneNormal: normalList) {
            if (oneNormal.totalBattery > max || oneNormal.totalBattery < min) {
                numberOfCollectedNormals++;
            }
        }
        return numberOfCollectedNormals;
    }


    public void registerDevice(Device device) {
        if (device instanceof Normal) {
            Normal normal = (Normal) device;
            normalList.add(normal);
            normal.connectNetwork();
        }
        if (device instanceof Smart) {
            Smart smart = (Smart) device;
            smart.connectNetwork(this);
            smartList.add(smart);

        }
        if (device instanceof Connected) {
            Connected connected = (Connected) device;
            connectedList.add(connected);
            connected.connectNetwork(this);
        }
    }
}
