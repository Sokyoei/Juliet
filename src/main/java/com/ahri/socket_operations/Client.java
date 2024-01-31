package com.ahri.socket_operations;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.net.Socket;

public class Client {
    private static final Logger logger = LoggerFactory.getLogger(Client.class);
    Socket clientSocket;

    public Client() {
        try {
            clientSocket = new Socket("localhost", 8088);
            OutputStream os = clientSocket.getOutputStream();
            PrintWriter pw = new PrintWriter(os);
            pw.write("客户端发送消息");
            pw.flush();

            clientSocket.shutdownOutput();

            InputStream is = clientSocket.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String info;
            while ((info = br.readLine()) != null) {
                System.out.println("我是客户端，服务器返回信息：" + info);
            }
            br.close();
            is.close();
            os.close();
            pw.close();
        } catch (Exception e) {
            logger.error(String.valueOf(e));
        } finally {

        }
    }

    public static void main(String[] args) throws IOException {
        Client client = new Client();
    }
}
