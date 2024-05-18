//package tests;
//
//import org.junit.jupiter.api.Test;
//
//import java.net.Socket;
//
//import static org.junit.Assert.assertTrue;
//import static org.junit.jupiter.api.Assertions.assertTrue;
//
//class ClientHandler {
//
//    @Test
//    void testClientHandler() {
//        // Given
//        Socket socket = new Socket();
//        ClientHandler clientHandler = new ClientHandler(socket);
//        Thread thread = new Thread(String.valueOf(clientHandler));
//
//        // When
//        thread.start();
//
//        // Then
//        assertTrue(thread.isAlive());
//    }
//}
