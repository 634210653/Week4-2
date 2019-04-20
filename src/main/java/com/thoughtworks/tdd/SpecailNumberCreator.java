package com.thoughtworks.tdd;

import java.util.*;

public class SpecailNumberCreator {

    /**
     * create three specail numbers.
     * @param maxNum
     * @return
     */
    public List<Integer> createSpecailNum(int maxNum,int need){

        Set<Integer> set = new HashSet<>();
        while (set.size()<need){
            set.add(new Random().nextInt(maxNum));
        }
        return  new LinkedList<>(set);
    }
}
