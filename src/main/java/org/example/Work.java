package org.example;

import java.util.*;

public class Work {
    public static void main(String[] args) {
        taskOne();
        taskTwo();
    }

    public static void taskOne(){
        String[] strings = {"Hello","Hola","Hi","Sasha","Hi","Alex","Hola","George","Alex","Night"};
        Map<String,Integer> map = new HashMap();
        for (String string : strings) {
            map.put(string,map.getOrDefault(string,0) + 1);
        }
        System.out.println(map);
        System.out.println("-----------------------------------------------------------");
        
        Set<String> stringSet = new HashSet<>(Arrays.asList(strings));
        System.out.println(stringSet);
        System.out.println("-----------------------------------------------------------");

    }

    public static void taskTwo(){
        Map<String,List<String>> name = new LinkedHashMap<>();
        List<String> phone = new ArrayList<>();
        phone.add("8-999-888-77-66");
        phone.add("8-999-777-66-55");
        name.put("Petr",phone);

        System.out.println(name.get("Petr"));
    }

}

