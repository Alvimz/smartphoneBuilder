package com.alvim.home.builder;

import com.alvim.home.products.Smartphone;

public class SmartphoneBuilder implements Builder{
    private String name;
    private MemoryStorage storage;
    private int ram;
    private String so;
    private int screenLenght;
    private boolean is5GSupported;
    private boolean isNFCSupported;
    private boolean isBiometricSupported;
    private boolean isDualSim;
    private int cameraMegaPixels;

    @Override
    public void addCamera(int megaPix) {
        this.cameraMegaPixels = megaPix;
    }

    @Override
    public void addDualSim() {
        this.isDualSim = true;
    }

    @Override
    public void addStorage(MemoryStorage memoryStorage) {
        this.storage = memoryStorage;
    }
    @Override
    public void addRam(int memory) {
        this.ram = memory;
    }

    @Override
    public void addSO(String so) {
        this.so = so;
    }

    @Override
    public void createScreen(int lenghtScreen) {
        this.screenLenght = lenghtScreen;
    }

    @Override
    public void add5GSupport() {
        this.is5GSupported = true;
    }

    @Override
    public void addNFC() {
        this.isNFCSupported = true;
    }

    @Override
    public void addBiometricSensor() {
        this.isBiometricSupported = true;
    }

    @Override
    public void addName(String name) {
        this.name = name;
    }
    public Smartphone getResult(){
        return new Smartphone(name,storage,ram,so,screenLenght,is5GSupported,isNFCSupported,
                isBiometricSupported,isDualSim,cameraMegaPixels);
    }
}
