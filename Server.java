// import java.io.BufferedReader;
// import java.io.BufferedWriter;
// import java.io.InputStreamReader;
// import java.io.OutputStreamWriter;
// import java.net.ServerSocket;
// import java.net.Socket;

// public class Server {
//     public static void main(String[] args) throws Exception {
//         ServerSocket serverSocket = new ServerSocket(3000);
//         BufferedReader userInput = new BufferedReader( new InputStreamReader(System.in));
        
//         while ( true ) {
//             Socket socket = serverSocket.accept();
//             BufferedReader readFromClient = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//             BufferedWriter writeToClient = new BufferedWriter( new OutputStreamWriter(socket.getOutputStream()));

//             String clientText = readFromClient.readLine();
//             System.out.println("Client :" + clientText);
//             System.out.print("Server :");
//             String s = userInput.readLine();
//             if ( s.equalsIgnoreCase("quit") == true ) break;
//             writeToClient.write(s);

            
//         }
        
//         serverSocket.close();
//         userInput.close();
        


//     }
// }
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(3000);

        System.out.println("Server is running...");

        while ( true ) {
            try ( Socket s = serverSocket.accept(); BufferedReader readFromClient = new BufferedReader( new InputStreamReader(s.getInputStream()));
                BufferedWriter writeToClient = new BufferedWriter( new OutputStreamWriter(s.getOutputStream()) );
            ) {
                System.out.println("Client Connected");
                while (true) {
                    String textFromClient = readFromClient.readLine();
                    System.out.println("Client :" + textFromClient);
                    System.out.println("Server");
                    BufferedReader userinput = new BufferedReader(new InputStreamReader(System.in));
                    String string = userinput.readLine();
                    writeToClient.write(string + "\n");
                    writeToClient.flush();
                    if ( string.equalsIgnoreCase("Quit") ) {
                        serverSocket.close();
                        return;
                    }
                }
            }  catch (Exception e) {   
                e.printStackTrace();
            }   
        }
    }
}
