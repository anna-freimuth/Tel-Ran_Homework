import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        //Thread.currentThread(); link to the main thread, cannot be setDaemon(true)

        Echo echo = new Echo();
        Thread echoThread = new Thread(echo);

        echoThread.setDaemon(true);//forces stop the echo thread, when the main thread completes
        echoThread.start();

       try( BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
           String line;

           while((line = br.readLine())!= null && !line.equals("exit")){
               echo.setMessage(line);
               echoThread.interrupt();  // when we call from main thread echoThread, flag from interrupted true
           }
       }
    }
}
