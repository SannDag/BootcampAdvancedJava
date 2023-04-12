package com.openbootcamp.advancedJava.model;

public class BootcamperModel {
    private String name;
    private double value;
    public BootcamperModel(){
    };

    public BootcamperModel(String name, double value){
        this.name = name;
        this.value = value;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setValue(double value){
        this.value = value;
    }

    public double getValue(){
        return value;
    }
}
