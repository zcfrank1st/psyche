package com.chaos.cupid.client;

import io.vertx.core.Vertx;
import io.vertx.core.buffer.Buffer;
import io.vertx.core.datagram.DatagramSocket;
import io.vertx.core.datagram.DatagramSocketOptions;
import org.apache.http.client.fluent.Request;
import org.inferred.freebuilder.FreeBuilder;

import java.io.IOException;
import java.util.function.Consumer;

/**
 * Created by zcfrank1st on 04/11/2016.
 */
//@FreeBuilder
public interface Psyche {
    String getHost();
    Integer getPort();
    String getUniqueId();
    Consumer<String> getConsumer();

    class Builder extends Psyche_Builder {
        void notifyMessage(String host, int port, DatagramSocket socket, Buffer buffer, Consumer<String> notify) {
            socket.send(buffer, port, host, asyncResult -> {
                if (asyncResult.succeeded()) {
                    socket.handler(packet -> notify.accept(packet.data().toString("UTF-8")));
                }
            });
        }

        @Override public Psyche build() {
            Psyche psyche = super.build();

            Vertx vertx = Vertx.vertx();
            DatagramSocket socket = vertx.createDatagramSocket(new DatagramSocketOptions());
            Buffer buffer = Buffer.buffer(psyche.getUniqueId());
            Consumer<String> notify = psyche.getConsumer();

            new Thread(() -> {
                while (true) {
                    notifyMessage(psyche.getHost(), psyche.getPort(), socket, buffer, notify);
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }).run();

            new Thread(() -> {
                try {
                    Thread.sleep(10000L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                try {
                    // FIXME 9009 hardcode
                    Request.Get("http://" + psyche.getHost() + ":9009/pull/" + psyche.getUniqueId()).execute();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }).run();

            return psyche;
        }
    }
}