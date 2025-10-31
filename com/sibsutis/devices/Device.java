package com.sibsutis.devices;

import com.sibsutis.Printable;

public abstract class Device implements Printable {
    protected int device;
    protected int price;
    protected String ip;

    public Device(int id, int price, String ip) {
        this.device = id;
        this.price = price;
        this.ip = ip;
    }

    public int split() {
        return device;
    }

    public abstract String getDeviceType();

    @Override
    public String sprint() {
        return String.format("Device{id=%d, price=%d, ip=%s, type=%s}", 
                           device, price, ip, getDeviceType());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Device other = (Device) obj;
        return device == other.device && price == other.price;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + device;
        result = 31 * result + price;
        result = 31 * result + (ip != null ? ip.hashCode() : 0);
        return result;
    }

    public int getDevice() { return device; }
    public int getPrice() { return price; }
    public String getIp() { return ip; }
}