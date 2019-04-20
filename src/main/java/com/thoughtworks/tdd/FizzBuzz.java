package com.thoughtworks.tdd;

import java.util.*;

/***
 * author:LP
 * time:2019.04.20
 */
public class FizzBuzz {

    //singleton
    private static  FizzBuzz _ins = null;
    public  static  FizzBuzz getInstance(){
        if(_ins == null){
            _ins = new FizzBuzz();
        }
        return  _ins;
    }

    /**
     * wether a is the times of b.
     * @param numA
     * @param numB
     * @return
     */
    public  boolean isTimes(int numA, int numB){
        return  numA % numB == 0;
    }


    /**
     * create three specail numbers.
     * @param maxNum
     * @return
     */
    public List<Integer> createSpecailNum(int maxNum){

        Set<Integer> set = new HashSet<>();
        while (set.size()<3){
            set.add(new Random().nextInt(maxNum));
        }
        return  new LinkedList<>(set);
    }

}
