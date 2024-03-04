package com.example.javafundemental.lambda;


import java.util.List;

public class StreamLearn {
    public static void main(String[] args) {
        List<String> list = List.of("1", "2");
        boolean b = list.stream().anyMatch(s -> s.getBytes().length > 1);
        System.out.println("result:"+b);
    }
}
