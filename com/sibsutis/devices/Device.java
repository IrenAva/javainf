package com.sibsutis.devices;

import com.sibsutis.Printable;

public abstract class Device implements Printable {
    private int id;
    private int price;
    private String ip;

    public Device(int id, int price, String ip) {

    }

    public int getID(){
        return 0;
    }

    public int getPrice(){
        return 0;
    }

    public String getIP(){
        return "";
    }

    public String getDeviceType(){
        return "";
    }
}