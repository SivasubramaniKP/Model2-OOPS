import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws Exception {
        Socket clientSocket = new Socket("localhost", 3000);
        BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader readFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        BufferedWriter writeToServer = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));

        while (true) {
            System.out.print("Client: ");
            String s = userInput.readLine();

            // Send message to the server
            writeToServer.write(s + "\n"); // Append newline for proper reading
            writeToServer.flush(); // Ensure the message is sent immediately

            // Exit if the user types "Quit"
            if (s.equalsIgnoreCase("Quit")) {
                break;
            }

            // Receive and print server response
            String serverResponse = readFromServer.readLine();
            System.out.println("Server: " + serverResponse);
        }

        // Close resources
        writeToServer.close();
        readFromServer.close();
        userInput.close();
        clientSocket.close();
    }
}
