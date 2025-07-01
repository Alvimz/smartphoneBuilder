package com.alvim.home.builder;

public interface Builder {
    public void addCamera(int megaPix);
    public void addDualSim();
    public void addStorage(MemoryStorage memoryStorage); //enum aqui também
    public void addRam(int memory);
    public void addSO(String so); //enum aqui
    public void createScreen(int lenghtScreen);
    public void add5GSupport();
    public void addNFC();
    public void addBiometricSensor();
    public void addName(String name);

}
