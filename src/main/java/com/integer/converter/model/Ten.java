package com.integer.converter.model;

public enum Ten {
    
    TWENTY("twenty"),
    THIRTY("thirty"),
    FORTY("forty"),
    FIFTY("fifty"),
    SIXTY("sixty"),
    SEVENTY("seventy"),
    EIGHTY("eighty"),
    NINETY("ninety");
    
    private String unitOFTen;
    
    private Ten(String t){
        unitOFTen = t;
    }
    
    public String getUnitTen(){
        return unitOFTen;
    }
    
}
