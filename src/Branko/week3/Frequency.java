package Branko.week3;

import java.util.HashMap;
import java.util.Map;

public class Frequency {
    /*
    2) Number - Reverse negative number
Write a return method that can reverse negative number and return it as int
     */

    public static void uniqueCharacters(String test){
        String temp = "";
        for (int i = 0; i < test.length(); i++){
            char current = test.charAt(i);
            if (temp.indexOf(current) < 0){
                temp = temp + current;
            } else {
                temp = temp.replace(String.valueOf(current), "");
            }
        }

        System.out.println(temp + " ");

    }}