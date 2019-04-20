package com.thoughtworks.tdd;

import java.util.*;

/***
 * author:LP
 * time:2019.04.20
 */
public class FizzBuzz {

    private List<Integer> specailNums = null;
    private  SpecailNumberCreator specailNumberCreator = null;

    public FizzBuzz(SpecailNumberCreator specailNumberCreator,int humenNumber){
        this.specailNumberCreator = specailNumberCreator;
        this.specailNums = specailNumberCreator.createSpecailNum(humenNumber,3);
    }

    /**
     * wether a is the times of b.
     * @param numA
     * @param numB
     * @return
     */
    public static int isTimes(int numA, int numB){
        return  numA % numB == 0 ? 1: 0;
    }



    /**
     * get a fizzBuzzResult
     * @param num
     * @return
     */
    public String getFizzBuzzResult(int num){
        int code = 0; //111
//        specailNums.forEach(snum->System.out.println(snum));
        for(int i=0;i<3;i++) {
            code = code | (this.isTimes(num, specailNums.get(i)) * (1<<i));
        }
        return  code2ResultString(code,num);
    }

    /**
     * code to return String
     * @param code
     * @param num
     * @return
     */
    public static String code2ResultString(int code,int num){
        switch (code){
            case 1: //001
                return  "Fizz";
            case 2://010
                return  "Buzz";
            case 4://100
                return "Whizz";
            case 3 ://011
            case 5://101
            case 6://110
                return "FizzBuzz";
            case 7://111
                return "FizzBuzzWhizz";
            default://000
                 return String.valueOf(num);
        }
    }

}
