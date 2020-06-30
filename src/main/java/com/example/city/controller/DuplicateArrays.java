package com.example.city.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class DuplicateArrays {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,4,2,5,6,7,8,9};


        Map<Integer, Integer> map = new HashMap<>();

        Arrays.stream(
                arr
        ).forEach(
                e -> map.compute(
                        e, (k ,v) -> v!=null?1:v+1
                )
        );

        System.out.println(map);
        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
        }

        for (Map.Entry entry: map.entrySet()){
            int a = (Integer) entry.getValue();
           // if(a>1)
          //  System.out.println(entry.getKey() +" -> "+entry.getValue());
        }
        // n

        //1 1 1 2 2 3 4 5 5 5
        int[] temp = new int[arr.length];
        for (int i = 0; i < arr.length -1; i++) {
           //if(temp[arr[i]])
        }

    }
}
