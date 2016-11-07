package com.chaos.cupid.client;


import org.inferred.freebuilder.FreeBuilder;
import org.vertx.java.core.AsyncResult;
import org.vertx.java.core.AsyncResultHandler;
import org.vertx.java.core.Handler;
import org.vertx.java.core.Vertx;
import org.vertx.java.core.buffer.Buffer;
import org.vertx.java.core.datagram.DatagramPacket;
import org.vertx.java.core.datagram.DatagramSocket;
import org.vertx.java.core.datagram.InternetProtocolFamily;
import org.vertx.java.core.impl.DefaultVertx;

/**
 * Created by zcfrank1st on 05/11/2016.
 */
//@FreeBuilder
public class PsycheV2 {
    private String host;
    private Integer port;
    private String uniqueId;
    private Processor processor;

    public String getHost() {
        return host;
    }


    public Integer getPort() {
        return port;
    }


    public String getUniqueId() {
        return uniqueId;
    }

    public Processor getProcessor() {
        return processor;
    }

    private PsycheV2(Builder b) {
        host = b.host;
        port = b.port;
        uniqueId = b.uniqueId;
        processor = b.processor;
    }

    public static class Builder  {
        private String host;
        private Integer port;
        private String uniqueId;
        private Processor processor;

        private void notifyMessage(String host, int port, final DatagramSocket socket, final Buffer buffer, final Processor processor) {
            socket.send(buffer, host, port, new AsyncResultHandler<DatagramSocket>() {
                            public void handle(AsyncResult<DatagramSocket> asyncResult) {
                                socket.dataHandler(new Handler<DatagramPacket>() {
                                    public void handle(DatagramPacket packet) {
                                        processor.notify(packet.data().toString("UTF-8"));
                                    }
                                });
                            }
                        });
        }

        public Builder setHost(String host) {
            this.host = host;
            return this;
        }

        public Builder setPort(Integer port) {
            this.port = port;
            return this;
        }

        public Builder setUniqueId(String id) {
            this.uniqueId = id;
            return this;
        }

        public Builder setProcessor(Processor processor) {
            this.processor = processor;
            return this;
        }

        public PsycheV2 build() {
            final PsycheV2 psyche = new PsycheV2(this);

            Vertx vertx = new DefaultVertx();

            final DatagramSocket socket = vertx.createDatagramSocket(InternetProtocolFamily.IPv4);
            final Buffer buffer = new Buffer(psyche.getUniqueId());
            final Processor processor = psyche.getProcessor();

            new Thread(new Runnable() {
                @Override
                public void run() {
                    while (true) {
                        notifyMessage(psyche.getHost(), psyche.getPort(), socket, buffer, processor);
                        try {
                            Thread.sleep(5000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }).run();

            return psyche;
        }
    }
}
