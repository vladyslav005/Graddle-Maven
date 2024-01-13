package org.example;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        Human me = new Human("Vladyslav", "Shevchenko", 18);
        Gson gson = new Gson();
        System.out.println(gson.toJson(me));
    }
}