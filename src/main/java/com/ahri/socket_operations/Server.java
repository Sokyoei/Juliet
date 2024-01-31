package com.ahri.socket_operations;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.Socket;

public class Server {
    private static final Logger logger = LoggerFactory.getLogger(Client.class);

    Socket serverSocket;

    public Server() {
        try {
            serverSocket = new Socket("localhost", 8088);

        } catch (Exception e) {
            logger.error(String.valueOf(e));
        } finally {

        }
    }

    public static void main(String[] args) throws IOException {
        Server server = new Server();
    }
}
