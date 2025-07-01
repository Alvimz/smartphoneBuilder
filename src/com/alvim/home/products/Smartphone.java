package com.alvim.home.products;

import com.alvim.home.builder.MemoryStorage;

public class Smartphone {
    private final String name;
    private final MemoryStorage storage;
    private final int ram;
    private final String so;
    private final int screenLenght;
    private final boolean is5GSupported;
    private final boolean isNFCSupported;
    private final boolean isBiometricSupported;
    private final boolean isDualSim;
    private final int cameraMegaPixels;

    public Smartphone(String name, MemoryStorage storage, int ram,String so,int screenLenght,
                      boolean is5GSupported, boolean isNFCSupported,
                      boolean isBiometricSupported, boolean isDualSim, int cameraMegaPixels){
        this.name = name;
        this.ram = ram;
        this.so = so;
        this.storage = storage;
        this.screenLenght = screenLenght;
        this.is5GSupported = is5GSupported;
        this.isDualSim = isDualSim;
        this.isNFCSupported = isNFCSupported;
        this.isBiometricSupported = isBiometricSupported;
        this.cameraMegaPixels = cameraMegaPixels;
    }

    public String getName() {
        return name;
    }

    public MemoryStorage getStorage() {
        return storage;
    }

    public int getRam() {
        return ram;
    }

    public String getSo() {
        return so;
    }

    public int getScreenLenght() {
        return screenLenght;
    }

    public boolean isIs5GSupported() {
        return is5GSupported;
    }

    public boolean isNFCSupported() {
        return isNFCSupported;
    }

    public boolean isBiometricSupported() {
        return isBiometricSupported;
    }

    public boolean isDualSim() {
        return isDualSim;
    }

    public int getCameraMegaPixels() {
        return cameraMegaPixels;
    }

    @Override
    public String toString() {
        return "" + name + '\'' +
                ", storage=" + storage +
                ", ram=" + ram +
                ", so='" + so + '\'' +
                ", screenLenght=" + screenLenght +
                ", is5GSupported=" + is5GSupported +
                ", isNFCSupported=" + isNFCSupported +
                ", isBiometricSupported=" + isBiometricSupported +
                ", isDualSim=" + isDualSim +
                ", cameraMegaPixels=" + cameraMegaPixels +
                '}';
    }
}
