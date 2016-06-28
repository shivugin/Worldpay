package com.integer.converter;

import com.integer.converter.model.UtilWord;
import com.integer.converter.exception.IntegerOutOfRangeException;
import com.integer.converter.model.UtilMapper;

import java.util.Map;

public class BritishEnglish implements IntegerEnglish {
    
    public  String getWordsByInt(int number) throws IntegerOutOfRangeException {

        if (number < 0 || number > MAX_VALUE) {
            throw new IntegerOutOfRangeException("integer out of range");
        }
        
        if(number == 0) {
            return UtilWord.ZERO.getWord();
        }

        if (number > 0 && UtilMapper.numbersMap.containsKey(number)) {
            return UtilMapper.numbersMap.get(number);
        } else {

            for(Map.Entry<Integer,String> item: UtilMapper.unitsMap.entrySet()) {

                int mod = number % item.getKey();
                int div = number / item.getKey();
                if (div > 0) {
                    if (mod == 0) {
                        return getWordsByInt(div) + " " + item.getValue();
                    } else if (mod > 100) {
                        return getWordsByInt(div) + " " + item.getValue() + " " +  getWordsByInt(mod);
                    } else {
                        return getWordsByInt(div) + " " + item.getValue() + " " + UtilWord.AND.getWord() + " " + getWordsByInt(mod);
                    }
                }
            }
            return getWordsByInt(((number / 10) * 10)) + " "  + getWordsByInt(number % 10);
        }
    }
}
