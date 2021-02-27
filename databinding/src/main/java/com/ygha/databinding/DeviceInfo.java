package com.ygha.databinding;

public class DeviceInfo {
    public boolean value;
    public int eneryConsumption;

    public DeviceInfo(boolean value, int eneryConsumption) {
        this.value = value;
        this.eneryConsumption = eneryConsumption;
    }

    public boolean getValue() {
        return value;
    }

    public void setValue(boolean value) {
        this.value = value;
    }

    public int getEneryConsumption() {
        return eneryConsumption;
    }

    public void setEneryConsumption(int eneryConsumption) {
        this.eneryConsumption = eneryConsumption;
    }
}
