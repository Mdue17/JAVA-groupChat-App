package apk;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    private ServerSocket serverSocket;

    public Server(ServerSocket serverSocket) {
        this.serverSocket = serverSocket;
    }

    public void startServer() {
        // Start the server

        try {
            while(!serverSocket.isClosed()) {

                Socket socket = serverSocket.accept();
                System.out.println("A new client has connected!");
                ClientHandler clientHandler = new ClientHandler(socket);

                Thread thread = new Thread(clientHandler);
                thread.start();
            }
        } catch (IOException e) {
        }
    }
    public void closeServerSocket(){
        try{
            if (serverSocket != null){
                serverSocket.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        try {
            ServerSocket serverSocket = new ServerSocket(1234);
            Server server = new Server(serverSocket);
            server.startServer();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
