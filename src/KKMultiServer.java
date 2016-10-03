import java.net.*;
import java.io.*;
 
public class KKMultiServer {
    public static void main(String[] args) throws IOException {
        
    /*    
    if (args.length != 1) {
        System.err.println("Usage: java KKMultiServer <port number>");
        System.exit(1);
    }
     
    */
        String puerto ="8080";
 
        int portNumber = Integer.parseInt(puerto);
        boolean listening = true;
         
        try (ServerSocket serverSocket = new ServerSocket(portNumber)) { 
            while (listening) {
                new KKMultiServerThread(serverSocket.accept()).start();
            }
        } catch (IOException e) {
            System.err.println("Could not listen on port " + portNumber);
            System.exit(-1);
        }
    }
}
