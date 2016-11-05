package com.chaos.cupid.client;

/**
 * Created by zcfrank1st on 04/11/2016.
 */
public class Main {
    public static void main(String[] args) {

        new PsycheV2.Builder()
                .setProcessor(new Processor() {
                    @Override
                    public void notify(String message) {
                        System.out.println(message);
                    }
                })
                .setHost("192.168.33.213")
                .setPort(55055)
                .setUniqueId("master123")
                .build();
    }
}
