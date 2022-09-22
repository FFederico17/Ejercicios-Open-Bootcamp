package clases;

public class SmartDevice {

    protected String brand;
    protected String model;
    protected String color;
    protected String os;
    protected double displaySize;
    protected int battery;
    protected boolean waterproof;
    protected boolean quickCharge;


    public SmartDevice(){

    }


    public SmartDevice(String brand, String model, String color, String os, double displaySize, int battery, boolean waterproof, boolean quickCharge){
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.os = os;
        this.displaySize = displaySize;
        this.battery = battery;
        this.waterproof = waterproof;
        this.quickCharge = quickCharge;
    }


}


