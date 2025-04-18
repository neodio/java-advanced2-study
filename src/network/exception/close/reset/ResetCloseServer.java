package network.exception.close.reset;

import static util.MyLogger.log;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ResetCloseServer {

    public static void main(String[] args) throws IOException, InterruptedException {
        ServerSocket serverSocket = new ServerSocket(12345);
        Socket socket = serverSocket.accept();
        log("소캣 연결: " + socket);

        socket.close();
        serverSocket.close();
        log("소캣 종료");
    }
}
