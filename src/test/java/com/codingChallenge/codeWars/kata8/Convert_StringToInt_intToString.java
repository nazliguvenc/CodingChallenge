package com.codingChallenge.codeWars.kata8;

public class Convert_StringToInt_intToString {

    public static int stringToNumber(String str) {
        // TODO: Convert String into a number
        return Integer.parseInt(str) ;  //  return Integer.valueOf(str);  other solution way
    }


    public static String intToString (int number){
        // TODO: Convert number into a String
        return String.valueOf(number);
    }


    public static void main(String[] args) {

        System.out.println("Result should be 125 = " + (stringToNumber("123")+2) );

        System.out.println("Result should be 1232 = " +(intToString(123)+2) );

    }

}
