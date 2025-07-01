package com.alvim.home.builder;
import com.alvim.home.products.Smartphone;

public final class Director {

    /** iPhone 16 – especificação de referência */
    public Smartphone buildIphone16(SmartphoneBuilder b) {
        b.addName("iPhone 16");
        b.addStorage(MemoryStorage._528GB);        // GB
        b.addRam(8);              // GB
        b.addSO("iOS 18");
        b.createScreen(63);       // 6,3"
        b.add5GSupport();
        b.addNFC();
        b.addBiometricSensor();   // Face ID
        /* sem Dual SIM físico */
        b.addCamera(48);          // MP (principal)
        return b.getResult();
    }

    /** Poco 14 Pro – agressivo em custo-benefício */
    public Smartphone buildPoco14Pro(SmartphoneBuilder b) {
        b.addName("Poco 14 Pro");
        b.addStorage(MemoryStorage._528GB);
        b.addRam(12);
        b.addSO("HyperOS (Android 15)");
        b.createScreen(67);       // 6,7"
        b.add5GSupport();
        b.addNFC();
        b.addBiometricSensor();   // leitor lateral
        b.addDualSim();
        b.addCamera(200);
        return b.getResult();
    }

    /** Galaxy S23 Ultra – topo de linha tradicional */
    public Smartphone buildGalaxyS23Ultra(SmartphoneBuilder b) {
        b.addName("Galaxy S23 Ultra");
        b.addStorage(MemoryStorage._528GB);
        b.addRam(12);
        b.addSO("One UI 7 (Android 15)");
        b.createScreen(68);       // 6,8"
        b.add5GSupport();
        b.addNFC();
        b.addBiometricSensor();   // Ultrasonic FP + Face Unlock
        b.addDualSim();
        b.addCamera(200);
        return b.getResult();
    }

    /** Galaxy Z Flip 6 – dobrável compacto */
    public Smartphone buildGalaxyZFlip6(SmartphoneBuilder b) {
        b.addName("Galaxy Z Flip 6");
        b.addStorage(MemoryStorage._256GB);
        b.addRam(8);
        b.addSO("One UI 7 (Android 15)");
        b.createScreen(67);       // 6,7"
        b.add5GSupport();
        b.addNFC();
        b.addBiometricSensor();   // lateral
        b.addDualSim();
        b.addCamera(50);
        return b.getResult();
    }
}
