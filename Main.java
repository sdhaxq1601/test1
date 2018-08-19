import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.Date;

public class Main {
    private static final int PORT = 9999;
    private List<Socket> mList = new ArrayList<Socket>();
    private ServerSocket server = null;
    private ExecutorService mExecutorService = null; // thread pool

    public static void main(String[] args) {
        try {
            ServerSocket server = null;
            System.out.println("Start!"+new Date().toString());
            server = new ServerSocket(PORT);
            Socket cl = server.accept();
            BufferedReader in = null;
            in=new BufferedReader(new InputStreamReader(cl.getInputStream()));
            System.out.println(in.readLine());
            cl.close();
            server.close();
            System.out.println("End!"+new Date().toString()); 
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}