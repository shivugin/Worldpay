package com.integer.converter.model;

public enum UtilWord {
    
    ZERO("zero"), 
    AND("and");
    
    private String word;
    
    private UtilWord(String w){
        word = w;
    }
    
    public String getWord() {
        return word;
    }
    
}