package com.kodilla.testing.collection;
import java.util.*;

public class OddNumbersExterminator {

    public List<Integer> exterminate(List<Integer> numbers){
        List<Integer> listEven = new ArrayList<>();

    for (Integer a: numbers){
        if (a%2 == 0) {
            listEven.add(a);
        }
    }
    return listEven;
    }
}
