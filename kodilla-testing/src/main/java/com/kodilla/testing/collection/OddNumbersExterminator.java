package com.kodilla.testing.collection;
import java.util.*;

public class OddNumbersExterminator {
List<Integer> listEven = new ArrayList<>();
    public List<Integer> exterminate(List<Integer> numbers){
    for (Integer a: numbers){
        if (a%2 == 0) {
            listEven.add(a);
        }
    }
    return listEven;
    }
}
