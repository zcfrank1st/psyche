package com.chaos.cupid.client;

import java.util.function.Consumer;

/**
 * Created by zcfrank1st on 04/11/2016.
 */
public class Main {
    public static void main(String[] args) {
        Consumer<String> printIt = System.out::println;

        new Psyche.Builder()
                .setConsumer(printIt)
                .setHost("192.168.33.213")
                .setPort(55055)
                .setUniqueId("master123")
                .build();
    }
}
