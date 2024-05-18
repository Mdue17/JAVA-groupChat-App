//package tests;
//
//import apk.Client;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.mockito.Mock;
//import org.mockito.MockitoAnnotations;
//
//import java.io.BufferedWriter;
//import java.io.IOException;
//import java.net.Socket;
//
//import static org.mockito.Mockito.*;
//
//public class ClientTest {
//
//    @Mock
//    private Socket socket;
//
//    @Mock
//    private BufferedWriter bufferedWriter;
//
//    private Client client;
//
//    @BeforeEach
//    public void setup() {
//        MockitoAnnotations.openMocks(this);
//        client = new Client(socket, "testUser");
//        client.setBufferedWriter(bufferedWriter);
//    }
//
//    @Test
//    public void testSendMessage() throws IOException {
//        client.sendMessage("test message");
//        verify(bufferedWriter, times(1)).write("testUser: test message");
//        verify(bufferedWriter, times(1)).newLine();
//        verify(bufferedWriter, times(1)).flush();
//    }
//}
