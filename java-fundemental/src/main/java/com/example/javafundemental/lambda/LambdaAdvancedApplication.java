package com.example.javafundemental.lambda;

import java.util.HashMap;
import java.util.Map;


public class LambdaAdvancedApplication {

    public static Map<String, String> map = new HashMap<>();

    /**
     * This method actually invoke the interface {@link LambdaCommand#execute(Map)},
     * and in lambda expression, the param type symbol the param type in the FunctionInterface.
     * @param args
     */
    public static void main(String[] args) {
        retrieve(command ->{
            command.put("name", "向乔高");
        });
        System.out.println(map);
    }

    public static void retrieve(LambdaCommand command) {
        System.out.println("进入");

        command.execute(map);
    }
    @FunctionalInterface
    public interface LambdaCommand {
        void execute(Map<String,String> map);
    }
}

