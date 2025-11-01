package com.sibsutis.devices;

public class PersonalComputer extends Device {
    public PersonalComputer(int id, int price) {
        super(id, price, "");
    }

    public PersonalComputer(int id, int price, String ip) {
        super(id, price, ip);
    }

    @Override public String getDeviceType() {
        return "PersonalComputer";
    }

    public String print() {
        return "";
    }
    public boolean equals(PersonalComputer instance)
    {
        if (this.getID() == instance.getID() && 
            this.getPrice() == instance.getPrice() &&
            this.getIP() == instance.getIP())
        {
            return true;
        }

        return false;
    }

    public int hashCode()
    {
        return this.getID() + this.getPrice() + (this.getIP().hashCode() * 31);
    }
}
