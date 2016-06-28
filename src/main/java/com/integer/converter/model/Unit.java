package com.integer.converter.model;


public enum Unit {
    
    HUNDRED("hundred"), 
    THOUSAND("thousand"), 
    MILLION("million");
    
    private String unit;
    
    private Unit(String u){
        unit = u;
    }
    
    public String getUnit(){
        return unit;
    }
}
