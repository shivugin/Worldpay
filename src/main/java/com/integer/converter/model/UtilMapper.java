package com.integer.converter.model;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class UtilMapper {

    public static LinkedHashMap<Integer,String> unitsMap = new LinkedHashMap<Integer,String>() {
        {
            put(1000000,Unit.MILLION.getUnit());
            put(1000,Unit.THOUSAND.getUnit());
            put(100,Unit.HUNDRED.getUnit());
        }
    };
    
    public static LinkedHashMap<Integer,String> numbersMap = new LinkedHashMap<Integer,String>()  {

        {

            List<String> cardinals =
                    Stream.of(Cardinal.values())
                            .map(Cardinal::getCardinal)
                            .collect(Collectors.toList());

            IntStream.range(0, cardinals.size())
                .forEach(i -> put(i + 1, cardinals.get(i)));

            List<String> tens =
                    Stream.of(Ten.values())
                            .map(Ten::getUnitTen)
                            .collect(Collectors.toList());
            
            IntStream.range(2, tens.size() + 2)
                    .forEach(i -> put(i * 10, tens.get(i - 2)));

            
        }

    };

}
