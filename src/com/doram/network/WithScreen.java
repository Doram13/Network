package com.doram.network;

public abstract class WithScreen extends Device {
    protected actualScreen screen;

    public  enum actualScreen {
        EDTV,
        HD,
        FULLHD,
        UHD
    }
}
