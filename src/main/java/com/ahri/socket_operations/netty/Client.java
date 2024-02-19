package com.ahri.socket_operations.netty;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Client {
    private static final Logger logger = LoggerFactory.getLogger(Client.class);
    private final int port;

    Client(int port) {
        this.port = port;
    }

    public void action() {

    }

    public static void main(String[] args) {
        Client client = new Client(2222);
    }
}
