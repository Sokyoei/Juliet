package com.ahri.net.netty;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.logging.LogLevel;
import io.netty.handler.logging.LoggingHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Server {
    private static final Logger logger = LoggerFactory.getLogger(Server.class);
    private final int port;

    public Server(int port) {
        this.port = port;
    }

    /**
     * netty 服务端启动
     */
    public void action() {
        EventLoopGroup bossGroup = new NioEventLoopGroup();
        EventLoopGroup workerGroup = new NioEventLoopGroup();

        try {
            ServerBootstrap serverBootstrap = new ServerBootstrap();

            serverBootstrap.group(bossGroup, workerGroup).channel(NioServerSocketChannel.class)
                           .option(ChannelOption.SO_BACKLOG, 128).childOption(ChannelOption.SO_KEEPALIVE, true)
                           .handler(new LoggingHandler(LogLevel.INFO))
                           .childHandler(new ChannelInitializer<SocketChannel>() {
                               @Override
                               protected void initChannel(SocketChannel socketChannel) {
                                   // socketChannel.pipeline().addLast(new ServerHandle());
                               }


                           });
            System.out.println("Server Start");
            logger.info("netty Server Start");
            ChannelFuture channelFuture = serverBootstrap.bind(port).sync();
            channelFuture.channel().closeFuture().sync();
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            bossGroup.shutdownGracefully();
            workerGroup.shutdownGracefully();
        }
    }

    public static void main(String[] args) {
        Server server = new Server(2222);
    }
}
