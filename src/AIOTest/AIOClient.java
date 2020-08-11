package AIOTest;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousSocketChannel;
import java.nio.channels.CompletionHandler;
import java.util.concurrent.TimeUnit;

/**
 * @author: codeJerry
 * @description:
 * @date: 2020/07/12 14:56
 */
public class AIOClient {
    private final AsynchronousSocketChannel client;
    public AIOClient() throws Exception{
        client = AsynchronousSocketChannel.open();
    }

    public void connect(String host, int port) throws Exception {
        client.connect(new InetSocketAddress(host, port), null, new CompletionHandler<Void, Void>() {
            @Override
            public void completed(Void result, Void attachment) {
                try {
                    client.write(ByteBuffer.wrap("Hello, I am a client". getBytes())).get();
                    System.out.println("已发送至服务器");
                    }catch (Exception e){
                        e.printStackTrace();
                    }
            }

            @Override
            public void failed(Throwable exc, Void attachment) {
                exc.printStackTrace();
            }
        });
        final ByteBuffer bb = ByteBuffer.allocate(1024);
        client.read(bb, null, new CompletionHandler<Integer, Object>() {
            @Override
            public void completed(Integer result, Object attachment) {
                System.out.println("I/O操作完成, "+ result);
                System.out.println("获得结果"+ new String(bb.array()));
            }

            @Override
            public void failed(Throwable exc, Object attachment) {
                exc.printStackTrace();
            }
        });

        try {
        TimeUnit.SECONDS.sleep(Integer.MAX_VALUE);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
    }

    public static void main(String[] args) throws Exception {
        new AIOClient().connect("localhost", 8000);
    }
}
