package com.integer.converter.model;

public enum Cardinal {

    ONE("one"),
    TWO("two"),
    THREE("three"),
    FOUR("four"),
    FIVE("five"),
    SIX("six"),
    SEVEN("seven"),
    EIGHT("eight"),
    NINE("nine"),
    TEN("ten"),
    ELEVEN("eleven"),
    TWELVE("twelve"),
    THIRTEEN("thirteen"),
    FOURTEEN("fourteen"),
    FIFTEEN("fifteen"),
    SIXTEEN("sixteen"),
    SEVENTEEN("seventeen"),
    EIGHTEEN("eighteen"),
    NINETEEN("nineteen");
    
    private String cardinal;
    
    private Cardinal(String c){
        cardinal = c;
    }
    
    public String getCardinal(){
        return cardinal;
    }
    
}
